package com.young.test2.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.young.test2.home.data.CompanyList
import com.young.test2.home.data.ExpertList
import com.young.test2.home.data.HomeRecyclerItem
import com.young.test2.repository.RemoteDataSourceImpl
import kotlin.collections.ArrayList

class HomeFragmentViewModel: ViewModel(){
    private val repository = RemoteDataSourceImpl()
    private var _homeItemList: MutableLiveData<ArrayList<HomeRecyclerItem>> =
        MutableLiveData(arrayListOf())
    val homeItemList: LiveData<ArrayList<HomeRecyclerItem>> get() = _homeItemList

    init {
        repository.getHomeList(
            onResponse = {
                if (it.isSuccessful) {
                    val body = it.body()!!

                    val expertPosition = body.expertListPosition
                    val companyPosition = body.companyListPosition

                    val consultList = body.consultList
                    val expertList = ExpertList(body.expertList)
                    val companyList = CompanyList(body.companyList)

                    val resultList = arrayListOf<HomeRecyclerItem>()
                    var index = 0
                    for (consult in consultList!!) {
                        if (index == expertPosition) {
                            resultList.add(expertList)
                            index++
                        } else if (index == companyPosition) {
                            resultList.add(companyList)
                            index++
                        }
                        consult.dateToString()
                        resultList.add(consult)
                        index++
                    }
                    _homeItemList.value = resultList
                }
            },
            onFailure = {
                Log.e("HomeFragment", it.toString())
            }
        )
    }
}
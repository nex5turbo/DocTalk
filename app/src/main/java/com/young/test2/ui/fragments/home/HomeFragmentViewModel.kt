package com.young.test2.ui.fragments.home

import android.util.Log
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.young.test2.data.CompanyList
import com.young.test2.data.ExpertList
import com.young.test2.data.HomeRecyclerItem
import com.young.test2.repository.RemoteDataSourceImpl
import kotlin.collections.ArrayList

class HomeFragmentViewModel: ViewModel(){
    private val repository = RemoteDataSourceImpl()

    private var _homeItemList: MutableLiveData<ArrayList<HomeRecyclerItem>> =
        MutableLiveData(arrayListOf())
    val homeItemList: LiveData<ArrayList<HomeRecyclerItem>> get() = _homeItemList

    private var _pbVisibility: MutableLiveData<Int> = MutableLiveData(View.INVISIBLE)
    val pbVisibility: LiveData<Int> get() = _pbVisibility

    init {
        getList()
    }

    fun getList(){
        _pbVisibility.value = View.VISIBLE
        repository.getHomeList(
            onResponse = {
                _homeItemList.value = it
                _pbVisibility.value = View.INVISIBLE
            },
            onFailure = {
                Log.e("HomeFragment", it.toString())
                _pbVisibility.value = View.INVISIBLE
            }
        )
    }
}
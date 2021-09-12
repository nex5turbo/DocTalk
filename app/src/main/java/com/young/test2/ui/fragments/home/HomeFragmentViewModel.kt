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

    private var _noResultVisibility: MutableLiveData<Int> = MutableLiveData(View.INVISIBLE)
    val noResultVisibility: LiveData<Int> get() = _noResultVisibility

    private var _errorVisibility: MutableLiveData<Int> = MutableLiveData(View.INVISIBLE)
    val errorVisibility: LiveData<Int> get() = _errorVisibility

    init {
        getList()
    }

    fun getList(){
        _homeItemList.value!!.clear()
        _pbVisibility.value = View.VISIBLE
        _noResultVisibility.value = View.INVISIBLE
        _errorVisibility.value = View.INVISIBLE

        repository.getHomeList(
            onResponse = {
                _homeItemList.value = it
                if (it.isEmpty()) {
                    _noResultVisibility.value = View.VISIBLE
                }
                _pbVisibility.value = View.INVISIBLE
            },
            onFailure = {
                Log.e("HomeFragment", it.toString())
                _homeItemList.value = arrayListOf()
                _errorVisibility.value = View.VISIBLE
                _pbVisibility.value = View.INVISIBLE
            }
        )
    }
}
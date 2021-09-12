package com.young.test2.ui.fragments

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.young.test2.data.HomeRecyclerItem

abstract class BaseFragmentViewModel: ViewModel() {
    protected var _pbVisibility: MutableLiveData<Int> = MutableLiveData(View.INVISIBLE)
    val pbVisibility: LiveData<Int> get() = _pbVisibility

    protected var _noResultVisibility: MutableLiveData<Int> = MutableLiveData(View.INVISIBLE)
    val noResultVisibility: LiveData<Int> get() = _noResultVisibility

    protected var _errorVisibility: MutableLiveData<Int> = MutableLiveData(View.INVISIBLE)
    val errorVisibility: LiveData<Int> get() = _errorVisibility
}
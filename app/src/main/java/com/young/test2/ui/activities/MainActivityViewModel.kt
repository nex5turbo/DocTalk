package com.young.test2.ui.activities

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {

    private var _toolbarText: MutableLiveData<String> = MutableLiveData("홈")
    val toolbarText: LiveData<String> get() = _toolbarText

    fun setTitle(title: String) {
        _toolbarText.value = title
    }
}
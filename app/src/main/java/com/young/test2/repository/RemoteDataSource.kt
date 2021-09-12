package com.young.test2.repository

import com.young.test2.data.HomeRecyclerItem
import com.young.test2.data.ResponseHome
import retrofit2.Response

interface RemoteDataSource {
    fun getHomeList(onResponse: (ArrayList<HomeRecyclerItem>) -> Unit,
                    onFailure: (Throwable) -> Unit)
}
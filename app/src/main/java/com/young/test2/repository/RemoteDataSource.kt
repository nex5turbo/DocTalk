package com.young.test2.repository

import com.young.test2.home.data.ResponseHome
import retrofit2.Response

interface RemoteDataSource {
    fun getHomeList(onResponse: (Response<ResponseHome>) -> Unit,
                    onFailure: (Throwable) -> Unit)
}
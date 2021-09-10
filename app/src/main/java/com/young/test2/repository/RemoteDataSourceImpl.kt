package com.young.test2.repository

import com.young.test2.home.data.ResponseHome
import com.young.test2.home.retrofit.HomeApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RemoteDataSourceImpl: RemoteDataSource {
    override fun getHomeList(
        onResponse: (Response<ResponseHome>) -> Unit,
        onFailure: (Throwable) -> Unit
    ) {
        HomeApi.getHomeService().getHomeList().enqueue(object : Callback<ResponseHome> {
            override fun onResponse(call: Call<ResponseHome>, response: Response<ResponseHome>) {
                onResponse(response)
            }

            override fun onFailure(call: Call<ResponseHome>, t: Throwable) {
                onFailure(t)
            }
        })
    }
}
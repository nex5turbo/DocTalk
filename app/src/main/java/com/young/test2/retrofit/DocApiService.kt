package com.young.test2.retrofit

import com.young.test2.data.ResponseHome
import retrofit2.Call
import retrofit2.http.GET

interface DocApiService {
    @GET("home.json")
    fun getHomeList(): Call<ResponseHome>
}
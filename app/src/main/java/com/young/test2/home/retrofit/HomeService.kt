package com.young.test2.home.retrofit

import com.young.test2.home.data.ResponseHome
import retrofit2.Call
import retrofit2.http.GET

interface HomeService {
    @GET("home.json")
    fun getHomeList(): Call<ResponseHome>
}
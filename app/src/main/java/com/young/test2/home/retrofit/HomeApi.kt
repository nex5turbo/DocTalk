package com.young.test2.home.retrofit

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://docfriends.github.io/Docfriends_Android_Recruit/api/"

object HomeApi {
    private var _instance: Retrofit? = null
    private val gson = GsonBuilder()
        .setLenient()
        .create()
    fun getInstance(): Retrofit{
        if (_instance == null) {
            _instance = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(BASE_URL)
                .build()
        }
        return _instance!!
    }
}
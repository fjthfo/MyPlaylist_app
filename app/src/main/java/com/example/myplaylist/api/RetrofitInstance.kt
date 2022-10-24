package com.example.myplaylist.api

import com.example.myplaylist.util.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.simplexml.SimpleXmlConverterFactory


object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(SimpleXmlConverterFactory.create())
            .build()
    }
    val api : ManiaDbApi by lazy {
        retrofit.create(ManiaDbApi::class.java)
    }
}
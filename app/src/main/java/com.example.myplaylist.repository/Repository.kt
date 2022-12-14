package com.example.myplaylist.repository

import android.content.Context
import com.example.myplaylist.api.RetrofitInstance
import com.example.myplaylist.model.ManiaAlbumResponse
import com.example.myplaylist.model.ManiaDBClientResponse

import retrofit2.Response

class Repository private constructor(context: Context){

    suspend fun getSong(keyword: String) : Response<ManiaDBClientResponse>{
        return RetrofitInstance.api.getSong(keyword)
    }
    suspend fun getAlbum(keyword: String) : Response<ManiaAlbumResponse>{
        return RetrofitInstance.api.getAlbum(keyword)
    }

    // 싱글톤
    companion object {
        private var INSTANCE: Repository? = null

        fun initialize(context: Context) {
            if (INSTANCE == null) {
                INSTANCE = Repository(context)
            }
        }

        fun get(): Repository {
            return INSTANCE ?:
            throw IllegalStateException("Repository must be initialized")
        }
    }
}
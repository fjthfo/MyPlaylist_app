package com.example.myplaylist.api

import com.example.myplaylist.model.ManiaAlbumResponse
import com.example.myplaylist.model.ManiaDBClientResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ManiaDbApi {

    // key => 본인의 이메일 사용.
    @GET("{keyword}/?sr=song&display=10&key=example&v=0.5")
    suspend fun getSong(@Path("keyword") keyword: String) : Response<ManiaDBClientResponse>

    // key => 본인의 이메일 사용.
    @GET("{keyword}/?sr=album&display=10&key=example&v=0.5")
    suspend fun getAlbum(@Path("keyword") keyword: String) : Response<ManiaAlbumResponse>
}
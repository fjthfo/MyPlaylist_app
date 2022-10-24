//package com.example.myplaylist.api;
//
//import androidx.annotation.Nullable;
//
//import com.example.myplaylist.model.ManiaAlbumResponse;
//import com.example.myplaylist.model.ManiaDBClientResponse;
//
//import retrofit2.Response;
//import retrofit2.http.GET;
//import retrofit2.http.Path;
//
//
//interface ManiaDbApi {
//
//    @Nullable
//    @GET("{keyword}/?sr=song&display=10&key=example&v=0.5")
//    Response<ManiaDBClientResponse> getSong(@Path("keyword") String keyword);
//
//    @Nullable
//    @GET("{keyword}/?sr=song&display=10&key=example&v=0.5")
//    Response<ManiaAlbumResponse> getAlbum(@Path("keyword") String keyword);
//
//}
//
//
//
//
////    SelectAPI select = retrofitClient.create(SelectAPI.class);
////    InsertAPI insert = retrofitClient.create(InsertAPI.class);
////    UpdateAPI update = retrofitClient.create(UpdateAPI.class);
////    DeleteAPI delete = retrofitClient.create(DeleteAPI.class);
//
//
////    val api : ManiaDbApi by lazy {
////        retrofit.create(ManiaDbApi::class.java)
////        }
//
//
//
////
////interface SelectAPI{
////    @GET("select/{id}")
////    Call<Member> selectOne(@Path("id") long id);
////
////    @GET("select")
////    Call<List<Member>> selectAll();
////}
////interface InsertAPI{
////    @POST("insert")
////    Call<Member> insertOne(@Body Map<String, String> map);
////}
////
////interface UpdateAPI{
////    @POST("update/{id}")
////    Call<Member> updateOne(@Path("id") long id, @Body Map<String, String> map);
////}
////
////interface DeleteAPI{
////    @POST("delete/{id}")
////    Call<ResponseBody> deleteOne(@Path("id") long id);
////}
//

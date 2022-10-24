//package com.example.myplaylist.api;
//
//import retrofit2.Retrofit;
//import retrofit2.converter.simplexml.SimpleXmlConverterFactory;
//
//public class RetrofitClient {
//    public static ManiaDbApi api;
//    private final String BASE_URL = "http://www.maniadb.com/api/search/"; // TODO REST API 퍼블릭 IP로 변경
//    private static Retrofit retrofit;
//    private static RetrofitClient instance = null;
//
//    private RetrofitClient() { //constructor
//        retrofit = new Retrofit.Builder()
//                .baseUrl(BASE_URL)
////                .client(new OkHttpClient.Builder().build())
//                .addConverterFactory(SimpleXmlConverterFactory.create())
//                .build();
//    }
//
//    public static RetrofitClient getInstance() {
//        if (instance == null) {
//            instance = new RetrofitClient();
//        }
//        return instance;
//    }
//
////    ManiaDbApi api() { //defining api function
////        return retrofit.create(ManiaDbApi.class);
////    }
//
//    public static ManiaDbApi api() {
//        return retrofit.create(ManiaDbApi.class);
//    }
//
//
//}
////    public static synchronized ManiaDbApi getApi() {
////        if (api == null) {
////            api = new ManiaDbApi() {
////                @Nullable
////                @Override
////                public Response<ManiaDBClientResponse> getSong(String keyword) {
////                    return null;
////                }
////
////                @Nullable
////                @Override
////                public Response<ManiaDBClientResponse> getAlbum(String keyword) {
////                    return null;
////                }
////            };
////        }
////        return api;
////    }
//
//
//
////    public api getapi() { //defining api function
////        return retrofit.create(ManiaDbApi.class);
////    }
//
////    @NotNull
////    public final ManiaDbApi getApi() {
////        return (ManiaDbApi)api.getValue();
////    }
//
//
//
////    public ManiaDbApi api() { //defining api function
////        return retrofit.create(ManiaDbApi.class);
////    }
//
//
//    //    public static Repository api;
//
//
////    Retrofit retrofit =
////            new Retrofit.Builder()
////                    .baseUrl(BASE_URL)
////                    .client(new OkHttpClient.Builder().build())
////                    .addConverterFactory(SimpleXmlConverterFactory.create())
////                    .build();
//
//
//
//
////    public api getapi() { //defining api function
////        return retrofit.create(api.class);
////    }
//
//
////    ManiaDbApi api = retrofit.create(ManiaDbApi.class);
////
////    val api : ManiaDbApi by lazy {
////        retrofit.create(ManiaDbApi::class.java)
////        }

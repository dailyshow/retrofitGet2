package com.example.retrofitpractice4;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface JsonPlaceHolderApi {

    /* userId 에 해당하는 값만 받아오도록 하는 부분
    @GET("posts")
    Call<List<Post>> getPost(@Query("userId") int userId);
    */

    /* userId 를 출력하고 정렬 방식을 조정하는 부분
    @GET("posts")
    Call<List<Post>> getPost(@Query("userId") int userId, @Query("_sort") String sort, @Query("_order") String desc);
    */

    /* 여러개의 userId를 지정해서 해당하는 userId 값을 받을 수 있도록 하는 부분
        여기서도 _sort 와 _order를 이용하면 정렬을 할 수 있다.
    @GET("posts")
    Call<List<Post>> getPost(@Query("userId") int userId, @Query("userId") int userId2, @Query("userId") int userId3);
    */

    /* 여러개의 userId를 배열로 지정해서 해당하는 userId 값을 받을 수 있도록 하는 부분
        여기서도 _sort 와 _order를 이용하면 정렬을 할 수 있다.
    @GET("posts")
    Call<List<Post>> getPost(@Query("userId") Integer[] userId);
    */

    /* Map 을 이용해서 userId를 지정받도록 하는 부분 */
    @GET("posts")
    Call<List<Post>> getPost(@QueryMap Map<String, String> parameter);
}

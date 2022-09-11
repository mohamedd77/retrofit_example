package com.example.sea;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Api_interface {
    @GET("posts{id}")
    public Call<Post> getpost(@Path("id")int postId);
    @POST("posts")
    public Call<Post>storepost(@Body HashMap<Object,Object> map);

}

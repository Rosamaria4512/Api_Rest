package com.rosa.my_api_1.Interfaces;

import com.rosa.my_api_1.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface PostService {

    @GET("/posts")

    Call< List<Post> > getPost();


}


package com.hiltexample.limelive_mobile_coding.network

import com.hiltexample.limelive_mobile_coding.model.Posts
import retrofit2.http.GET

interface PostAPI {

    @GET(value = "r/travel/top.json")
    suspend fun getPostsData() : Posts

}
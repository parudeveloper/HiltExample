package com.hiltexample.limelive_mobile_coding.repository

import android.util.Log
import com.hiltexample.limelive_mobile_coding.data.Resource
import com.hiltexample.limelive_mobile_coding.model.Posts
import com.hiltexample.limelive_mobile_coding.network.PostAPI
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class PostsRepository @Inject constructor(private val apiService: PostAPI) {

    val posts : Flow<Resource<Posts>> = flow {
        val postsData = apiService.getPostsData()
        Log.i("LimeMainActivitya",postsData.toString())
        emit(Resource.Success(postsData))
    }
}
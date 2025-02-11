package com.hiltexample.limelive_mobile_coding.di

import com.hiltexample.limelive_mobile_coding.network.PostAPI
import com.hiltexample.limelive_mobile_coding.util.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun providePostsDataApi(): PostAPI {
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
            .create(PostAPI::class.java)

    }
}
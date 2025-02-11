package com.hiltexample.hilt_example_constructor_injection

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetWorkModule {

    @Provides
    @Singleton
    fun provideNetWorkService(): NetWorkService {
        return NetWorkService()
    }


    @Provides
    @Singleton
    fun provideApplicationService(): ApplicationService {
        return ApplicationService(provideNetWorkService())
    }
}
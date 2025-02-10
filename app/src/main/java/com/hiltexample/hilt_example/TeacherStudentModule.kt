package com.hiltexample.hilt_example

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

// this is the module class where we can mention all the dependencies here
@Module
@InstallIn(SingletonComponent::class)
object TeacherStudentModule {

    @Provides
    @Singleton
    fun provideStudentObj() = Student()


    @Provides
    @Singleton
    fun provideStudentMarks() = StudentMarks()

}
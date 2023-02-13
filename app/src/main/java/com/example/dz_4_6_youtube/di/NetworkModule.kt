package com.example.dz_4_6_youtube.di

import com.example.dz_4_6_youtube.data.remote.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofitClient() = RetrofitClient()

    @Singleton
    @Provides
    fun providePopularVideoApiService(retrofitClient: RetrofitClient) = retrofitClient.providePopularVideoApiService()
}
package com.example.dz_4_6_youtube.data.remote.apiservices

import com.example.dz_4_6_youtube.data.models.PopularVideo
import com.example.dz_4_6_youtube.data.models.VideoResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface PopularVideoApiService {

    @GET("videos")
    suspend fun fetchPopularVideos(
        @Query("regionCode") regionCode: String,
        @Query("chart") chart: String,
        @Query("part") part: String,
        @Query("pageToken") nextPageToken : String
    ): VideoResponse<PopularVideo>
}
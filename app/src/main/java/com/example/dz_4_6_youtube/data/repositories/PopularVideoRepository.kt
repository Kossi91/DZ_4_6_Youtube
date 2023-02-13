package com.example.dz_4_6_youtube.data.repositories

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.example.dz_4_6_youtube.base.BaseRepository
import com.example.dz_4_6_youtube.data.remote.apiservices.PopularVideoApiService
import com.example.dz_4_6_youtube.data.remote.pagingsources.PopularVideoPagingSource
import javax.inject.Inject

class PopularVideoRepository @Inject constructor(private val service: PopularVideoApiService) :
    BaseRepository() {

    fun fetchPopularVideos(regionCode: String, chart: String, part: String) =
        Pager(PagingConfig(pageSize = 10, enablePlaceholders = false)) {
            PopularVideoPagingSource(service, regionCode, chart, part)
        }.liveData
}
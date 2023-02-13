package com.example.dz_4_6_youtube.ui.fragments

import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.example.dz_4_6_youtube.base.BaseViewModel
import com.example.dz_4_6_youtube.data.repositories.PopularVideoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val repository: PopularVideoRepository) :
    BaseViewModel() {

    fun fetchPopularVideos(regionCode: String, chart: String, part: String) =
        repository.fetchPopularVideos(regionCode, chart, part).cachedIn(viewModelScope)
}
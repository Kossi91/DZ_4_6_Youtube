package com.example.dz_4_6_youtube.data.models

import com.google.gson.annotations.SerializedName

data class TagSuggestionsItem(
    @SerializedName("tag")
    val tag: String = "",
    @SerializedName("categoryRestricts")
    val categoryRestricts: List<String>?
)
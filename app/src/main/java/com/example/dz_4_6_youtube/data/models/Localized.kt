package com.example.dz_4_6_youtube.data.models

import com.google.gson.annotations.SerializedName

data class Localized(
    @SerializedName("description")
    val description: String = "",
    @SerializedName("title")
    val title: String = ""
)
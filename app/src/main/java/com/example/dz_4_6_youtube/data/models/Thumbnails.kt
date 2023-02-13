package com.example.dz_4_6_youtube.data.models

import com.google.gson.annotations.SerializedName

data class Thumbnails(
    @SerializedName("standard")
    val standard: Standard,
    @SerializedName("default")
    val default: Default,
    @SerializedName("high")
    val high: High,
    @SerializedName("maxres")
    val maxres: Maxres,
    @SerializedName("medium")
    val medium: Medium
)
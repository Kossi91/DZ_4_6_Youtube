package com.example.dz_4_6_youtube.data.models

import com.google.gson.annotations.SerializedName

data class AudioStreamsItem(
    @SerializedName("channelCount")
    val channelCount: String = "",
    @SerializedName("codec")
    val codec: String = "",
    @SerializedName("vendor")
    val vendor: String = "",
    @SerializedName("bitrateBps")
    val bitrateBps: String = ""
)
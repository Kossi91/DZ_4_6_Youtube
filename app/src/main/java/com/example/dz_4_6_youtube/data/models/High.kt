package com.example.dz_4_6_youtube.data.models

import com.google.gson.annotations.SerializedName

data class High(@SerializedName("width")
                val width: Int,
                @SerializedName("url")
                val url: String,
                @SerializedName("height")
                val height: Int = 0)
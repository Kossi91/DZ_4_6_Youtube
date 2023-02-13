package com.example.dz_4_6_youtube.data.models

import com.google.gson.annotations.SerializedName

data class Maxres(@SerializedName("width")
                  val width: Int = 0,
                  @SerializedName("url")
                  val url: String = "",
                  @SerializedName("height")
                  val height: Int = 0)
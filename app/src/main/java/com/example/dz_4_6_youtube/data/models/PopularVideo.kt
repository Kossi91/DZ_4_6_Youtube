package com.example.dz_4_6_youtube.data.models

import com.google.gson.annotations.SerializedName

data class PopularVideo(
    @SerializedName("snippet")
    val snippet: Snippet,
    @SerializedName("fileDetails")
    val fileDetails: FileDetails,
    @SerializedName("kind")
    val kind: String = "",
    @SerializedName("recordingDetails")
    val recordingDetails: RecordingDetails,
    @SerializedName("contentDetails")
    val contentDetails: ContentDetails,
    @SerializedName("topicDetails")
    val topicDetails: TopicDetails,
    @SerializedName("processingDetails")
    val processingDetails: ProcessingDetails,
    @SerializedName("liveStreamingDetails")
    val liveStreamingDetails: LiveStreamingDetails,
    @SerializedName("etag")
    val etag: String = "",
    @SerializedName("suggestions")
    val suggestions: Suggestions,
    @SerializedName("id")
    val id: String = "",
    @SerializedName("status")
    val status: Status,
    @SerializedName("statistics")
    val statistics: Statistics,
    @SerializedName("player")
    val player: Player
)
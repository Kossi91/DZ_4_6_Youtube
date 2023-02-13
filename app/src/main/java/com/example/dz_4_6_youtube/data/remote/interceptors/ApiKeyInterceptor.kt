package com.example.dz_4_6_youtube.data.remote.interceptors

import okhttp3.Interceptor
import okhttp3.Response

class ApiKeyInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        val url = request.url.newBuilder()
            .addQueryParameter("key", "AIzaSyAVk5FSn63OqI72sOzHjcGZLaMK5UWX6Ps").build()
        request = request.newBuilder().url(url).build()
        return chain.proceed(request)
    }
}
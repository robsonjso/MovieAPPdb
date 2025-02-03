package com.example.movieappdb.core.data.remote.response

import com.example.movieappdb.BuildConfig
import com.example.movieappdb.core.util.Constants
import okhttp3.Interceptor
import okhttp3.Response

// Interceptor para adicionar parâmetros comuns em todas as requisições
class ParamsInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response{
        val request = chain.request()
        val url = request.url.newBuilder()
            .addQueryParameter(Constants.API_KEY_PARAM, BuildConfig.API_KEY)
            .addQueryParameter(Constants.LANGUAGE_PARAM, Constants.LANGUAGE_VALUE)
            .build()

        val newRequest = request.newBuilder()
            .url(url)
            .build()

        return chain.proceed(newRequest)
    }
}
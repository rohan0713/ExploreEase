package com.travel.exploreease.data.remote

import com.travel.exploreease.utils.Constants
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    companion object {

        private val retrofit: Retrofit by lazy {

            val loggingInterceptor = HttpLoggingInterceptor()
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

            val client = OkHttpClient.Builder().addInterceptor(loggingInterceptor).build()

            Retrofit.Builder().baseUrl(Constants.url).client(client)
                .addConverterFactory(GsonConverterFactory.create()).build()
        }

        val api: ApiResponse by lazy {
            retrofit.create(ApiResponse::class.java)
        }
    }
}
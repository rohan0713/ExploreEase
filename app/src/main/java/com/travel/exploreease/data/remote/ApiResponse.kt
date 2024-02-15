package com.travel.exploreease.data.remote

import com.travel.exploreease.data.models.GetCafes
import retrofit2.Response
import retrofit2.http.GET

interface ApiResponse {

    @GET("cafes")
    suspend fun getCafes() : Response<GetCafes>
}
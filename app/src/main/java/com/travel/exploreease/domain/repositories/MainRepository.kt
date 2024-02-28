package com.travel.exploreease.domain.repositories

import com.travel.exploreease.data.models.GetCafes
import com.travel.exploreease.data.models.GetExperiences
import com.travel.exploreease.data.remote.ApiResponse
import com.travel.exploreease.data.remote.RetrofitClient
import retrofit2.Response

class MainRepository() : ApiResponse {
    override suspend fun getCafes(): Response<GetCafes> {
        return RetrofitClient.api.getCafes()
    }

    override suspend fun getExperiences(): Response<GetExperiences> {
        return RetrofitClient.api.getExperiences()
    }

}
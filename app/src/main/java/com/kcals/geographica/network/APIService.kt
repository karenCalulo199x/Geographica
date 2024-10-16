package com.kcals.geographica.network

import com.kcals.geographica.model.Country
import retrofit2.Response
import retrofit2.http.GET

interface APIService {
    @GET("v3.1/all")
    suspend fun getCountries(): Response<List<Country>>
}
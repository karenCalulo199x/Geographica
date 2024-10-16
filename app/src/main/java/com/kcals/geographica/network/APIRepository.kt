package com.kcals.geographica.network

import com.kcals.geographica.model.Country
import javax.inject.Inject

class APIRepository @Inject constructor(private val apiService: APIService) {

    suspend fun getCountries(): List<Country>? {
       val response = apiService.getCountries()
        return if(response.isSuccessful) {
            response.body()
        } else {
            null
        }
    }
}
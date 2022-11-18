package com.example.mvvmretrofit.data.api

import com.example.mvvmretrofit.domain.model.rub.CurrentRub
import com.example.mvvmretrofit.domain.model.usd.CurrentUsd
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface ApiService {
    @Headers("apikey: 5q9gUuhXgVK4mgYtMpQ2C7Q3vVLN08Ej")
    @GET("currency_data/live?source=USD&currencies=RUB")
    suspend fun getUSD(): Response<CurrentUsd>
    @Headers("apikey: 5q9gUuhXgVK4mgYtMpQ2C7Q3vVLN08Ej")
    @GET("currency_data/live?source=RUB&currencies=USD")
    suspend fun getRUB(): Response<CurrentRub>
}
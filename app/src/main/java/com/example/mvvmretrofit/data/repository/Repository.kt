package com.example.mvvmretrofit.data.repository

import com.example.mvvmretrofit.data.api.RetrofitHelper
import com.example.mvvmretrofit.domain.model.rub.CurrentRub
import com.example.mvvmretrofit.domain.model.usd.CurrentUsd
import retrofit2.Response

class Repository {
    suspend fun getUSD(): Response<CurrentUsd> {
        return RetrofitHelper.api.getUSD()
    }
    suspend fun getRUB(): Response<CurrentRub>{
        return RetrofitHelper.api.getRUB()
    }
}
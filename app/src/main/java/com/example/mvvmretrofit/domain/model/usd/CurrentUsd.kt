package com.example.mvvmretrofit.domain.model.usd

data class CurrentUsd(
    val quotes: Quotes,
    val source: String,
    val success: Boolean,
    val timestamp: Int
)
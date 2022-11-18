package com.example.mvvmretrofit.domain.model.rub

data class CurrentRub(
    val quotes: Quotes,
    val source: String,
    val success: Boolean,
    val timestamp: Int
)
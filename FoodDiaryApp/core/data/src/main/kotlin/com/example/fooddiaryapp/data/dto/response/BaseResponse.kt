package com.example.fooddiaryapp.data.dto.response

import com.google.gson.annotations.SerializedName

// 응답 DTO
// 기본 응답 구조

data class BaseResponse<T>(
    @SerializedName("status")
    val status: Int,
    @SerializedName("message")
    val message: String,
    @SerializedName("data")
    val data: T?
)
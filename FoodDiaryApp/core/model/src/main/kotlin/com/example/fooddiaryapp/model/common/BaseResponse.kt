package com.example.fooddiaryapp.model.common

// API 응답 래퍼 클래스

data class BaseResponse<T>(
    val data: T? = null,
    val error: DietError? = null
) {
    val isSuccess: Boolean
        get() = error == null && data != null
}
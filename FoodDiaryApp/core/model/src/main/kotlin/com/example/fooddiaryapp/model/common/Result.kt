package com.example.fooddiaryapp.model.common

// 데이터 결과 래퍼 클래스

sealed interface Result<out T> {
    data class Success<T>(val data: T) : Result<T>
    data class Error(val error: DietError) : Result<Nothing>
    object Loading : Result<Nothing>
}
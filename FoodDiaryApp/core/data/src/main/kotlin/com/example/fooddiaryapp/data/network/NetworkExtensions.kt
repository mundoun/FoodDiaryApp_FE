package com.example.fooddiaryapp.data.network

import com.example.fooddiaryapp.data.dto.response.BaseResponse
import retrofit2.Response

suspend fun <T> safeApiCall(apiCall: suspend () -> Response<BaseResponse<T>>): Result<T> {
    return try {
        val response = apiCall()
        if (response.isSuccessful) {
            val body = response.body()
            if (body?.data != null) {
                Result.success(body.data)
            } else {
                Result.failure(NetworkError.Unknown("Empty response body"))
            }
        } else {
            when (response.code()) {
                401 -> Result.failure(NetworkError.Unauthorized)
                in 500..599 -> Result.failure(NetworkError.Server("Server error: ${response.code()}"))
                else -> Result.failure(NetworkError.Unknown("Unknown error: ${response.code()}"))
            }
        }
    } catch (e: Exception) {
        when (e) {
            is NetworkError -> Result.failure(e)
            else -> Result.failure(NetworkError.Unknown(e.message ?: "Unknown error"))
        }
    }
}
package com.example.fooddiaryapp.model.user

import com.example.fooddiaryapp.model.enums.ActivityLevel
import com.example.fooddiaryapp.model.enums.Gender

// 사용자 신체 정보

data class BodyInfo(
    val id: Long,
    val userId: Long,
    val gender: Gender,
    val height: Float,
    val age: Int,
    val activityLevel: ActivityLevel
) {
    init {
        require(height > 0) { "키는 양수여야 합니다" }
        require(age > 0) { "나이는 양수여야 합니다" }
    }
}
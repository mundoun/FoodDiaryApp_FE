package com.example.fooddiaryapp.model.user

import kotlinx.datetime.LocalDateTime

// 체중 기록

data class WeightHistory(
    val id: Long,
    val userId: Long,
    val weight: Float,
    val recordedAt: LocalDateTime
) {
    init {
        require(weight > 0) { "몸무게는 무조건 양수이어야 합니다." }
    }
}
package com.example.fooddiaryapp.model.meal

import kotlinx.datetime.LocalDateTime

// 식사 상세 정보

data class MealDetail(
    val id: Long,
    val mealRecordId: Long,
    val foodId: Long?,          // 기본 음식 ID (null 가능)
    val customFoodId: Long?,    // 사용자 정의 음식 ID (null 가능)
    val servingSize: Float?,     //
    val recordedAt: LocalDateTime
) {
    init {
        require(foodId != null || customFoodId != null) {
            "foodId나 customFoodId 중 하나는 반드시 null이 아니어야 합니다"
        }
    }
}
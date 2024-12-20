package com.example.fooddiaryapp.model.food

// 사용자 정의 음식

data class CustomFood(
    val id: Long,
    val userId: Long,              // 사용자 ID
    val name: String,             // 음식명
    val baseServingSize: Float,   // 기준 제공량
    val nutritionInfo: NutritionInfo // 영양 정보
)
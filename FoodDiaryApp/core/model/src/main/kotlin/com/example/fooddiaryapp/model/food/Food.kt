package com.example.fooddiaryapp.model.food

// 기본 음식 정보

data class Food(
    val id: Long,
    val foodCode: String,           // 식품코드
    val name: String,               // 식품명
    val category: FoodCategory,     // 분류 정보
    val baseServingSize: Float,     // 기본 1회 제공량
    val baseServingUnit: String,    // 단위(g, ml, 개 등)
    val nutritionInfo: NutritionInfo // 영양 정보
)
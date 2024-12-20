package com.example.fooddiaryapp.model.food

// 음식 분류 정보

data class FoodCategory(
    val majorClassificationName: String,  // 식품 대분류명
    val mediumClassificationName: String  // 식품 중분류명
)
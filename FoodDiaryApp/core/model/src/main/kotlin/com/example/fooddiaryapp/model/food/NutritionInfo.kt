package com.example.fooddiaryapp.model.food

// 영양 정보

data class NutritionInfo(
    val calories: Float,      // 칼로리
    val carbohydrate: Float,  // 탄수화물
    val protein: Float,       // 단백질
    val fat: Float,          // 지방
    val fiber: Float?,       // 식이섬유 (null 가능)
    val sugar: Float?         // 당류 (null 가능)
)
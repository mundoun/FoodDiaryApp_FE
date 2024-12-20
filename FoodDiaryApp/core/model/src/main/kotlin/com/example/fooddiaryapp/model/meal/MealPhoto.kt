package com.example.fooddiaryapp.model.meal

// 식사 사진 정보

data class MealPhoto(
    val id: Long,
    val mealId: Long,
    val photoUrl: String
)
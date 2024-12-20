package com.example.fooddiaryapp.model.meal

import com.example.fooddiaryapp.model.enums.MealType
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime

// 식사 정보

data class Meal(
    val id: Long,
    val userId: Long,
    val date: LocalDate,
    val mealType: MealType,
    val photoUrl: String,
    val recordedAt: LocalDateTime
)
package com.example.fooddiaryapp.model.target

import com.example.fooddiaryapp.model.enums.GoalStatus
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime

// 사용자 목표 정보

data class Target(
    val id: Long,
    val userId: Long,
    val targetWeight: Float?,
    val targetCalories: Int?,
    val targetProtein: Float?,
    val targetFat: Float?,
    val targetCarb: Float?,
    val targetStartDate: LocalDate?,
    val targetEndDate: LocalDate?,
    val targetStatus: GoalStatus?,
    val achievementDate: LocalDate?,
    val createdAt: LocalDateTime?
)
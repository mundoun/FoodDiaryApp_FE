package com.example.fooddiaryapp.model.report

import kotlinx.datetime.LocalDate

// AI 리포트 정보

data class AiReport(
    val id: Long,
    val userId: Long,
    val reportDate: LocalDate,
    val reportText: String
)
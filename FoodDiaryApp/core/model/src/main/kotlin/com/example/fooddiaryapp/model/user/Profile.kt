package com.example.fooddiaryapp.model.user

import kotlinx.datetime.LocalDateTime

// 사용자 프로필

data class Profile(
    val id: Long,
    val userName: String,
    val email: String,
    val passwordHash: String,
    val phoneNumber: String,
    val createdAt: LocalDateTime,
    val lastLoginAt: LocalDateTime,
    val isActive: Boolean
)
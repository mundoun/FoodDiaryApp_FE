package com.example.fooddiaryapp.designsystem.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val DiaryShapes = Shapes(
    // 작은 컴포넌트 (드래그 핸들, 칩, 작은 버튼 등)
    extraSmall = RoundedCornerShape(2.5.dp),
    small = RoundedCornerShape(4.dp),

    // 중간 크기 컴포넌트 (버튼, 텍스트 필드 등)
    medium = RoundedCornerShape(12.dp),

    // 큰 컴포넌트 (카드, 다이얼로그 등)
    large = RoundedCornerShape(20.dp),

    // 상단 시트와 같은 특별한 컴포넌트
    extraLarge = RoundedCornerShape(
        topStart = 30.dp,
        topEnd = 30.dp,
        bottomStart = 0.dp,
        bottomEnd = 0.dp
    )
)

// 원형 shape - 아이콘 배경, 프로필 이미지 등에 사용
val CircleShape = RoundedCornerShape(percent = 50)
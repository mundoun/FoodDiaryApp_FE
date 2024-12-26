package com.example.fooddiaryapp.designsystem.color

import androidx.compose.ui.graphics.Color

object DiaryColors {
    // Brand Colors - 앱의 주요 브랜드 컬러와 변형
    object Brand {
        val Primary = Color(0xFF93C47D) // 메인 브랜드 컬러
        val PrimaryDark = Color(0xFF7FB069) // 어두운 버전
        val PrimaryLight = Color(0xFFA8D291) // 밝은 버전
        // 브랜드 컬러의 투명도 변형
        val Primary10 = Color(0x1A93C47D) // 10% 투명도
        val Primary15 = Color(0x2693C47D) // 15% 투명도
        val Primary20 = Color(0x3393C47D) // 20% 투명도
    }

    // Text Colors - 텍스트에 사용되는 색상
    object Text {
        val Primary = Color(0xFF2E3D1D) // 주요 텍스트 (제목)
        val Secondary = Color(0xFF666666) // 보조 텍스트
        val Tertiary = Color(0xFF8E8E8E) // 부가 정보
        val OnBrand = Color(0xFFFFFFFF) // 브랜드 컬러 위의 텍스트
        val Disabled = Color(0xFFBBBBBB) // 비활성화된 텍스트
    }

    // Background Colors - 배경에 사용되는 색상
    object Background {
        val Primary = Color(0xFFF8FAF5) // 메인 배경
        val Surface = Color(0xFFFFFFFF) // 카드 등 표면
        val SurfaceVariant = Color(0xFFF8FAF5) // 카드 내부 배경
        // 그라데이션용 알파값 설정
        val Gradient = listOf(
            Color(0x2693C47D), // 시작 색상 (15% 투명도)
            Color(0x0093C47D) // 종료 색상 (완전 투명)
        )
    }

    // UI Component Colors - UI 요소들의 색상
    object Component {
        val Divider = Color(0xFFE2E8F0) // 구분선
        val HandleBar = Color(0xFFE2E8F0) // 드래그 핸들
        val Shadow = Color(0x1A000000) // 그림자 (10% 검정)

        // 카드 관련
        object Card {
            val Border = Color(0xFFE2E8F0) // 카드 테두리
            val Shadow = Color(0x0D000000) // 카드 그림자 (5%)
        }

        // 하단 네비게이션
        object Navigation {
            val Background = Color(0xFFF8FAF5) // 네비게이션 배경
            val Selected = Color(0xFF93C47D) // 선택된 아이템
            val Unselected = Color(0xFF666666) // 선택되지 않은 아이템
            val IconBackground = Color(0x1A93C47D) // 아이콘 배경 (10%)
        }
    }

    // Status Colors - 상태 표시 색상
    object Status {
        val Success = Color(0xFF93C47D) // 성공/완료
        val Warning = Color(0xFFFFB020) // 경고
        val Error = Color(0xFFDC3545) // 오류
        val Info = Color(0xFF17A2B8) // 정보
    }

    // Chart Colors - 차트나 그래프에 사용되는 색상
    object Chart {
        val Primary = Color(0xFF93C47D)
        val Secondary = Color(0xFFB6D7A8)
        val Tertiary = Color(0xFFD9EAD3)
        val Grid = Color(0xFFE2E8F0) // 그리드 선
        val Axis = Color(0xFF666666) // 축 레이블
    }
}
package com.example.fooddiaryapp.navigation

/**
 * 푸드 다이어리 앱의 모든 화면 경로를 정의
 */
object FoodDiaryDestinations {
    // 온보딩 관련
    const val ONBOARDING_ROUTE = "onboarding"
    const val WELCOME_ROUTE = "onboarding/welcome"
    const val USER_INFO_ROUTE = "onboarding/user_info"
    const val GOAL_SETTING_ROUTE = "onboarding/goal_setting"

    // 메인 탭 화면
    const val MAIN_ROUTE = "main"
    const val HOME_ROUTE = "main/home"
    const val RECORD_ROUTE = "main/record"
    const val REPORT_ROUTE = "main/report"
    const val PROFILE_ROUTE = "main/profile"

    // 식사 기록 관련
    const val MEAL_RECORD_ROUTE = "record/meal"
    const val FOOD_SEARCH_ROUTE = "record/food_search"
    const val FOOD_DETAIL_ROUTE = "record/food_detail/{foodId}"

    fun foodDetailRoute(foodId: String) = "record/food_detail/$foodId"

    // 리포트 관련
    const val NUTRITION_REPORT_ROUTE = "report/nutrition"
    const val WEIGHT_REPORT_ROUTE = "report/weight"
    const val GOAL_PROGRESS_ROUTE = "report/goal_progress"

    // 프로필 관련
    const val EDIT_PROFILE_ROUTE = "profile/edit"
    const val SETTINGS_ROUTE = "profile/settings"
}
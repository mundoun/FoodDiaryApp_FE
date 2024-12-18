package com.example.fooddiaryapp.navigation


import androidx.navigation.NavHostController

/**
 * 앱 전체의 화면 이동을 관리하는 인터페이스
 */
interface FoodDiaryNavigator {
    // 기본 네비게이션
    fun navigate(destination: String)
    fun navigateAndPopUp(destination: String, popUp: String)
    fun navigateAndPopUpToRoot(destination: String)
    fun popUp()
    fun popUpTo(destination: String)

    // 온보딩 네비게이션
    fun navigateToOnboarding()
    fun navigateToUserInfo()
    fun navigateToGoalSetting()
    fun onboardingComplete()

    // 메인 화면 네비게이션
    fun navigateToHome()
    fun navigateToRecord()
    fun navigateToReport()
    fun navigateToProfile()

    // 식사 기록 관련 네비게이션
    fun navigateToMealRecord()
    fun navigateToFoodSearch()
    fun navigateToFoodDetail(foodId: String)

    // 리포트 관련 네비게이션
    fun navigateToNutritionReport()
    fun navigateToWeightReport()
    fun navigateToGoalProgress()

    // 프로필 관련 네비게이션
    fun navigateToEditProfile()
    fun navigateToSettings()
}

/**
 * FoodDiaryNavigator 구현체
 */
class FoodDiaryNavigatorImpl(
    private val navController: NavHostController
) : FoodDiaryNavigator {
    override fun navigate(destination: String) {
        navController.navigate(destination)
    }

    override fun navigateAndPopUp(destination: String, popUp: String) {
        navController.navigate(destination) {
            popUpTo(popUp) { inclusive = true }
        }
    }

    override fun navigateAndPopUpToRoot(destination: String) {
        navController.navigate(destination) {
            popUpTo(0) { inclusive = true }
        }
    }

    override fun popUp() {
        navController.popBackStack()
    }

    override fun popUpTo(destination: String) {
        navController.popBackStack(destination, false)
    }

    // 온보딩 네비게이션 구현
    override fun navigateToOnboarding() {
        navigateAndPopUpToRoot(FoodDiaryDestinations.ONBOARDING_ROUTE)
    }

    override fun navigateToUserInfo() {
        navigate(FoodDiaryDestinations.USER_INFO_ROUTE)
    }

    override fun navigateToGoalSetting() {
        navigate(FoodDiaryDestinations.GOAL_SETTING_ROUTE)
    }

    override fun onboardingComplete() {
        navigateAndPopUpToRoot(FoodDiaryDestinations.MAIN_ROUTE)
    }

    // 메인 화면 네비게이션 구현
    override fun navigateToHome() {
        navigate(FoodDiaryDestinations.HOME_ROUTE)
    }

    override fun navigateToRecord() {
        navigate(FoodDiaryDestinations.RECORD_ROUTE)
    }

    override fun navigateToReport() {
        navigate(FoodDiaryDestinations.REPORT_ROUTE)
    }

    override fun navigateToProfile() {
        navigate(FoodDiaryDestinations.PROFILE_ROUTE)
    }

    // 식사 기록 관련 네비게이션 구현
    override fun navigateToMealRecord() {
        navigate(FoodDiaryDestinations.MEAL_RECORD_ROUTE)
    }

    override fun navigateToFoodSearch() {
        navigate(FoodDiaryDestinations.FOOD_SEARCH_ROUTE)
    }

    override fun navigateToFoodDetail(foodId: String) {
        navigate(FoodDiaryDestinations.foodDetailRoute(foodId))
    }

    // 리포트 관련 네비게이션 구현
    override fun navigateToNutritionReport() {
        navigate(FoodDiaryDestinations.NUTRITION_REPORT_ROUTE)
    }

    override fun navigateToWeightReport() {
        navigate(FoodDiaryDestinations.WEIGHT_REPORT_ROUTE)
    }

    override fun navigateToGoalProgress() {
        navigate(FoodDiaryDestinations.GOAL_PROGRESS_ROUTE)
    }

    // 프로필 관련 네비게이션 구현
    override fun navigateToEditProfile() {
        navigate(FoodDiaryDestinations.EDIT_PROFILE_ROUTE)
    }

    override fun navigateToSettings() {
        navigate(FoodDiaryDestinations.SETTINGS_ROUTE)
    }
}
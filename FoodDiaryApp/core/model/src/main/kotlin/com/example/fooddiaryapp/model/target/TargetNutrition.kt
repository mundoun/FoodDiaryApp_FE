package com.example.fooddiaryapp.model.target

// 목표 영양 섭취량

data class TargetNutrition(
    val calories: Int,
    val carbohydrate: Float,
    val protein: Float,
    val fat: Float
) {
    val totalMacroNutrients: Float
        get() = carbohydrate + protein + fat

    init {
        require(calories > 0) { "칼로리는 양수여야 합니다" }
        require(carbohydrate >= 0) { "탄수화물은 음수가 될 수 없습니다" }
        require(protein >= 0) { "단백질은 음수가 될 수 없습니다" }
        require(fat >= 0) { "지방은 음수가 될 수 없습니다" }
    }
}
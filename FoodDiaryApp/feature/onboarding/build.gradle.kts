plugins {
    id("fooddiaryapp.android.library")
    id("fooddiaryapp.android.compose")
    id("fooddiaryapp.android.hilt")
}

android {
    namespace = "com.example.fooddiaryapp.feature.onboarding"
}

dependencies {
    // Core modules
    implementation(project(":core:model"))
    implementation(project(":core:ui"))
    implementation(project(":core:designsystem"))
    implementation(project(":core:data"))
    implementation(project(":core:domain"))
    implementation(project(":core:navigation"))

    // Compose
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.material3)
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    debugImplementation(libs.androidx.ui.tooling)

    // Navigation
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.hilt.navigation.compose)

    // Runtime
    implementation(libs.androidx.runtime)

    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.mockk.android)
    testImplementation(libs.mockk)
}
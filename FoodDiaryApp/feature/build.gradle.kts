plugins {
    id("fooddiaryapp.android.library")  // 기본 라이브러리 플러그인
    id("fooddiaryapp.android.compose")  // Compose 설정 플러그인
}

android {
    namespace = "com.example.fooddiaryapp.feature"
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)

    implementation(project(":core"))

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.test.manifest)
}
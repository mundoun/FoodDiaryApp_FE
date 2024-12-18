plugins {
    id("fooddiaryapp.android.library")   // 라이브러리 기본 설정
    id("fooddiaryapp.android.compose")   // Compose 설정 (디자인 시스템이므로 필요)
}

android {
    namespace = "com.example.fooddiaryapp.core.designsystem"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
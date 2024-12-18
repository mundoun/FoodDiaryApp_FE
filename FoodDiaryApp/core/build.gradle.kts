plugins {
    id("fooddiaryapp.android.library")  // 기본 라이브러리 플러그인으로 변경
}

android {
    namespace = "com.example.fooddiaryapp.core"
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
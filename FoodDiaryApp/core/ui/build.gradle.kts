plugins {
    id("fooddiaryapp.android.library")
}

android {
    namespace = "com.example.fooddiaryapp.core.ui"

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.composeCompiler.get()
    }
}

dependencies {
    // UI 모듈이 디자인시스템 모듈의 리소스들을 사용할 수 있게 됨
    implementation(project(":core:designsystem"))
    // UI 모듈이 model 모듈에서 정의한 데이터 모델들을 사용할 수 있게 됨
    implementation(project(":core:model"))

    // AndroidX Core
    implementation(libs.androidx.core.ktx)

    // Compose dependencies
    implementation(platform(libs.androidx.compose.bom.v20241201))
    implementation(libs.ui)
    implementation(libs.ui.graphics)
    implementation(libs.ui.tooling.preview)
    implementation(libs.material3)
    debugImplementation(libs.ui.tooling)

    // System UI Controller
    implementation(libs.accompanist.systemuicontroller)

    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
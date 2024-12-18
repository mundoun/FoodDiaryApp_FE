plugins {
    id("fooddiaryapp.android.library")
}

android {
    namespace = "com.example.fooddiaryapp.core.navigation"
}

dependencies {
    api(libs.androidx.navigation.compose)
    implementation(libs.androidx.runtime)
    implementation(libs.androidx.navigation.runtime.ktx)
}
plugins {
    id("fooddiaryapp.android.library")
}

android {
    namespace = "com.example.fooddiaryapp.core.domain"
}

dependencies {
    // Coroutines
    implementation(libs.kotlinx.coroutines.android)

    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
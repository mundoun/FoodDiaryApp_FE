plugins {
    id("fooddiaryapp.android.library")
}

android{
    namespace = "com.example.fooddiaryapp.core.model"
}

dependencies {
    // Kotlin DateTime
    implementation(libs.kotlinx.datetime)

    // Testing
    testImplementation(libs.junit)
}
plugins {
    id("fooddiaryapp.android.library")
}

android{
    namespace = "com.example.fooddiaryapp.core.model"
}

dependencies {
    // Kotlin DateTime
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.5.0")

    // Testing
    testImplementation(libs.junit)
}
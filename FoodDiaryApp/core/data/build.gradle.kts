plugins {
    id("fooddiaryapp.android.library")
    alias(libs.plugins.ksp)
    kotlin("plugin.serialization") version "1.9.20"  // Kotlin Serialization 플러그인 추가
}

android {
    namespace = "com.example.fooddiaryapp.core.data"
}

dependencies {
    implementation(project(":core:model"))

    // Coroutines
    implementation(libs.kotlinx.coroutines.android)
    testImplementation(libs.kotlinx.coroutines.test)

    // Network & Retrofit
    implementation(libs.retrofit.core)
    implementation(libs.converter.gson)  // Gson converter로 변경
    implementation(libs.okhttp.logging)

    // Kotlin Serialization
    implementation(libs.kotlinx.serialization.json)

    // Local Database
    implementation(libs.room.runtime)
    implementation(libs.room.ktx)
    ksp(libs.room.compiler)

    // DataStore
    implementation(libs.androidx.datastore)

    // Testing
    testImplementation(libs.junit)
}
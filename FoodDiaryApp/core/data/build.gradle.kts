plugins {
    id("fooddiaryapp.android.library")
    id("fooddiaryapp.android.hilt")
    alias(libs.plugins.ksp)  // KSP 플러그인을 이렇게 직접 적용
}

android {
    namespace = "com.example.fooddiaryapp.core.data"
}

dependencies {

    // Coroutines
    implementation(libs.kotlinx.coroutines.android)

    // Network
    implementation(libs.retrofit.core)
    implementation(libs.retrofit.kotlin.serialization)
    implementation(libs.okhttp.logging)

    // JSON
    implementation(libs.kotlinx.serialization.json)

    // Local Database
    implementation(libs.room.runtime)
    implementation(libs.room.ktx)
    ksp(libs.room.compiler)

    // DataStore
    implementation(libs.androidx.datastore)

    // Test
    testImplementation(libs.junit)
    testImplementation(libs.kotlinx.coroutines.test)
}
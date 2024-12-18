plugins {
    id("fooddiaryapp.android.application")
    id("fooddiaryapp.android.compose")
    id("com.google.dagger.hilt.android")
    id("kotlin-kapt")  // Hilt annotation processor를 위해 필요
}

android {
    namespace = "com.example.fooddiaryapp"

    defaultConfig {
        applicationId = "com.example.fooddiaryapp"
        versionCode = 1
        versionName = "1.0"

        vectorDrawables {
            useSupportLibrary = true
        }
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // Core modules
    implementation(project(":core"))
    implementation(project(":feature"))

    implementation(project(":core:designsystem"))
    implementation(project(":core:data"))
    implementation(project(":core:datastore"))
    implementation(project(":core:domain"))
    implementation(project(":core:model"))
    implementation(project(":core:navigation"))
    implementation(project(":core:ui"))


    // AndroidX
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)

    // Hilt
    implementation(libs.hilt.android.v250)
    kapt(libs.hilt.android.compiler.v250)
    implementation(libs.androidx.hilt.navigation.compose)

    // Coil
    implementation(libs.coil.compose)

    // Material Icons
    implementation(libs.androidx.material.icons.extended)

    // Testing
    testImplementation(libs.junit)
    testImplementation(libs.mockk)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.mockk.android)
}
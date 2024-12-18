plugins {
    id("fooddiaryapp.android.application")
    id("fooddiaryapp.android.compose")
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
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)

    implementation(project(":core"))
    implementation(project(":feature"))

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
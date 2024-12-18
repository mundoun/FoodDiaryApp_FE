plugins {
    id("fooddiaryapp.android.library")
}

android {
    namespace = "com.example.fooddiaryapp.core.datastore"
}


dependencies {

    // DataStore
    implementation(libs.androidx.datastore.preferences.v111)

    // Coroutines
    implementation(libs.kotlinx.coroutines.android)

    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
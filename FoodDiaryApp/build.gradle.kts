buildscript {
    repositories {
        google()
        mavenCentral()
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}

// Common configuration for all modules
subprojects {
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
        kotlinOptions {
            jvmTarget = JavaVersion.VERSION_17.toString()
            // Treat all Kotlin warnings as errors
            allWarningsAsErrors = true
        }
    }

    // Configure Android specific options for Android modules
    plugins.withId("com.android.base") {
        configure<com.android.build.gradle.BaseExtension> {
            compileSdkVersion(34) // 최신 Android SDK 버전 사용

            defaultConfig {
                minSdk = 24 // 일반적인 최소 SDK 버전
                targetSdk = 34 // 최신 Android SDK 버전 사용
            }

            compileOptions {
                sourceCompatibility = JavaVersion.VERSION_17
                targetCompatibility = JavaVersion.VERSION_17
            }
        }
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
package com.example.fooddiaryapp.convention

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

// Hilt 관련 설정을 구성하는 Gradle Convention Plugin
class AndroidHiltConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            // Gradle 플러그인 매니저를 통해 Hilt와 KAPT 플러그인을 적용
            with(pluginManager) {
                // Dagger Hilt 플러그인 적용 (Hilt를 사용하기 위해 필요)
                apply("dagger.hilt.android.plugin")
                // Kotlin KAPT 플러그인 적용 (Hilt 컴파일러를 사용하기 위해 필요)
                apply("org.jetbrains.kotlin.kapt")
            }

            // Hilt 관련 의존성 추가
            dependencies {
                // Hilt Core 라이브러리 추가
                add("implementation", "com.google.dagger:hilt-android:2.50")
                // Hilt Annotation Processor 추가 (KAPT 사용)
                add("kapt", "com.google.dagger:hilt-android-compiler:2.50")
                // Hilt를 Compose Navigation에서 사용하기 위한 라이브러리 추가
                add("implementation", "androidx.hilt:hilt-navigation-compose:1.1.0")
            }
        }
    }
}

package com.example.fooddiaryapp.convention

import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

// 안드로이드 라이브러리 모듈 설정을 위한 Gradle Convention Plugin
class AndroidLibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            // 플러그인 매니저를 통해 필요한 플러그인 적용
            with(pluginManager) {
                // 안드로이드 라이브러리 플러그인 적용
                apply("com.android.library")
                // Kotlin Android 플러그인 적용
                apply("org.jetbrains.kotlin.android")
            }

            // LibraryExtension을 사용하여 라이브러리 모듈의 공통 설정을 적용
            extensions.configure<LibraryExtension> {
                // configureAndroid 함수를 호출하여 안드로이드 공통 설정 적용
                configureAndroid(this)
            }
        }
    }
}

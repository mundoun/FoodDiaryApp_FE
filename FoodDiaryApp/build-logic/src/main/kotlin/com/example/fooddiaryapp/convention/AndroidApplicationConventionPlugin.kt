package com.example.fooddiaryapp.convention

import com.android.build.api.dsl.ApplicationExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

// Android Application 관련 공통 설정을 적용하기 위한 Gradle Plugin 클래스 정의
class AndroidApplicationConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        // Gradle Plugin이 적용될 프로젝트 대상
        with(target) {
            with(pluginManager) {
                // 안드로이드 애플리케이션 플러그인을 적용
                apply("com.android.application")
                // Kotlin Android 플러그인을 적용
                apply("org.jetbrains.kotlin.android")
            }

            // ApplicationExtension을 사용하여 안드로이드 애플리케이션의 공통 설정 정의
            extensions.configure<ApplicationExtension> {
                // 사용자 정의 함수 `configureAndroid`를 호출하여 추가 설정을 적용
                configureAndroid(this)
                defaultConfig {
                    // targetSdkVersion 설정 (안드로이드 SDK 버전 34를 타겟팅)
                    targetSdk = 34
                }
            }
        }
    }
}

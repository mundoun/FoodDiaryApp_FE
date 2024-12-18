package com.example.fooddiaryapp.convention

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

// 안드로이드 공통 설정을 구성하기 위한 확장 함수
internal fun Project.configureAndroid(
    commonExtension: CommonExtension<*, *, *, *, *>, // CommonExtension: 모든 안드로이드 모듈(app, library 등)에 공통으로 적용할 설정을 포함
) {
    commonExtension.apply {
        // 안드로이드 컴파일 SDK 버전 설정
        compileSdk = 34

        // 기본 설정 (defaultConfig) 정의
        defaultConfig {
            // 최소 SDK 버전 설정
            minSdk = 24
            // 테스트 시 사용할 인스트루먼트 러너 설정
            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        }

        // 자바 컴파일 옵션 설정
        compileOptions {
            // 자바 소스와 타겟 컴파일 호환성을 자바 17로 설정
            sourceCompatibility = JavaVersion.VERSION_17
            targetCompatibility = JavaVersion.VERSION_17
        }

        // Kotlin 컴파일러 옵션 설정
        tasks.withType<KotlinCompile>().configureEach {
            kotlinOptions {
                // JVM 타겟 버전을 Java 17로 설정
                jvmTarget = JavaVersion.VERSION_17.toString()
            }
        }
    }
}

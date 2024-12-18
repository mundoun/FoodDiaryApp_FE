buildscript {
    repositories {
        google()
        mavenCentral()
    }
}

plugins {
    // 기존 플러그인은 커스텀 플러그인에서 적용하므로 제거해도 됩니다
    // 하지만 다른 모듈에서 참조할 수 있도록 false로 유지
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
}

// 공통 설정은 이제 build-logic의 Convention 플러그인들이 처리하므로
// 여기서는 제거할 수 있습니다.
// 단, Convention 플러그인에서 처리하지 않는 추가 설정만 여기에 유지합니다.
subprojects {
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
        kotlinOptions {
            // Treat all Kotlin warnings as errors (선택적)
            allWarningsAsErrors = true
        }
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
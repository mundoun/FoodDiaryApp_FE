import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

// Android Compose 관련 설정을 구성하는 Gradle Convention Plugin
class AndroidComposeConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            // Gradle Plugin 적용
            pluginManager.apply {
                // Android Library 플러그인 적용
                apply("com.android.library")
                // Kotlin Android 플러그인 적용
                apply("org.jetbrains.kotlin.android")
            }

            // 안드로이드 공통 설정에 Compose 관련 빌드 설정 적용
            extensions.configure<CommonExtension<*, *, *, *, *>> {
                buildFeatures {
                    // Compose 기능 활성화
                    compose = true
                }

                // Compose의 Kotlin Compiler 확장 버전 설정
                composeOptions {
                    kotlinCompilerExtensionVersion = "1.5.8" // Compose Compiler 버전 지정
                }
            }

            // Compose 의존성 추가
            dependencies {
                // Compose BOM (Bill of Materials)를 사용하여 버전 관리 통합
                val bom = "androidx.compose:compose-bom:2024.02.00"
                add("implementation", platform(bom)) // BOM을 사용하여 의존성 버전 자동 관리

                // Compose UI 핵심 라이브러리 추가
                add("implementation", "androidx.compose.ui:ui")
                // Compose 그래픽 라이브러리 추가
                add("implementation", "androidx.compose.ui:ui-graphics")
                // Compose 미리보기 도구 라이브러리 추가
                add("implementation", "androidx.compose.ui:ui-tooling-preview")
                // Material 3 라이브러리 추가
                add("implementation", "androidx.compose.material3:material3")

                // 디버그 환경에서만 UI 툴링 도구 사용 (디버그용 UI 미리보기)
                add("debugImplementation", "androidx.compose.ui:ui-tooling")
            }
        }
    }
}

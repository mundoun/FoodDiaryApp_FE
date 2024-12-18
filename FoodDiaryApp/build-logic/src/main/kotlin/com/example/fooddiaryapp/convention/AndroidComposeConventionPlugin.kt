package com.example.fooddiaryapp.convention

import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

class AndroidComposeConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            // Application 또는 Library 모듈의 확장을 구성
            val extension = when {
                pluginManager.hasPlugin("com.android.application") -> {
                    extensions.configure<ApplicationExtension> {
                        configureCompose(this)
                    }
                }
                pluginManager.hasPlugin("com.android.library") -> {
                    extensions.configure<LibraryExtension> {
                        configureCompose(this)
                    }
                }
                else -> throw IllegalStateException(
                    "Plugin requires Android Application or Library plugin to be applied first"
                )
            }
        }
    }

    private fun Project.configureCompose(
        commonExtension: com.android.build.api.dsl.CommonExtension<*, *, *, *, *>
    ) {
        commonExtension.apply {
            buildFeatures {
                compose = true
            }

            composeOptions {
                kotlinCompilerExtensionVersion = "1.5.8"
            }
        }

        dependencies {
            val bom = "androidx.compose:compose-bom:2024.02.00"
            add("implementation", platform(bom))
            add("implementation", "androidx.compose.ui:ui")
            add("implementation", "androidx.compose.ui:ui-graphics")
            add("implementation", "androidx.compose.ui:ui-tooling-preview")
            add("implementation", "androidx.compose.material3:material3")
            add("debugImplementation", "androidx.compose.ui:ui-tooling")
        }
    }
}
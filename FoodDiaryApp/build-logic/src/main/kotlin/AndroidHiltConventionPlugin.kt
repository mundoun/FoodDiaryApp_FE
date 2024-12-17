import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidHiltConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("dagger.hilt.android.plugin")
                apply("org.jetbrains.kotlin.kapt")
            }

            dependencies {
                add("implementation", "com.google.dagger:hilt-android:2.50")
                add("kapt", "com.google.dagger:hilt-android-compiler:2.50")
                add("implementation", "androidx.hilt:hilt-navigation-compose:1.1.0")
            }
        }
    }
}
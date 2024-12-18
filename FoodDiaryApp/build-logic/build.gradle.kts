plugins {
    `kotlin-dsl`
}

group = "com.fooddiaryapp.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}


dependencies {
    compileOnly("com.android.tools.build:gradle:8.2.0")
    compileOnly("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.21")
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "fooddiaryapp.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("androidLibrary") {
            id = "fooddiaryapp.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("androidCompose") {
            id = "fooddiaryapp.android.compose"
            implementationClass = "AndroidComposeConventionPlugin"
        }
        register("androidHilt") {
            id = "fooddiaryapp.android.hilt"
            implementationClass = "AndroidHiltConventionPlugin"
        }
    }
}
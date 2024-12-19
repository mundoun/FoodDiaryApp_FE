pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}

rootProject.name = "FoodDiaryApp"

// Include all modules
include(":app")
include(":core")
include(":feature")

includeBuild("build-logic")

// Core module submodules
include(":core:data")
include(":core:datastore")
include(":core:domain")
include(":core:designsystem")
include(":core:model")
include(":core:navigation")
include(":core:ui")
//include(":core:testing")

// Feature module submodules
include(":feature:onboarding")
//include(":feature:home")
//include(":feature:record")
//include(":feature:report")
//include(":feature:profile")


include(":feature:home")
include(":feature:record")
include(":feature:report")

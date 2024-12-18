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
        google()
        mavenCentral()
    }
}

rootProject.name = "FoodDiaryApp"

// Include all modules
include(":app")
include(":core")
include(":feature")

// Core module submodules
include(":core:data")
include(":core:datastore")
include(":core:domain")
include(":core:designsystem")
include(":core:model")
include(":core:navigation")
include(":core:testing")
include(":core:ui")

// Feature module submodules
include(":feature:onboarding")
include(":feature:home")
include(":feature:record")
include(":feature:report")
include(":feature:profile")
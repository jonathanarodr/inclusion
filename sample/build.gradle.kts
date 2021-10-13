plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "br.com.inclusion"

        minSdk = 21
        targetSdk = 31

        versionCode = 1
        versionName = "1.0.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
    }
    testOptions {
        execution = "ANDROIDX_TEST_ORCHESTRATOR"
        animationsDisabled = true
        unitTests.apply {
            isReturnDefaultValues = true
            isIncludeAndroidResources = true
        }
    }
}

dependencies {
    implementation(Dependencies.ANDROIDX_CORE)
    implementation(Dependencies.ANDROIDX_APPCOMPAT)
    implementation(Dependencies.ANDROIDX_RECYCLER)
    implementation(Dependencies.ANDROIDX_CONSTRAINT)
    implementation(Dependencies.NAVIGATION_FRAGMENT)
    implementation(Dependencies.NAVIGATION_UI)
    implementation(Dependencies.KOIN)
    implementation(Dependencies.MATERIAL)
    implementation(Dependencies.MARKWON)
}
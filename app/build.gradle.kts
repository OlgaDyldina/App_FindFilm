plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
   }

android {
    namespace = "com.example.app_findfilm"
    compileSdk = 35


    defaultConfig {
        applicationId = "com.example.app_findfilm"
        minSdk = 33
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }
    buildToolsVersion = "33.0.1"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.cardview)
    implementation(libs.kotlin.stdlib)
    implementation(libs.androidx.viewpager2)
    implementation(libs.kotlin.reflect)
    implementation(libs.androidx.tiles.tooling)
    implementation(libs.androidx.viewpager)
    implementation(libs.library)
    implementation(libs.androidx.databinding.adapters)
    implementation(libs.androidx.databinding.compiler)
    implementation(libs.androidx.gridlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
  }
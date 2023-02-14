plugins {
    id("com.android.application")
    kotlin("android")

    // Kapt
    kotlin("kapt")

    // Hilt
    id("com.google.dagger.hilt.android")

    // SafeArgs
    id("androidx.navigation.safeargs.kotlin")
}

android {
    namespace = "com.example.dz_4_6_youtube"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.dz_4_6_youtube"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"),"proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    // ViewBinding
    buildFeatures.viewBinding = true
}

dependencies {

    // Core
    implementation("androidx.core:core-ktx:1.9.0")

    // AppCompat
    implementation("androidx.appcompat:appcompat:1.6.0")

    // Material Design
    implementation("com.google.android.material:material:1.8.0")

    // UI Components
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // Fragment
    implementation("androidx.fragment:fragment-ktx:1.5.5")

    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    // OkHttp Client
    implementation(platform("com.squareup.okhttp3:okhttp-bom:4.10.0"))
    implementation("com.squareup.okhttp3:okhttp")
    implementation("com.squareup.okhttp3:logging-interceptor")

    //Hilt
    implementation("com.google.dagger:hilt-android:2.44")
    kapt("com.google.dagger:hilt-compiler:2.44")

    // Navigation
    implementation("androidx.navigation:navigation-fragment-ktx:2.5.3")
    implementation("androidx.navigation:navigation-ui-ktx:2.5.3")

    // Lifecycles
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.5.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.5.1")

    // ViewBindingPropertyDelegate
    implementation("com.github.kirich1409:viewbindingpropertydelegate-noreflection:1.5.6")

    // Glide
    implementation("com.github.bumptech.glide:glide:4.14.2")
    annotationProcessor("com.github.bumptech.glide:compiler:4.14.2")

    // Paging 3
    implementation("androidx.paging:paging-runtime:3.1.1")
}
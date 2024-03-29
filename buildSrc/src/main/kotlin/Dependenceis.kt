object Versions{
    const val core = "1.9.0"
    const val appCompact = "1.5.1"
    const val material = "1.7.0"
    const val constraintLayout = "2.1.4"
    const val junit = "4.13.2"
    const val androidJunit = "1.1.4"
    const val espressoCore = "3.5.0"
    const val fragment = "1.5.4"
    const val coroutines = "1.6.4"
    const val navigation = "2.5.2"
    const val lifecycle = "2.5.1"
    const val viewBindingDelegate = "1.5.6"
    const val retrofit="2.9.0"
    const val viewPager2="1.0.0"
    const val coil="2.2.2"
    const val koin="2.2.3"
    const val util="1.6.1"
    const val paging="3.1.1"
    const val AGP = "7.3.0"
    const val  kotlin = "1.7.10"
    }

object Dependenceis {
    object UI {
            const val core = "androidx.core:core-ktx:${Versions.core}"
            const val appCompact = "androidx.appcompat:appcompat:${Versions.appCompact}"
            const val material = "com.google.android.material:material:${Versions.material}"
            const val constraintLayout =
                "androidx.constraintLayout:constraintLayout:${Versions.constraintLayout}"
            const val junit = "junit:junit:${Versions.junit}"
            const val androidJunit = "androidx.test.ext:junit:${Versions.androidJunit}"
            const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
            const val fragment = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    }

    object Coroutines {
        const val android =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
        const val core =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    }

    object Navigation {
        const val fragment =
            "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val UI = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    }

    object Lifecycle {
        const val viewModel =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
        const val runtime =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    }

    object ViewBinding {
        const val delegate =
            "com.github.kirich1409:viewbindingpropertydelegate-noreflection:${Versions.viewBindingDelegate}"
    }

    object Javax {
        const val inject = "javax.inject:javax.inject:1"
    }

    object Compose {
        const val compose = "androidx.lifecycle:lifecycle-viewmodel-compose:2.6.0-alpha05"
        const val com="androidx.navigation:navigation-compose:2.6.0-beta01"
    }
    object Coil {
        const val coil= "io.coil-kt:coil-compose:2.0.0-rc03"

    }
    object Retrofit{
        const val retrofit="com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val retrofit2="com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
        const val okhttp="com.squareup.okhttp3:okhttp:5.0.0-alpha.2"
        const val okhttp3="com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.6"
    }
    object ViewPager2 {
        const val viewPager2 = "androidx.viewpager2:viewpager2:${Versions.viewPager2}"
    }

    object Koin {
        const val koin = "io.insert-koin:koin-android:${Versions.koin}"
        const val koin_scope = "io.insert-koin:koin-androidx-scope:${Versions.koin}"
        const val koin_viewmodel = "io.insert-koin:koin-androidx-viewmodel:${Versions.koin}"
        const val koin_fragment = "io.insert-koin:koin-androidx-fragment:${Versions.koin}"

    }
    object Utils {
        const val util = "androidx.activity:activity-ktx:${Versions.util}"
    }
    object Paging {
        const val paging = "androidx.paging:paging-runtime-ktx:${Versions.paging}"
    }

}
object Plugins {
    object AGP{
        const val application = "com.android.application"
        const val library = "com.android.library"
        const val java = "java-library"
    }
    object Kotlin{
        const val kotlin = "org.jetbrains.kotlin.android"
        const val kapt = "kotlin-kapt"
        const val jvm = "org.jetbrains.kotlin.jvm"

    }

}
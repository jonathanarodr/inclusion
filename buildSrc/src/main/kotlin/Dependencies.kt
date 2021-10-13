object Dependencies {

    const val GRADLE_TOOLS = "com.android.tools.build:gradle:${Versions.Gradle.CORE}"
    const val KOTLIN_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Kotlin.CORE}"

    const val ANDROIDX_CORE = "androidx.core:core-ktx:${Versions.Jetpack.CORE}"
    const val ANDROIDX_APPCOMPAT = "androidx.appcompat:appcompat:${Versions.Jetpack.APPCOMPAT}"
    const val ANDROIDX_RECYCLER = "androidx.recyclerview:recyclerview:${Versions.Jetpack.RECYCLER}"
    const val ANDROIDX_CONSTRAINT = "androidx.constraintlayout:constraintlayout:${Versions.Jetpack.CONSTRAINT}"

    const val NAVIGATION_FRAGMENT = "androidx.navigation:navigation-fragment-ktx:${Versions.Jetpack.NAVIGATION}"
    const val NAVIGATION_UI = "androidx.navigation:navigation-ui-ktx:${Versions.Jetpack.NAVIGATION}"

    const val KOIN = "io.insert-koin:koin-android:${Versions.Tools.KOIN}"
    const val MATERIAL = "com.google.android.material:material:${Versions.Tools.MATERIAL}"
    const val MARKWON = "io.noties.markwon:core:${Versions.Tools.MARKWON}"
}
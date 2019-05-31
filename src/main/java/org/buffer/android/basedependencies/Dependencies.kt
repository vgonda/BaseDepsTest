package org.buffer.android.basedependencies

object Versions {
    const val retrofit = "2.5.0"
}

interface BaseDependencies {

    val retrofit_converter get() = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
}

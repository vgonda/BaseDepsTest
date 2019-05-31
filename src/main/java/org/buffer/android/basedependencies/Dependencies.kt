package org.buffer.android.basedependencies

object Versions {
    const val retrofit = "2.5.0"
}

interface DependencyPaths {
    val retrofit_converter: String
}
object BaseDependencies: DependencyPaths {

    override val retrofit_converter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
}

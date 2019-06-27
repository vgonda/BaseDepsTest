package org.buffer.android.basedependencies

object Versions {
    const val retrofit = "2.5.0"
}

open class BaseDependencies {
    
    val retrofit_converter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
}

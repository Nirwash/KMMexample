package com.nirwashh.android.kmmexample.model

import kotlinx.serialization.Serializable

@Serializable
data class ResponseInfo(
    val count: Int = 0,
    val pages: Int = 0,
    val next: String? = null,
    val prev: String? = null
)

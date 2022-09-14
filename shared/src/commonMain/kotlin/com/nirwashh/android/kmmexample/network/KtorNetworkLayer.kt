package com.nirwashh.android.kmmexample.network

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.*
import io.ktor.client.request.*

class KtorNetworkLayer : NetworkLayer {
    private val client = HttpClient {
        install(HttpTimeout)
    }
    override suspend fun getCharacters() {
        val result = client.get("$BASE_ADDRESS/character") {
            parameter("page", 1)
            timeout {
                requestTimeoutMillis = TIMEOUT_VALUE
            }
        }.body<String>()
        println("Result : $result")
    }
}
package com.nirwashh.android.kmmexample.network

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

class KtorNetworkLayer : NetworkLayer {
    private val client = HttpClient {
        install(ContentNegotiation) {
            json(
                Json {
                    prettyPrint = true
                    ignoreUnknownKeys = true
                }
            )
        }
        install(HttpTimeout)
    }
    override suspend fun getCharacters(): CharacterResponse {
        return client.get("$BASE_ADDRESS/character") {
            parameter("page", 1)
            timeout {
                requestTimeoutMillis = TIMEOUT_VALUE
            }
        }.body()
    }
}
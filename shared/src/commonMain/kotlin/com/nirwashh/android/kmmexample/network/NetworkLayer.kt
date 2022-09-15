package com.nirwashh.android.kmmexample.network

interface NetworkLayer {
    suspend fun getCharacters(): CharacterResponse
}
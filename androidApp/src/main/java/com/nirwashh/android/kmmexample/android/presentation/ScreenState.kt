package com.nirwashh.android.kmmexample.android.presentation

import androidx.lifecycle.LiveData

data class ScreenState(
    val characters: LiveData<List<ServerCharacter>>
)

package com.nirwashh.android.kmmexample.android.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nirwashh.android.kmmexample.network.KtorNetworkLayer
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharactersViewModel @Inject constructor() : ViewModel() {

    private val network = KtorNetworkLayer()

    fun loadCharacters() {
        viewModelScope.launch {
            network.getCharacters()
        }
    }
}
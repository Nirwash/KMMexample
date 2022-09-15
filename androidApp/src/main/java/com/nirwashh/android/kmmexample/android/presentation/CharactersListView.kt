package com.nirwashh.android.kmmexample.android

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import com.nirwashh.android.kmmexample.android.presentation.CharactersViewModel
import dagger.hilt.android.lifecycle.HiltViewModel

@Composable
fun CharactersListView(
    viewModel: CharactersViewModel
) {
    LaunchedEffect(key1 = "Init") {
        viewModel.loadCharacters()
    }
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Hi!")
    }
}
package com.example.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun ScreenRank(toNextScreen: ()->Unit = {}) {
    Column {
        Text(text = "ranking")
        Button(onClick = { toNextScreen() }) {
            Text(text = "Back")
        }
    }
}
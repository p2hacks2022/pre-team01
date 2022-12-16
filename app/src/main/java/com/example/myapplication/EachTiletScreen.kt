package com.example.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun ScreenToilet1(toNextScreen: ()->Unit = {}) {
    Column {
        Text(text = "Toilet1")
        Button(onClick = { toNextScreen() }) {
            Text(text = "Back")
        }
    }
}

@Composable
fun ScreenToilet2(toNextScreen: ()->Unit = {}) {
    Column {
        Text(text = "Toilet2")
        Button(onClick = { toNextScreen() }) {
            Text(text = "Back")
        }
    }
}

@Composable
fun ScreenToilet3(toNextScreen: ()->Unit = {}) {
    Column {
        Text(text = "Toilet3")
        Button(onClick = { toNextScreen() }) {
            Text(text = "Back")
        }
    }
}

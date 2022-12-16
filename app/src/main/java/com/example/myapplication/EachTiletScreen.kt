package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

@Composable
fun ScreenManToilet1(toNextScreen: ()->Unit = {}) {
    Column {
        Text(text = "Toilet1")
        Image(
            painter = painterResource(R.drawable.a),
            contentDescription = "toilet image",
        )
        Text(text = "評価")
        Row(){
            IconToggleButtonSample()
            IconToggleButtonSample()
            IconToggleButtonSample()
        }
        Text(text = "レビューを投稿できます")
        Input()
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
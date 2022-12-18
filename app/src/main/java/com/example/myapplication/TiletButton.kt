package com.example.myapplication

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

/*
@Composable
Icon(Icons.Default.Person,contentDescription="person")
*/

// レビューを入力する機能
@Composable
fun Input(){
    var showText by remember{mutableStateOf(true)}
    var input by remember{mutableStateOf("")}
    Column{
        TextField(
            value = input,
            onValueChange={input=it}
        )
        Row() {
            Button(onClick = {
                input = ""
                showText = !showText
            }) { Text(text = "Send") }
            if (!showText) {
                Text(text = "レビューが投稿されました")
            }
        }

    }
}

// レビューにて、☆をクリックするとエフェクトと同時に色が変化する機能
@Preview(showBackground = true)
@Composable
fun IconToggleButtonSample() {
    var checked = remember { mutableStateOf(false) }
    IconToggleButton(
        checked = checked.value,
        onCheckedChange = { checked.value = it })
    {
        val tint = animateColorAsState(
            if (checked.value) Color(0xFFEC407A) else Color(0xFFB0BEC5)
        )
        Icon(
            Icons.Filled.Star, contentDescription = "お気に入り",
            tint = tint.value)
    }
}

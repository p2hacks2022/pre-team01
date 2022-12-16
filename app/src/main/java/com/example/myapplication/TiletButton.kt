package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.res.painterResource

/*
@Composable
Icon(Icons.Default.Person,contentDescription="person")
*/

@Composable
fun Input(){
    var showText by remember{mutableStateOf(true)}
    var input by remember{mutableStateOf("")}
    Column{
        TextField(
            value = input,
            onValueChange={input=it}
        )
        Button(onClick={
            input=""
            showText=!showText
        }){Text(text="Send")}
        if(!showText){
            Text(text="レビューが投稿されました")
        }

    }
}

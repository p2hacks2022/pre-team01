package com.example.myapplication

import androidx.compose.animation.animateColorAsState
import androidx.compose.ui.graphics.Color
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.ui.unit.dp
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun RankIcon(rank: Double){
    val tint1 = animateColorAsState(
        Color(0xFFFFEB3B)
    )
    val tint2 = animateColorAsState(
        Color(0xFFB0BEC5)
    )
    if(rank == 0.0){
        Row() {
            Icon(
                Icons.Filled.Star, contentDescription = "お気に入り",
                modifier = Modifier.size(10.dp),
                tint = tint2.value
            )
            Icon(
                Icons.Filled.Star, contentDescription = "お気に入り",
                modifier = Modifier.size(10.dp),
                tint = tint2.value
            )
            Icon(
                Icons.Filled.Star, contentDescription = "お気に入り",
                modifier = Modifier.size(10.dp),
                tint = tint2.value
            )
            Text(
                "$rank"
            )
        }
    } else if(rank >= 1.0 && rank < 2.0){
        Row() {
            Icon(
                Icons.Filled.Star, contentDescription = "お気に入り",
                modifier = Modifier.size(10.dp),
                tint = tint1.value
            )
            Icon(
                Icons.Filled.Star, contentDescription = "お気に入り",
                modifier = Modifier.size(10.dp),
                tint = tint2.value
            )
            Icon(
                Icons.Filled.Star, contentDescription = "お気に入り",
                modifier = Modifier.size(10.dp),
                tint = tint2.value
            )
            Text(
                "$rank"
            )
        }
    } else if(rank >= 2.0 && rank < 3.0){
        Row() {
            Icon(
                Icons.Filled.Star, contentDescription = "お気に入り",
                modifier = Modifier.size(10.dp),
                tint = tint1.value
            )
            Icon(
                Icons.Filled.Star, contentDescription = "お気に入り",
                modifier = Modifier.size(10.dp),
                tint = tint1.value
            )
            Icon(
                Icons.Filled.Star, contentDescription = "お気に入り",
                modifier = Modifier.size(10.dp),
                tint = tint2.value
            )
            Text(
                "$rank",
                       // fontSize = 10.sp
            )
        }
    } else if(rank == 3.0) {
        Row() {
            Icon(
                Icons.Filled.Star, contentDescription = "お気に入り",
                modifier = Modifier.size(10.dp),
                tint = tint1.value
            )
            Icon(
                Icons.Filled.Star, contentDescription = "お気に入り",
                modifier = Modifier.size(10.dp),
                tint = tint1.value
            )
            Icon(
                Icons.Filled.Star, contentDescription = "お気に入り",
                modifier = Modifier.size(10.dp),
                tint = tint1.value
            )
            Text(
                "$rank",
            //fontSize = 10.sp
            )
        }
    }
}

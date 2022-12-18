package com.example.myapplication

import androidx.compose.animation.animateColorAsState
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.dp
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star

// 評価によって表示の変わる☆☆☆のアイコンの設定
@Composable
fun RankIcon(rank: Double) {
    val tint1 = animateColorAsState(
        Color(0xFFFFEB3B)
    )
    val tint2 = animateColorAsState(
        Color(0xFFB0BEC5)
    )
    if (rank == 0.0) {
        Row() {
            Icon(
                Icons.Filled.Star, contentDescription = "お気に入り",
                tint = tint2.value
            )
            Icon(
                Icons.Filled.Star, contentDescription = "お気に入り",
                tint = tint2.value
            )
            Icon(
                Icons.Filled.Star, contentDescription = "お気に入り",
                tint = tint2.value
            )
            Text(
                "$rank",
                modifier = Modifier
                    .padding(
                        top = 5.dp
                    )
            )
        }
    } else if (rank >= 1.0 && rank < 2.0) {
        Row() {
            Icon(
                Icons.Filled.Star, contentDescription = "お気に入り",
                tint = tint1.value
            )
            Icon(
                Icons.Filled.Star, contentDescription = "お気に入り",
                tint = tint2.value
            )
            Icon(
                Icons.Filled.Star, contentDescription = "お気に入り",
                tint = tint2.value
            )
            Text(
                "$rank",
                modifier = Modifier
                    .padding(
                        top = 5.dp
                    )
            )
        }
    } else if (rank >= 2.0 && rank < 3.0) {
        Row() {
            Icon(
                Icons.Filled.Star, contentDescription = "お気に入り",
                tint = tint1.value
            )
            Icon(
                Icons.Filled.Star, contentDescription = "お気に入り",
                tint = tint1.value
            )
            Icon(
                Icons.Filled.Star, contentDescription = "お気に入り",
                tint = tint2.value
            )
            Text(
                "$rank",
                modifier = Modifier
                    .padding(
                        top = 5.dp
                    )
            )
        }
    } else if (rank == 3.0) {
        Row() {
            Icon(
                Icons.Filled.Star, contentDescription = "お気に入り",
                tint = tint1.value
            )
            Icon(
                Icons.Filled.Star, contentDescription = "お気に入り",
                tint = tint1.value
            )
            Icon(
                Icons.Filled.Star, contentDescription = "お気に入り",
                tint = tint1.value
            )
            Text(
                "$rank",
                modifier = Modifier
                    .padding(
                        top = 5.dp
                    )
            )
        }
    }
}

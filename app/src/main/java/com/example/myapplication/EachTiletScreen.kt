package com.example.myapplication

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

@Composable
fun ScreenManToilet1(toNextScreen: ()->Unit = {}) {
    val tint1 = animateColorAsState(
        Color(0xFFEC407A)
    )
    val tint2 = animateColorAsState(
        Color(0xFFB0BEC5)
    )

    Column {
        Text(text = "Toilet1")
        Image(
            painter = painterResource(R.drawable.a),
            contentDescription = "toilet image",
        )

        Text(text = "総合レビュー")
        Row(){
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
        }

        Text(text = "備考")
        Text(text = "女子トイレと男子トイレ間違えやすい")

        Text(text = "空き状況")
        Text(text = "小")
        Text(text = "大")

        Text(text = "ペーパー状況")

        Text(text = "清掃状況")
        Text(text = "２時間前")

        Text(text = "〇・・・空　×・・・満　◎・・・清掃後未使用")

        Button(onClick = {}) {
            Text(text = "予約")
        }

        Text(text = "レビュー")
        Row(){
            IconToggleButtonSample()
            IconToggleButtonSample()
            IconToggleButtonSample()
        }
        Text(text = "レビューを投稿できます")
        Input()

        Text(text = "レビュー")
        Text(text = "レビュー")
        Text(text = "レビュー")
        Text(text = "レビュー")

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
package com.example.myapplication

import ScrollBoxes
import ScrollBoxes2
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.IconButtonSample_5F
import com.example.myapplication.ui.theme.ScrollBoxes3
import kotlinx.coroutines.NonCancellable.children

@Composable
fun ScreenManToilet1(toNextScreen: ()->Unit = {}) {
    val tint1 = animateColorAsState(
        Color(0xFFFFEB3B)
    )
    val tint2 = animateColorAsState(
        Color(0xFFB0BEC5)
    )

    Column {
        Text(text = "Toilet1")

        ScrollBoxes3(id = R.drawable.a, id2 = R.drawable.a, id3 = R.drawable.a, filedescription = "toilet image")

        Text(text = "総合レビュー")
        Row(horizontalArrangement =  Arrangement.Center){
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
            Text(text = " 2.0")
        }

        Text(text = "備考")
        Text(text = "女子トイレと男子トイレ間違いやすい")

        Text(text = "空き状況")
        IconButtonSample_5F(R.drawable.large_urinal, "l_icon") {}
        IconButtonSample_5F(R.drawable.large_urinal_no1, "l_button") {}
        IconButtonSample_5F(R.drawable.large_urinal_no2, "l_button") {}
        IconButtonSample_5F(R.drawable.large_urinal_no3, "l_button") {}
        IconButtonSample_5F(R.drawable.urinal, "s_icon") {}
        IconButtonSample_5F(R.drawable.urinal_no1, "s_button") {}
        IconButtonSample_5F(R.drawable.urinal_no2, "s_button") {}
        IconButtonSample_5F(R.drawable.urinal_no3, "s_button") {}
        IconButtonSample_5F(R.drawable.urinal_no4, "s_button") {}
        IconButtonSample_5F(R.drawable.urinal_no5, "s_buttona") {}
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
        Text(text = "星をタップしてください")

        Text(text = "レビューを投稿できます")
        Input()

        Text(text = "みんなのレビュー")

        ScrollBoxes2()

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
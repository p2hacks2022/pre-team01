package com.example.myapplication

import ScrollBoxes2
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.IconButtonSample_5F
import com.example.myapplication.ui.theme.ScrollBoxes3
import kotlinx.coroutines.NonCancellable.children


@Preview
@Composable
fun ScreenManToilet1(toNextScreen: () -> Unit = {}) {
    val tint1 = animateColorAsState(
        Color(0xFFFFEB3B)
    )
    val tint2 = animateColorAsState(
        Color(0xFFB0BEC5)
    )

    Column(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        Text(text = "Toilet1")

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            // トイレ画像
            ScrollBoxes3(id = R.drawable.a, id2 = R.drawable.a, id3 = R.drawable.a, filedescription = "toilet image")

            Column(
                modifier = Modifier
                    .size(250.dp, 100.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    // レビュー評価
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
                // 備考
                Text(text = "")
                Text(text = "備考")
                Text(text = "女子トイレと男子トイレを間違えやすい")
                Text(text = "")
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp)
        ) {
            Text(text = "空き状況")
        }

        var toiletSize = 65
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            IconButtonSample_5F(R.drawable.large_urinal, "l_icon", toiletSize) {}
            IconButtonSample_5F(R.drawable.large_urinal_no1, "l_button", toiletSize) {}
            IconButtonSample_5F(R.drawable.large_urinal_no2, "l_button", toiletSize) {}
            IconButtonSample_5F(R.drawable.large_urinal_no3, "l_button", toiletSize) {}
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            IconButtonSample_5F(R.drawable.urinal, "s_icon", toiletSize) {}
            IconButtonSample_5F(R.drawable.urinal_no1, "s_button", toiletSize) {}
            IconButtonSample_5F(R.drawable.urinal_no2, "s_button", toiletSize) {}
            IconButtonSample_5F(R.drawable.urinal_no3, "s_button", toiletSize) {}
            IconButtonSample_5F(R.drawable.urinal_no4, "s_button", toiletSize) {}
            IconButtonSample_5F(R.drawable.urinal_no5, "s_button", toiletSize) {}
        }

        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            Text(text = "〇・・・空　×・・・満")
        }
        
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Column (){
                Button(onClick = {}) {
                    Text(text = "予約")
                }
            }
            Column() {
                Text(text = "ペーパー状況")
            }
            Column() {
                Text(text = "清掃状況")
                Text(text = "２時間前")
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp)
        ){
            Text(text = "レビュー")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
        ){
            IconToggleButtonSample()
            IconToggleButtonSample()
            IconToggleButtonSample()
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
        ){
            Text(text = "星をタップしてください")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
        ){
            Text(text = "レビューを投稿できます")
        }

        Input()

        Row(
            modifier = Modifier
                .fillMaxWidth()
        ){
            Text(text = "みんなのレビュー")
        }

        ScrollBoxes2()
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom
    ) {
        Button(onClick = { toNextScreen() }) {
            Text(text = "Back")
        }
    }
}


@Composable
fun ScreenToilet2(toNextScreen: () -> Unit = {}) {
    Column {
        Text(text = "Toilet2")
        Button(onClick = { toNextScreen() }) {
            Text(text = "Back")
        }
    }
}

@Composable
fun ScreenToilet3(toNextScreen: () -> Unit = {}) {
    Column {
        Text(text = "Toilet3")
        Button(onClick = { toNextScreen() }) {
            Text(text = "Back")
        }
    }
}
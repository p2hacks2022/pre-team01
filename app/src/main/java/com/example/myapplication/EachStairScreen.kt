package com.example.myapplication

import IconButtonGender
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.*

// ホーム画面の設定
@Composable
fun MainScreen(toNextScreen: (String) -> Unit = {}) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // タイトルロゴを表示
        Image(
            painter = painterResource(R.drawable.logo_ver1),
            contentDescription = "logo",
            modifier = Modifier
                .width(300.dp)
                .height(120.dp)
        )
    }

    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceEvenly,
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(bottom = 20.dp),
            verticalArrangement = Arrangement.Bottom
        ) {
            // 本棟1F～5Fの階層選択ボタンを表示
            IconButtonSample_5F(R.drawable.fun_5floar, "5F", 120) { toNextScreen("5F") }
            IconButtonSample_4F(R.drawable.fun_4floar, "4F") { toNextScreen("4F") }
            IconButtonSample_3F(R.drawable.fun_3floar, "3F") { toNextScreen("3F") }
            IconButtonSample_2F(R.drawable.fun_2floar, "2F") { toNextScreen("2F") }
            IconButtonSample_1F(R.drawable.fun_1floar, "1F") { toNextScreen("1F") }
        }

        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(top = 160.dp),
            verticalArrangement = Arrangement.Center
        ) {
            // 研究棟1F～2Fの階層選択ボタンを表示
            IconButtonSample_R1F(R.drawable.fun_research1floar, "R1F") { toNextScreen("R1F") }
            IconButtonSample_R2F(R.drawable.fun_research2floar, "R2F") { toNextScreen("R2F") }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.End
    ) {
        // ランキングに遷移するボタンを表示
        IconButtonSample_rank(R.drawable.toileranking_ver2, "rank") { toNextScreen("rank") }
    }
}

// トイレごとに遷移する画面の設定（1F）
@Composable
fun Screen1F(toNextScreen: () -> Unit = {}) {
    Column {
        Text(text = "1F")
        Button(onClick = { toNextScreen() }) {
            Text(text = "Back")
        }
    }
}

// トイレごとに遷移する画面の設定（2F）
@Composable
fun Screen2F(toNextScreen: () -> Unit = {}) {
    Column {
        Text(text = "2F")
        Button(onClick = { toNextScreen() }) {
            Text(text = "Back")
        }
    }
}

// トイレごとに遷移する画面の設定（3F）
@Composable
fun Screen3F(toNextScreen: () -> Unit = {}) {
    Column {
        Text(text = "3F")
        Button(onClick = { toNextScreen() }) {
            Text(text = "Back")
        }
    }
}

// トイレごとに遷移する画面の設定（4F）
@Composable
fun Screen4F(toNextScreen: () -> Unit = {}) {
    Column {
        Text(text = "4F")
        Button(onClick = { toNextScreen() }) {
            Text(text = "Back")
        }
    }
}

// トイレごとに遷移する画面の設定（5F）
@Composable
fun Screen5F(toNextScreen: (String) -> Unit = {}) {

    val fontSize = 23 // フォントサイズ

    Column(
        Modifier
            .fillMaxSize()
    ) {
        Text(text = "5F", fontSize = 30.sp)

        Box(
            modifier = Modifier
                .padding(top = 40.dp)
        ) {
            ZoomImageSample()
        }

        Row(
            modifier = Modifier
                .padding(top = 105.dp)
                .fillMaxWidth()
                .background(Color(0xFFFFEDDB)),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "トイレを選択してください", fontSize = 20.sp, modifier = Modifier.padding(end = 10.dp))
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFFFEDDB))
            //horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            IconButtonGender(
                number = "①",
                gender = "Man",
                fontSize = fontSize,
                file = R.drawable.man
            ) { toNextScreen("toilet1") }

            IconButtonGender(
                number = "①",
                gender = "Woman",
                fontSize = fontSize,
                file = R.drawable.woman
            ) { toNextScreen("toilet2") }
            IconButtonGender(
                number = "①",
                gender = "Accessible",
                fontSize = fontSize,
                file = R.drawable.wheelchair_man
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFFFEDDB)),
            //horizontalArrangement = Arrangement.SpaceEvenly,
        ) {
            IconButtonGender(
                number = "②",
                gender = "Man",
                fontSize = fontSize,
                file = R.drawable.man
            )
            IconButtonGender(
                number = "②",
                gender = "Woman",
                fontSize = fontSize,
                file = R.drawable.woman
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFFFEDDB)),
            //horizontalArrangement = Arrangement.SpaceEvenly,
        ) {
            IconButtonGender(
                number = "③",
                gender = "Man",
                fontSize = fontSize,
                file = R.drawable.man
            )
            IconButtonGender(
                number = "③",
                gender = "Woman",
                fontSize = fontSize,
                file = R.drawable.woman
            )
            IconButtonGender(
                number = "③",
                gender = "Accessible",
                fontSize = fontSize,
                file = R.drawable.wheelchair_man
            )
        }
    }
}

// トイレごとに遷移する画面の設定（R1F）
@Composable
fun ScreenR1F(toNextScreen: () -> Unit = {}) {
    Column {
        Text(text = "R1F")
        Button(onClick = { toNextScreen() }) {
            Text(text = "Back")
        }
    }
}

// トイレごとに遷移する画面の設定（R2F）
@Composable
fun ScreenR2F(toNextScreen: () -> Unit = {}) {
    Column {
        Text(text = "R2F")
        Button(onClick = { toNextScreen() }) {
            Text(text = "Back")
        }
    }
}


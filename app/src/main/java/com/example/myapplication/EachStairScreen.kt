package com.example.myapplication

import IconButtonGender
import IconButtonToilet
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.*


@Composable
fun MainScreen(toNextScreen: (String) -> Unit = {}) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.logo_ver1),
            contentDescription = "logo",
            modifier = Modifier
                .width(300.dp)
                .height(88.dp)
        )
    }
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column() {
            IconButtonSample_5F(R.drawable.fun_5floar, "5F") { toNextScreen("5F") }
            IconButtonSample_4F(R.drawable.fun_4floar, "4F") { toNextScreen("4F") }
            IconButtonSample_3F(R.drawable.fun_3floar, "3F") { toNextScreen("3F") }
            IconButtonSample_2F(R.drawable.fun_2floar, "2F") { toNextScreen("2F") }
            IconButtonSample_1F(R.drawable.fun_1floar, "1F") { toNextScreen("1F") }
        }
        Column() {
            IconButtonSample_R1F(R.drawable.fun_research1floar, "R1F") { toNextScreen("R1F") }
            IconButtonSample_R2F(R.drawable.fun_research2floar, "R2F") { toNextScreen("R2F") }
        }
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        IconButtonSample_rank(R.drawable.a, "rank") { toNextScreen("rank") }
    }
}

@Composable
fun Screen1F(toNextScreen: () -> Unit = {}) {
    Column {
        Text(text = "1F")
        Button(onClick = { toNextScreen() }) {
            Text(text = "Back")
        }
    }
}

@Composable
fun Screen2F(toNextScreen: () -> Unit = {}) {
    Column {
        Text(text = "2F")
        Button(onClick = { toNextScreen() }) {
            Text(text = "Back")
        }
    }
}

@Composable
fun Screen3F(toNextScreen: () -> Unit = {}) {
    Column {
        Text(text = "3F")
        Button(onClick = { toNextScreen() }) {
            Text(text = "Back")
        }
    }
}

@Composable
fun Screen4F(toNextScreen: () -> Unit = {}) {
    Column {
        Text(text = "4F")
        Button(onClick = { toNextScreen() }) {
            Text(text = "Back")
        }
    }
}

@Composable
fun Screen5F(toNextScreen: (String) -> Unit = {}) {

    val fontSize = 23 // フォントサイズ

    Column(
        Modifier
            .fillMaxSize()
    ) {
        Text(text = "5F")
        ZoomImageSample()


        Row(
            modifier = Modifier
                .padding(top = 145.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            Text(text = "トイレを選択してください", fontSize = 20.sp)
        }

        Row(
            modifier = Modifier
                .padding(top = 5.dp)
                .fillMaxWidth(),
            //horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            IconButtonGender(number = "①", gender = "Man", fontSize = fontSize, file = R.drawable.man)
            IconButtonGender(number = "①", gender = "Woman", fontSize = fontSize, file = R.drawable.woman)
            IconButtonGender(number = "①", gender = "Accessible", fontSize = fontSize, file = R.drawable.wheelchair_man)
        }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            //horizontalArrangement = Arrangement.SpaceEvenly,
        ) {
            IconButtonGender(number = "②", gender = "Man", fontSize = fontSize, file = R.drawable.man)
            IconButtonGender(number = "②", gender = "Woman", fontSize = fontSize, file = R.drawable.woman)
        }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            //horizontalArrangement = Arrangement.SpaceEvenly,
        ) {
            IconButtonGender(number = "③", gender = "Man", fontSize = fontSize, file = R.drawable.man)
            IconButtonGender(number = "③", gender = "Woman", fontSize = fontSize, file = R.drawable.woman)
            IconButtonGender(number = "③", gender = "Accessible", fontSize = fontSize, file = R.drawable.wheelchair_man)
        }

        Row(
            Modifier
                .fillMaxSize(),
            verticalAlignment = Alignment.Bottom
        ) {
            Button(
                onClick = { toNextScreen("main") },
                Modifier.padding(10.dp)
            ) {
                Text(text = "Back")
            }

        }
    }
}


@Composable
fun ScreenR1F(toNextScreen: () -> Unit = {}) {
    Column {
        Text(text = "R1F")
        Button(onClick = { toNextScreen() }) {
            Text(text = "Back")
        }
    }
}

@Composable
fun ScreenR2F(toNextScreen: () -> Unit = {}) {
    Column {
        Text(text = "R2F")
        Button(onClick = { toNextScreen() }) {
            Text(text = "Back")
        }
    }
}
package com.example.myapplication


import androidx.compose.animation.shrinkHorizontally

import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.*


@Composable
fun MainScreen(toNextScreen: (String) -> Unit = {}) {

    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column() {
            IconButtonSample_5F(R.drawable.fun_5, "5F") { toNextScreen("5F") }
            IconButtonSample_4F(R.drawable.fun_4, "4F") { toNextScreen("4F") }
            IconButtonSample_3F(R.drawable.fun_3, "3F") { toNextScreen("3F") }
            IconButtonSample_2F(R.drawable.fun_2, "2F") { toNextScreen("2F") }
            IconButtonSample_1F(R.drawable.fun_1, "1F") { toNextScreen("1F") }
        }
        Column() {
            IconButtonSample_R2F(R.drawable.fun_reserch2, "R2F") { toNextScreen("R2F") }
            IconButtonSample_R1F(R.drawable.fun_research1, "R1F") { toNextScreen("R1F") }
        }
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        IconButtonSample_rank(R.drawable.a, "rank") { toNextScreen("rank") }

    Image(
        painter = painterResource(R.drawable.logo_ver1),
        contentDescription = "logo",
    )
    Column {
        IconButtonSample_5F(R.drawable.fun_5_text,"5F"){ toNextScreen("5F")  }
        IconButtonSample_4F(R.drawable.fun_4_text,"4F"){ toNextScreen("4F")  }
        IconButtonSample_5F(R.drawable.fun_3_text,"3F"){ toNextScreen("3F")  }
        IconButtonSample_2F(R.drawable.fun_2_text,"2F"){ toNextScreen("2F")  }
        IconButtonSample_1F(R.drawable.fun_1_text,"1F"){ toNextScreen("1F")  }
        IconButtonSample_R1F(R.drawable.fun_research1_text,"R1F"){ toNextScreen("R1F")  }
        IconButtonSample_R2F(R.drawable.fun_reserch2_text,"R2F"){ toNextScreen("R2F")  }
        IconButtonSample_rank(R.drawable.a,"rank"){ toNextScreen("rank")  }

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
    Column {
        Text(text = "5F")
        Column {
            Button(
                onClick = { toNextScreen("main") },
                Modifier.padding(10.dp)
            ) {
                Text(text = "Back")
            }
            Button(
                onClick = { toNextScreen("toilet1") },
                Modifier.padding(10.dp)
            ) {

fun Screen5F(toNextScreen: (String)->Unit = {}) {

    Column (
        Modifier
            .fillMaxSize()
    ){
        Text(text = "5F")
        ZoomImageSample()
        Row(
            Modifier
                .fillMaxSize(),
            verticalAlignment = Alignment.Bottom ,
        ) {
            Button(onClick = { toNextScreen("toilet1") },
                Modifier.padding(10.dp)) {

                Text(text = "Toilet1")
            }
            Button(
                onClick = { toNextScreen("toilet2") },
                Modifier.padding(10.dp)
            ) {
                Text(text = "Toilet2")
            }
            Button(
                onClick = { toNextScreen("toilet3") },
                Modifier.padding(10.dp)
            ) {
                Text(text = "Toilet3")
            }
            Button(onClick = { toNextScreen("main") },
                Modifier.padding(10.dp)) {
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


@Composable
fun ScreenRank(toNextScreen: () -> Unit = {}) {
    Column {
        Text(text = "ranking")
        Button(onClick = { toNextScreen() }) {
            Text(text = "Back")
        }
    }
}

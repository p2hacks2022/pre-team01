package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "screen1") {
                composable(route = "screen1") {
                    Screen1 (){ screenName ->
                        navController.navigate(screenName)
                    }
                }
                composable(route = "screen2",) {
                    Screen2 {
                        navController.navigate("screen1")
                    }
                }
                composable(route = "screen3",) {
                    Screen3 {
                        navController.navigate("screen1")
                    }
                }
                composable(route = "screen4",) {
                    Screen4 {
                        navController.navigate("screen1")
                    }
                }
                composable(route = "screen5",) {
                    Screen5 {
                        navController.navigate("screen1")
                    }
                }
            }
        }
    }
}

@Composable
fun Screen1(toNextScreen: (String) -> Unit = {}) {
    Column {
        Text(text = "Screen 1")
        Button(onClick = { toNextScreen("screen2")  }) {
            Text(text = "2")
        }
        Button(onClick = { toNextScreen("screen3") }) {
            Text(text = "3")
        }
        Button(onClick = { toNextScreen("screen4") }) {
            Text(text = "4")
        }
        Button(onClick = { toNextScreen("screen5") }) {
            Text(text = "5")
        }
    }
}

@Composable
fun Screen2(toNextScreen: ()->Unit = {}) {
    Column {
        Text(text = "Screen 2")
        Button(onClick = { toNextScreen() }) {
            Text(text = "Back")
        }
    }
}

@Composable
fun Screen3(toNextScreen: ()->Unit = {}) {
    Column {
        Text(text = "Screen 3")
        Button(onClick = { toNextScreen() }) {
            Text(text = "Back")
        }
    }
}

@Composable
fun Screen4(toNextScreen: ()->Unit = {}) {
    Column {
        Text(text = "Screen 4")
        Button(onClick = { toNextScreen() }) {
            Text(text = "Back")
        }
    }
}

@Composable
fun Screen5(toNextScreen: ()->Unit = {}) {
    Column {
        Text(text = "Screen 5")
        Button(onClick = { toNextScreen() }) {
            Text(text = "Back")
        }
    }
}


@Composable
fun IconButtonSample(fileid: Int, filedescription: String) {
    IconButton(onClick = { /* Do something */ }) {
        Image(
            painter = painterResource(fileid),
            contentDescription = filedescription
        )
    }
}

@Composable
fun MainScreen(onClickButton: (String, Int)->Unit = { _,_ -> }) {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ){
        Column(){

            IconButtonSample(R.drawable.a,"fire")                     }

    }
}

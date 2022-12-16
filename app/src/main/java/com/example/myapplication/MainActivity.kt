package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "main") {
                composable(route = "main") {
                    MainScreen (){ screenName ->
                        navController.navigate(screenName)
                    }
                }
                composable(route = "1F",) {
                    Screen1F {
                        navController.navigate("main")
                    }
                }
                composable(route = "2F",) {
                    Screen2F {
                        navController.navigate("main")
                    }
                }
                composable(route = "3F",) {
                    Screen3F {
                        navController.navigate("main")
                    }
                }
                composable(route = "4F",) {
                    Screen4F {
                        navController.navigate("main")
                    }
                }
                composable(route = "5F",) {
                    Screen5F { screenName ->
                        navController.navigate(screenName)
                    }
                }
                composable(route = "toilet1",) {
                    ScreenToilet1 {
                        navController.navigate("5F")
                    }
                }
                composable(route = "toilet2",) {
                    ScreenToilet2 {
                        navController.navigate("5F")
                    }
                }
                composable(route = "toilet3",) {
                    ScreenToilet3 {
                        navController.navigate("5F")
                    }
                }
                composable(route = "R1F",) {
                    ScreenR1F {
                        navController.navigate("main")
                    }
                }
                composable(route = "R2F",) {
                    ScreenR2F {
                        navController.navigate("main")
                    }
                }
                composable(route = "rank",) {
                    ScreenRank {
                        navController.navigate("main")
                    }
                }
            }
        }
    }
}


package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.runtime.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column {
                        Greeting("Takuma")
                        Message("Takuma", "Hello")
                        MyButton()
                        Counter()
                        Toggle()
                        Input()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hi $name!", fontSize = 30.sp)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        Column {
            Greeting("Android")
            Message(username = "takuma", body = "hello")
        }
    }
}

@Composable
fun Message(username: String, body: String) {
    Column {
        Row {
            Icon(Icons.Default.Person, contentDescription = "person")
            Text(text = username)
        }
    }
    Text(text = body)
}

@Composable
fun MyButton(){
    Button(
        onClick = { println("Hello, World")}
    ){
        Text(text = "Click")
    }
}

@Composable
fun Counter(){
    var count by remember { mutableStateOf(0) }
    Column{
        Text(text = "Count: $count")
        Button(
            onClick = { count++}
        ){
            Text(text = "Click")
        }
    }
}

@Composable
fun Toggle(){
    var showText by remember { mutableStateOf(true) }
    Column{
        Button(onClick = { showText = !showText}) {
            Text(text = "Click")
        }
        if (showText){
            Text(text = "Hello")
        }
    }
}

@Composable
fun Input(){
    var input by remember { mutableStateOf("") }
    Column{
        TextField(
            value = input,
            onValueChange = { input =it }
        )
        Button(onClick = {
            input = ""
        }) { Text(text = "Send")}

    }
}

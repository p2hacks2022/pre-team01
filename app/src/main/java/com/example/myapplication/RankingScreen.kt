package com.example.myapplication

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.border
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun ScreenRank(toNextScreen: () -> Unit = {}) {
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top
            )
    {
        Row(
            //modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(R.drawable.crown),
                contentDescription = null,
                modifier = Modifier
                    .size(80.dp)
                    .padding(
                        top = 30.dp,
                        start = 30.dp
                    )
            )

            Text(
                text = "トイレランキング",
                modifier = Modifier.padding(
                    top = 30.dp,
                    end = 30.dp
                ),
                fontSize = 35.sp
            )

        }
        Row(
            //modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "男子トイレ",
                modifier = Modifier.padding(
                    top = 30.dp,
                    start = 30.dp
                ),
                fontSize = 35.sp
            )

            Text(
                text = "女子トイレ",
                modifier = Modifier.padding(
                    top = 30.dp,
                    end = 30.dp
                ),
                fontSize = 35.sp
            )

        }
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
fun Rank() {

}



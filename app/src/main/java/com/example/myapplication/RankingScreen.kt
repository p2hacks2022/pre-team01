package com.example.myapplication

import android.graphics.fonts.FontFamily
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.sp

val titlesize = 120
val subtitlesize = 25
val textsize = 15
val iconsize =30
val photosize =140
val space = 25

@Preview
@Composable
fun ScreenRank(toNextScreen: () -> Unit = {}) {
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top
            )
    {
        Image(
            painter = painterResource(R.drawable.toileranking),
            contentDescription = null,
            modifier = Modifier
                .size(410.dp,titlesize.dp)
                .padding(
                    top = space.dp,
                    bottom = space.dp
                )
        )

        Row(
            modifier = Modifier.size(410.dp,(subtitlesize + space).dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Mantoilet()
            Womantoilet()

        }
        Row(
            modifier = Modifier.size(410.dp,(textsize + photosize + space).dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Rank(R.drawable.gold_crown, name = "5階トイレ", R.drawable.crown, "5F")
            Rank(R.drawable.gold_crown, name = "5階トイレ", R.drawable.crown, "5F")
        }
        Row(
            modifier = Modifier.size(410.dp,(textsize + photosize + space).dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Rank(R.drawable.silver_crown, name = "5階トイレ", R.drawable.crown, "5F")
            Rank(R.drawable.silver_crown, name = "5階トイレ", R.drawable.crown, "5F")
        }
        Row(
            modifier = Modifier.size(410.dp,(textsize + photosize + space).dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Rank(R.drawable.bronze_crown, name = "5階トイレ", R.drawable.crown, "5F")
            Rank(R.drawable.bronze_crown, name = "5階トイレ", R.drawable.crown, "5F")
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
fun Rank(crownid: Int, name: String, fileid: Int, filedescription: String) {
    Column(){
        Row{
            Image(
                painter = painterResource(crownid),
                contentDescription = null,
                modifier = Modifier
                    .size(iconsize.dp)
            )
            Column(
                modifier = Modifier.size(120.dp,iconsize.dp),
                verticalArrangement = Arrangement.Bottom
            ) {
                Text(
                    text = " $name",
                    fontSize = textsize.sp
                )
            }
        }
        Image(
            painter = painterResource(fileid),
            contentDescription = filedescription,
            modifier = Modifier
                .size(photosize.dp)
        )
    }
}

@Composable
fun Mantoilet() {
    Row {
        Image(
            painter = painterResource(R.drawable.man),
            contentDescription = null,
            modifier = Modifier
                .size(iconsize.dp)
        )
        Text(
            text = "男子トイレ",
            fontSize = subtitlesize.sp
        )
    }
}

@Composable
fun Womantoilet() {
    Row {
        Image(
            painter = painterResource(R.drawable.woman),
            contentDescription = null,
            modifier = Modifier
                .size(iconsize.dp)
        )
        Text(
            text = "女子トイレ",
            fontSize = subtitlesize.sp
        )
    }
}






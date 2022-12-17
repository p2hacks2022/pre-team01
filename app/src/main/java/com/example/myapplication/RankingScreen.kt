package com.example.myapplication


import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.ui.unit.dp
import androidx.compose.material.*

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.ScrollBoxes3

val titlesize = 120
val subtitlesize = 25
val textsize = 15
val iconsize = 45
val photosize = 140
val space = 20

@Preview
@Composable
fun ScreenRank(toNextScreen: () -> Unit = {}) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top
    )
    {
        Image(
            painter = painterResource(R.drawable.toileranking),
            contentDescription = null,
            modifier = Modifier
                .size(410.dp, titlesize.dp)
                .padding(
                    top = space.dp,
                    bottom = space.dp
                )
        )

        Row(
            modifier = Modifier.size(410.dp, (subtitlesize + space).dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Mantoilet()
            Womantoilet()

        }
        Row(
            modifier = Modifier.size(410.dp, (iconsize + photosize + space).dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            Rank(R.drawable.gold_crown, name = "5階トイレ", R.drawable.crown, "5F", 3.0)
            Rank(R.drawable.gold_crown, name = "5階トイレ", R.drawable.crown, "5F", 3.0)
        }
        Row(
            modifier = Modifier.size(410.dp, (iconsize + photosize + space).dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            Rank(R.drawable.silver_crown, name = "5階トイレ", R.drawable.crown, "5F", 2.8)
            Rank(R.drawable.silver_crown, name = "5階トイレ", R.drawable.crown, "5F", 2.8)

        }
        Row(
            modifier = Modifier.size(410.dp, (iconsize + photosize + space).dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            Rank(R.drawable.bronze_crown, name = "5階トイレ", R.drawable.crown, "5F", 2.4)
            Rank(R.drawable.bronze_crown, name = "5階トイレ", R.drawable.crown, "5F", 2.4)

        }

    }
}

@Composable
fun Rank(crownid: Int, name: String, fileid: Int, filedescription: String, rank: Double) {
    Column() {
        Row {

            Image(
                painter = painterResource(crownid),
                contentDescription = null,
                modifier = Modifier
                    .size(iconsize.dp)
            )
            Column() {
                Text(
                    text = " $name",
                    fontSize = textsize.sp
                )
                RankIcon(rank)
            }
        }
        ScrollBoxes3(fileid1,fileid2,fileid3,filedescription)
        /*
        Image(
            painter = painterResource(fileid),
            contentDescription = filedescription,
            modifier = Modifier
                .size(photosize.dp)
        )
        */
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
            modifier = Modifier
                .padding(
                    top = 7.dp
                ),
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
            modifier = Modifier
            .padding(
                top = 7.dp
                ),
            fontSize = subtitlesize.sp
        )
    }
}







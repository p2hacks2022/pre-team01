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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.ScrollBoxes3

val titlesize = 120
val subtitlesize = 25
val textsize = 15
val iconsize =30
val photosize











=140
val space = 25

@Preview
@Composable
fun ScreenRank(toNextScreen: (String) -> Unit = {}) {
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
            Rank(R.drawable.gold_crown, name = "5階トイレ", R.drawable.crown, R.drawable.crown,R.drawable.crown,"5F"){toNextScreen("toilet1")}
            Rank(R.drawable.gold_crown, name = "5階トイレ", R.drawable.crown, R.drawable.crown,R.drawable.crown,"5F")
        }
        Row(
            modifier = Modifier.size(410.dp,(textsize + photosize + space).dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Rank(R.drawable.silver_crown, name = "5階トイレ", R.drawable.crown, R.drawable.crown,R.drawable.crown,"5F")
            Rank(R.drawable.silver_crown, name = "5階トイレ", R.drawable.crown, R.drawable.crown,R.drawable.crown,"5F")
        }
        Row(
            modifier = Modifier.size(410.dp,(textsize + photosize + space).dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Rank(R.drawable.bronze_crown, name = "5階トイレ", R.drawable.crown, R.drawable.crown,R.drawable.crown,"5F")
            Rank(R.drawable.bronze_crown, name = "5階トイレ", R.drawable.crown, R.drawable.crown,R.drawable.crown,"5F")
        }

    }

}

@Composable
fun Rank(crownid:Int, name: String, fileid1:Int,fileid2:Int,fileid3:Int, filedescription: String, toNextScreen: (String) -> Unit = {}) {
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
        RankingButton(fileid1,fileid2,fileid3,filedescription){
            toNextScreen("toilet1")
        }
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







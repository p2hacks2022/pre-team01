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
import androidx.compose.ui.unit.sp

val titlesize = 120
val subtitlesize = 25
val textsize = 15
val iconsize = 45
val photosize = 140
val space = 15

@Composable
fun ScreenRank(toNextScreen: (String) -> Unit = {}) {

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

            Rank(R.drawable.gold_crown, name = "5F講堂前トイレ", R.drawable.toilet5f_1_shou, R.drawable.toilet5f_1_dai,R.drawable.toilet5f_1,"5F", 2.9){toNextScreen("toilet1")}
            Rank(R.drawable.gold_crown, name = "5F講堂前トイレ", R.drawable.toilet5f_1, R.drawable.noimage,R.drawable.noimage,"5F", 3.0)

        }
        Row(
            modifier = Modifier.size(410.dp, (iconsize + photosize + space).dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            Rank(R.drawable.silver_crown, name = "5F東トイレ　　", R.drawable.toilet5f_2_door, R.drawable.toilet5f_2_dai,R.drawable.toilet5f_2_shou,"5F", 2.8)
            Rank(R.drawable.silver_crown, name = "5F東トイレ　　", R.drawable.noimage, R.drawable.noimage,R.drawable.noimage,"5F", 2.5)

        }
        Row(
            modifier = Modifier.size(410.dp, (iconsize + photosize + space).dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            Rank(R.drawable.bronze_crown, name = "5F西トイレ　　", R.drawable.toilet5f_3_door,R.drawable.toilet5f_3_dai,R.drawable.toilet5f_3_shou, "5F", 1.7)
            Rank(R.drawable.bronze_crown, name = "5F西トイレ　　", R.drawable.toilet5f_3_door_w,R.drawable.noimage,R.drawable.noimage, "5F", 2.4)

        }

    }
}

@Composable
fun Rank(crownid:Int, name: String, fileid1:Int,fileid2:Int,fileid3:Int, filedescription: String,  rank: Double, toNextScreen: (String) -> Unit = {}) {
    Column{
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

                RankingButton(fileid1, fileid2, fileid3, filedescription) {
                    toNextScreen("toilet1")
                }

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






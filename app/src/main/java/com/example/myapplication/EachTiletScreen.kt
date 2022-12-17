package com.example.myapplication

import ScrollBoxes2
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.IconButtonSample_5F
import com.example.myapplication.ui.theme.ScrollBoxes3
import kotlinx.coroutines.NonCancellable.children


@Preview
@Composable
fun ScreenManToilet1(toNextScreen: () -> Unit = {}) {
    val tint1 = animateColorAsState(
        Color(0xFFFFEB3B)
    )
    val tint2 = animateColorAsState(
        Color(0xFFB0BEC5)
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 5.dp),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 5.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            // トイレ画像
            ScrollBoxes3(
                id = R.drawable.toilet5f_1, id2 = R.drawable.toilet5f_1_dai,
                id3 = R.drawable.toilet5f_1_shou, filedescription = "toilet image", 170
            )

            Column(
                modifier = Modifier
                    .size(250.dp, 140.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    // タイトル
                    Text(text = "5F講堂前トイレ", fontSize = 20.sp)
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 5.dp, top = 15.dp),
                    //horizontalArrangement = Arrangement.Center
                ) {
                    // 備考
                    Text(text = "※備考")
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 5.dp, start = 15.dp, end = 5.dp),
                ) {
                    // 備考
                    Text(text = "・女子トイレと男子トイレを間")
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 5.dp, start = 30.dp, end = 5.dp),
                ) {
                    // 備考
                    Text(text = "違えやすい")
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 5.dp, start = 15.dp, end = 5.dp),
                ) {
                    // 備考
                    Text(text = "・利用者が多い")
                }
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 40.dp)
        ) {
            RankIcon(rank = 2.9)
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, top = 15.dp)
        ) {
            Text(text = "空き状況")
        }

        YoyakuButtons()

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "〇・・・空　×・・・満")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "--ペーパー状況--")
                Row(
                    modifier = Modifier
                        .padding(top = 5.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.toiletpaper),
                        contentDescription = "toiletpaper",
                        modifier = Modifier.size(20.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.toiletpaper),
                        contentDescription = "toiletpaper",
                        modifier = Modifier.size(20.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.toiletpaper_batu),
                        contentDescription = "toiletpaper_batu",
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "--清掃状況--")
                Text(text = "２時間前")
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, top = 15.dp)
        ) {
            Text(text = "レビュー")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp)
        ) {
            Row(
                modifier = Modifier
                    .padding(top = 13.dp)
            ) {
                Text(text = "※星をタップしてください")
            }
            Row(
                modifier = Modifier
                    .padding(start = 10.dp)
            ) {
                IconToggleButtonSample()
                IconToggleButtonSample()
                IconToggleButtonSample()
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 5.dp)
        ) {
            Input()
        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, top = 5.dp)
        ) {
            Text(text = "みんなのレビュー")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 5.dp, end = 5.dp)
        ) {
            ScrollBoxes2()
        }
    }
}


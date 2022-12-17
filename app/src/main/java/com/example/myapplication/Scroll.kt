import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.RankIcon

@Composable
fun ScrollBoxes() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.3f)
            .verticalScroll(rememberScrollState())
            .background(Color.Blue)
            .padding(15.dp, 0.dp),

        ) {
        repeat(30) {
            Text(
                text = "リスト項目: $it",
                fontSize = 22.sp,
                color = Color.White,
                modifier = Modifier.clickable {
                    // 項目が押された時の処理
                }
            )
        }
    }
}

@Composable
fun ScrollBoxes2() {
    val tint1 = animateColorAsState(
        Color(0xFFFFEB3B)
    )
    val tint2 = animateColorAsState(
        Color(0xFFB0BEC5)
    )
    val tint3 = animateColorAsState(
        Color(0xFF070707)
    )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.7f)
            .verticalScroll(rememberScrollState())
            .background(Color.Gray)
            .padding(15.dp, 0.dp),

        ) {

        Row(
            horizontalArrangement =  Arrangement.Center,
        ){
            Icon(
                Icons.Filled.Person, contentDescription = "人",
                tint = tint3.value
            )

            RankIcon(rank = 3.0)
            Text(
                text = "　気もちよし！",
                fontSize = 22.sp,
                color = Color.White,
                modifier = Modifier.clickable {
                    // 項目が押された時の処理
                }
            )
        }

        Row(
            horizontalArrangement =  Arrangement.Center,
        ){
            Icon(
                Icons.Filled.Person, contentDescription = "人",
                tint = tint3.value
            )

            RankIcon(rank = 3.0)
            Text(
                text = "　素晴らしい",
                fontSize = 22.sp,
                color = Color.White,
                modifier = Modifier.clickable {
                    // 項目が押された時の処理
                }
            )
        }

        Row(
            horizontalArrangement =  Arrangement.Center,
        ){
            Icon(
                Icons.Filled.Person, contentDescription = "人",
                tint = tint3.value
            )

            RankIcon(rank = 2.0)
            Text(
                text = "　ウォシュレット！",
                fontSize = 22.sp,
                color = Color.White,
                modifier = Modifier.clickable {
                    // 項目が押された時の処理
                }
            )
        }

        Row(
            horizontalArrangement =  Arrangement.Center,
        ){
            Icon(
                Icons.Filled.Person, contentDescription = "人",
                tint = tint3.value
            )

            RankIcon(rank = 0.0)
            Text(
                text = "　女子トイレに間違って行っちゃいました",
                fontSize = 22.sp,
                color = Color.White,
                modifier = Modifier.clickable {
                    // 項目が押された時の処理
                }
            )
        }

        Row(
            horizontalArrangement =  Arrangement.Center,
        ){
            Icon(
                Icons.Filled.Person, contentDescription = "人",
                tint = tint3.value
            )

            RankIcon(rank = 2.0)
            Text(
                text = "　すげー",
                fontSize = 22.sp,
                color = Color.White,
                modifier = Modifier.clickable {
                    // 項目が押された時の処理
                }
            )
        }

        Row(
            horizontalArrangement =  Arrangement.Center,
        ){
            Icon(
                Icons.Filled.Person, contentDescription = "人",
                tint = tint3.value
            )

            RankIcon(rank = 2.0)
            Text(
                text = "　ええやん",
                fontSize = 22.sp,
                color = Color.White,
                modifier = Modifier.clickable {
                    // 項目が押された時の処理
                }
            )
        }

        Row(
            horizontalArrangement =  Arrangement.Center,
        ){
            Icon(
                Icons.Filled.Person, contentDescription = "人",
                tint = tint3.value
            )

            RankIcon(rank = 2.0)
            Text(
                text = "　いいね！",
                fontSize = 22.sp,
                color = Color.White,
                modifier = Modifier.clickable {
                    // 項目が押された時の処理
                }
            )
        }

    }
}
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Icon用の画像を表示
@Composable
fun IconButtonToilet(
    name: String,
    fileid: Int,
    filedescription: String,
    toNextScreen: (String) -> Unit = {}
) {

    IconButton(
        onClick = { toNextScreen("toilet1") },
        modifier = Modifier.size(120.dp, 50.dp)
    ) {
        Box() {
            Image(
                painter = painterResource(fileid),
                contentDescription = filedescription,
                modifier = Modifier
                    .size(50.dp)
            )
        }
    }
}

// トイレのレビュー画面へ遷移するIconを表示
@Composable
fun IconButtonGender(
    number: String,
    gender: String,
    fontSize: Int,
    file: Int,
    toNextScreen: (String) -> Unit = {}
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = number, fontSize = fontSize.sp)
        Box(
            contentAlignment = Alignment.Center
        ) {

            IconButtonToilet("toilet1", file, "toile") {
                toNextScreen("toilet1")
            }

            Text(text = gender, fontSize = fontSize.sp)
        }

    }
}
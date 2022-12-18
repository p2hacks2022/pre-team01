package com.example.myapplication.ui.theme

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

// スクロールする画像などを列挙
@Composable
fun ScrollBoxes3(id:Int, id2:Int, id3:Int, filedescription:String, photosize_width:Int) {

    val photosize_height = photosize_width*3/4

    Row(
        modifier = Modifier
            .size(photosize_width.dp, photosize_height.dp)
            .horizontalScroll(rememberScrollState())
            .background(Color.Gray)

        ) {


        Image(
            painter = painterResource(id),
            contentDescription = filedescription,
            modifier = Modifier
                .size(photosize_width.dp, photosize_height.dp)
        )
        Image(
            painter = painterResource(id2),
            contentDescription = filedescription,
            modifier = Modifier
                .size(photosize_width.dp, photosize_height.dp)
        )
        Image(
            painter = painterResource(id3),
            contentDescription = filedescription,
            modifier = Modifier
                .size(photosize_width.dp, photosize_height.dp)
        )
    }


}

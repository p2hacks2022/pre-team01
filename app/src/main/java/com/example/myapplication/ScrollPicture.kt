package com.example.myapplication.ui.theme

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.iconsize
import com.example.myapplication.photosize
import com.example.myapplication.textsize


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

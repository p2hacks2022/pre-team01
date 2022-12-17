package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.ScrollBoxes3

val photosize2 = 140

@Composable
fun RankingButton(fileid1:Int,fileid2:Int,fileid3:Int, filedescription: String, toNextScreen: (String) -> Unit = {}) {
    IconButton(onClick = { toNextScreen("toilet1") },
        modifier = Modifier
            .size(photosize2.dp)) {

        ScrollBoxes3(fileid1,fileid2, fileid3, "toilet-picture")
    }
}
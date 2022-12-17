package com.example.myapplication

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconToggleButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.IconButtonSample_5F

@Preview(showBackground = true)
@Composable
fun YoyakuButtons() {

    var yoyaku by remember{mutableStateOf(true)}
    var toiletSize = 65
    Row(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        IconButtonSample_5F(R.drawable.large_urinal, "l_icon", toiletSize) {}
        if(!yoyaku) {
            IconButtonSample_5F(R.drawable.large_urinal, "l_button", toiletSize) {yoyaku=!yoyaku}
        }else {
            IconButtonSample_5F(R.drawable.large_urinal_no1, "l_button", toiletSize) {yoyaku=!yoyaku}
        }
        IconButtonSample_5F(R.drawable.large_urinal_no2, "l_button", toiletSize) {}
        IconButtonSample_5F(R.drawable.large_urinal_no3, "l_button", toiletSize) {}
    }

    Row(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        IconButtonSample_5F(R.drawable.urinal, "s_icon", toiletSize) {}
        IconButtonSample_5F(R.drawable.urinal_no1, "s_button", toiletSize) {}
        IconButtonSample_5F(R.drawable.urinal_no2, "s_button", toiletSize) {}
        IconButtonSample_5F(R.drawable.urinal_no3, "s_button", toiletSize) {}
        IconButtonSample_5F(R.drawable.urinal_no4, "s_button", toiletSize) {}
        IconButtonSample_5F(R.drawable.urinal_no5, "s_button", toiletSize) {}
    }

}

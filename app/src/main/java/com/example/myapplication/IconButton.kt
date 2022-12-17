package com.example.myapplication.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun IconButtonSample_1F(fileid: Int, filedescription: String, toNextScreen: (String) -> Unit = {}) {
    IconButton(
        onClick = { toNextScreen("1F")  },
        modifier = Modifier
            .width(120.dp)
            .height(120.dp)
    ) {
        Image(
            painter = painterResource(fileid),
            contentDescription = filedescription
        )
    }
}

@Composable
fun IconButtonSample_2F(fileid: Int, filedescription: String, toNextScreen: (String) -> Unit = {}) {
    IconButton(
        onClick = { toNextScreen("2F")  },
        modifier = Modifier
            .width(120.dp)
            .height(120.dp)
            .padding(start = 8.dp)
    ) {
        Image(
            painter = painterResource(fileid),
            contentDescription = filedescription
        )
    }
}

@Composable
fun IconButtonSample_3F(fileid: Int, filedescription: String, toNextScreen: (String) -> Unit = {}) {
    IconButton(
        onClick = { toNextScreen("3F")  },
        modifier = Modifier
            .size(120.dp)
    ) {
        Image(
            painter = painterResource(fileid),
            contentDescription = filedescription
        )
    }
}

@Composable
fun IconButtonSample_4F(fileid: Int, filedescription: String, toNextScreen: (String) -> Unit = {}) {
    IconButton(
        onClick = { toNextScreen("4F")  },
        modifier = Modifier
            .size(120.dp)
    ) {
        Image(
            painter = painterResource(fileid),
            contentDescription = filedescription
        )
    }
}

@Composable
fun IconButtonSample_5F(fileid: Int, filedescription: String, toNextScreen: (String) -> Unit = {}) {
    IconButton(
        onClick = { toNextScreen("5F")  },
        modifier = Modifier
            .size(120.dp)
    ) {
        Image(
            painter = painterResource(fileid),
            contentDescription = filedescription
        )
    }
}

@Composable
fun IconButtonSample_R1F(fileid: Int, filedescription: String, toNextScreen: (String) -> Unit = {}) {
    IconButton(
        onClick = { toNextScreen("R1F")  },
        modifier = Modifier
            .size(120.dp)
    ) {
        Image(
            painter = painterResource(fileid),
            contentDescription = filedescription
        )
    }
}

@Composable
fun IconButtonSample_R2F(fileid: Int, filedescription: String, toNextScreen: (String) -> Unit = {}) {
    IconButton(
        onClick = { toNextScreen("R2F")  },
        modifier = Modifier
            .size(120.dp)
    ) {
        Image(
            painter = painterResource(fileid),
            contentDescription = filedescription
        )
    }
}

@Composable
fun IconButtonSample_rank(fileid: Int, filedescription: String, toNextScreen: (String) -> Unit = {}) {
    IconButton(onClick = { toNextScreen("rank") }) {
        Image(
            painter = painterResource(fileid),
            contentDescription = filedescription
        )
    }
}



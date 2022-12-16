package com.example.myapplication.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

@Composable
fun IconButtonSample_1F(fileid: Int, filedescription: String, toNextScreen: (String) -> Unit = {}) {
    IconButton(onClick = { toNextScreen("1F")  }) {
        Image(
            painter = painterResource(fileid),
            contentDescription = filedescription
        )
    }
}

@Composable
fun IconButtonSample_2F(fileid: Int, filedescription: String, toNextScreen: (String) -> Unit = {}) {
    IconButton(onClick = { toNextScreen("2F")  }) {
        Image(
            painter = painterResource(fileid),
            contentDescription = filedescription
        )
    }
}

@Composable
fun IconButtonSample_3F(fileid: Int, filedescription: String, toNextScreen: (String) -> Unit = {}) {
    IconButton(onClick = { toNextScreen("3F")  }) {
        Image(
            painter = painterResource(fileid),
            contentDescription = filedescription
        )
    }
}

@Composable
fun IconButtonSample_4F(fileid: Int, filedescription: String, toNextScreen: (String) -> Unit = {}) {
    IconButton(onClick = { toNextScreen("4F")  }) {
        Image(
            painter = painterResource(fileid),
            contentDescription = filedescription
        )
    }
}

@Composable
fun IconButtonSample_5F(fileid: Int, filedescription: String, toNextScreen: (String) -> Unit = {}) {
    IconButton(onClick = { toNextScreen("5F")  }) {
        Image(
            painter = painterResource(fileid),
            contentDescription = filedescription
        )
    }
}

@Composable
fun IconButtonSample_R1F(fileid: Int, filedescription: String, toNextScreen: (String) -> Unit = {}) {
    IconButton(onClick = { toNextScreen("R1F")  }) {
        Image(
            painter = painterResource(fileid),
            contentDescription = filedescription
        )
    }
}

@Composable
fun IconButtonSample_R2F(fileid: Int, filedescription: String, toNextScreen: (String) -> Unit = {}) {
    IconButton(onClick = { toNextScreen("R2F")  }) {
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



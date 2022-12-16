package com.example.myapplication.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun IconButtonSample_1F(fileid: Int, filedescription: String, toNextScreen: (String) -> Unit = {}) {
    IconButton(
        onClick = { toNextScreen("1F")  },
        modifier = Modifier.size(120.dp)
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
        onClick = { toNextScreen("1F")  },
        modifier = Modifier.size(120.dp)
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
        onClick = { toNextScreen("1F")  },
        modifier = Modifier.size(120.dp)
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
        onClick = { toNextScreen("1F")  },
        modifier = Modifier.size(110.dp)
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
        onClick = { toNextScreen("1F")  },
        modifier = Modifier.size(120.dp)
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
        onClick = { toNextScreen("1F")  },
        modifier = Modifier.size(110.dp)
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
        onClick = { toNextScreen("1F")  },
        modifier = Modifier.size(120.dp)
    ) {
        Image(
            painter = painterResource(fileid),
            contentDescription = filedescription
        )
    }
}

@Composable
fun IconButtonSample_rank(fileid: Int, filedescription: String, toNextScreen: (String) -> Unit = {}) {
    IconButton(
        onClick = { toNextScreen("rank") },
        modifier = Modifier.size(80.dp)
    ) {
        Image(
            painter = painterResource(fileid),
            contentDescription = filedescription
        )
    }
}



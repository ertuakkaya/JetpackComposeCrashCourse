package com.example.jetpackcomposecrashcourse

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun VerticalScreen() {

    Column (
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center

    ){
        TextComponent(value = "Hello 1")
        TextComponent(value = "Hello 2")
        TextComponent(value = "Hello 3")
        TextComponent(value = "Hello 4")
    }

}

@Preview(showSystemUi = true)
@Composable
fun VerticalScreenPreview() {
    VerticalScreen()
}

// 58.00 https://www.youtube.com/watch?v=x8TYLiigOXM&t=1542s
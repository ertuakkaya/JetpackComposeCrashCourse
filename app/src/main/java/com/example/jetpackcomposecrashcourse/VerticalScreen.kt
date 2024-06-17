package com.example.jetpackcomposecrashcourse

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun VerticalScreen() {

    Column (
        modifier = Modifier
            //.background(color = Color.Black)
            .fillMaxWidth()
            .fillMaxHeight()
            .wrapContentHeight()

        ,
        //verticalArrangement = Arrangement.Center


    ){
        TextComponent(value = "Hello 1")
        TextComponent(value = "Hello 2")
        TextComponent(value = "Hello 3")
        TextComponent(value = "Hello 4")

        SimpleButton()
    }

}

@Preview(showSystemUi = true)
@Composable
fun VerticalScreenPreview() {
    VerticalScreen()
}

// 58.00 https://www.youtube.com/watch?v=x8TYLiigOXM&t=1542s
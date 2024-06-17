package com.example.jetpackcomposecrashcourse

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun VerticalScreen() {

    Column (
        modifier = Modifier
            //.background(color = Color.Black)
            .fillMaxWidth()
            //.fillMaxHeight()
            .wrapContentHeight()

        ,
        //verticalArrangement = Arrangement.Center


    ){
        TextComponent(value = "Hello there !" , colorValue = Color.Black , size = 36.sp)
        TextComponent(value = "Please enter your name:" , colorValue = Color.DarkGray , fontStyleValue = FontStyle.Italic)

        TextFieldComponent()

        Spacer(modifier =Modifier.height(16.dp))

        SimpleButton()
    }

}

@Preview(showSystemUi = true)
@Composable
fun VerticalScreenPreview() {
    VerticalScreen()
}

// 58.00 https://www.youtube.com/watch?v=x8TYLiigOXM&t=1542s
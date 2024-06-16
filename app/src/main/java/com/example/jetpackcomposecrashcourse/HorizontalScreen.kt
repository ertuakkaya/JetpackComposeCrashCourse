package com.example.jetpackcomposecrashcourse

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// Vertically Arrange -> Column / Dikey
// Horizontally Arrange -> Row / Yatay

@Composable
fun HorizontalScreen(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(color = Color.Black)



        ,
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically

    ) {
        TextComponent(value = "Hello 1")
        TextComponent(value = "Hello 2")
        TextComponent(value = "Hello 3")
        TextComponent(value = "Hello 4")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HorizontalScreenPreview(){
    HorizontalScreen()
}
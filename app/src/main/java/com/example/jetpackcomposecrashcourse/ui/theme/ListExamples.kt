package com.example.jetpackcomposecrashcourse.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecrashcourse.NormalText
import com.example.jetpackcomposecrashcourse.TextComponent

// LazyRow , LazyColumn , LazyVerticalGrid , LazyHorizontalGrid

// Horintally scrolling -> LazyRow | Yatay
// Vertically scrolling -> LazyColumn | Dikey
@Composable
fun ListExamples() {

    val someValues = listOf(
        "Item 1",
        "Item 2",
        "Item 3",
        "Item 4",
        "Item 5",
        "Item 6",
        "Item 7",
        "Item 8",
        "Item 9",
        "Item 1",
        "Item 2",
        "Item 3",
        "Item 4",
        "Item 5",
        "Item 6",
        "Item 7",
        "Item 8",
        "Item 9",
        "Item 1",
        "Item 2",
        "Item 3",
        "Item 4",
        "Item 5",
        "Item 6",
        "Item 7",
        "Item 8",
        "Item 9",

    )

    LazyColumn {
        items(someValues) { item : String ->
            TextComponent(
                value = item

            )
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(2.dp)
                    .background(color = Color.Black)
                    .size(16.dp),
            )
        }

    }

}



@Preview(showSystemUi = true)
@Composable
fun ListExamplesPreview() {
    ListExamples()
}
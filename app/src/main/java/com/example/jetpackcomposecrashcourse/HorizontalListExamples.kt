package com.example.jetpackcomposecrashcourse

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// LazyRow , LazyColumn , LazyVerticalGrid , LazyHorizontalGrid

// Horintally scrolling -> LazyRow | Yatay
// Vertically scrolling -> LazyColumn | Dikey
@Composable
fun HorizontalListExamples() {

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

    LazyRow  {
        items(someValues){ it : String ->
            Row(
                modifier = Modifier
                    .height(60.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {

                TextComponent(
                    value = it
                )
                Spacer(
                    modifier = Modifier
                        .background(color = Color.Black)
                        .width(1.dp)
                        .height(40.dp),
                )
            }

        }
    }

}



@Preview(showSystemUi = true)
@Composable
fun HorizontalListExamplesPreview() {
    HorizontalListExamples()
}
package com.example.jetpackcomposecrashcourse

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun HelloWorld(name: String) {

    Box(
//        modifier = Modifier
//            .wrapContentSize()
//            .background(
//                shape = RoundedCornerShape(36.dp),
//                color = Color.DarkGray
//            )




    ){
        TextComponent(
            value = "Hello $name!",
            size = 36.sp,
            Color.Magenta,
        )
    }


}

//@Preview(showBackground = true, showSystemUi = false)
@Composable
fun HelloWorldPreviewForComponent(nameParameter: String = "Rana") {
    HelloWorld(name = nameParameter)
}

@Preview(showBackground = true,device = Devices.PIXEL_4_XL,
    uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_NORMAL,
    showSystemUi = true
)
@Composable
fun HelloWorldPreviewInMobileScreen(nameParameter: String = "Rana") {
    HelloWorld(name = nameParameter)
}

@Composable
fun TextComponent(
    value: String,
    size: TextUnit = 18.sp,
    colorValue: Color = Color.Magenta,
    fontWeightValue: FontWeight = FontWeight.Normal,
    fontStyleValue: FontStyle = FontStyle.Normal,
    maxLineValue: Int? = null,

    ) {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            //.wrapContentHeight()
            .wrapContentWidth()
            .background(
                color = Color.LightGray,
                shape = RoundedCornerShape(18.dp),
            )
            .border(
                width = 2.dp,
                color = Color.Cyan,
                shape = RoundedCornerShape(18.dp),

                )
            .padding(
                18.dp,
            )
        ,
        text = value,
        fontSize = size,
        color = colorValue,
        fontWeight = fontWeightValue,
        fontStyle = fontStyleValue,
        maxLines = maxLineValue?: Int.MAX_VALUE,
        style = TextStyle.Default,
        overflow = TextOverflow.Ellipsis,
    )
}

@Preview
@Composable
fun TextComponentPreview() {
    TextComponent(
        value = "Hello World!",
        size = 36.sp,
        colorValue = Color.Magenta,
    )
}
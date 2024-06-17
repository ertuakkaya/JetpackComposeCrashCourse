package com.example.jetpackcomposecrashcourse

import android.media.Image
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ContentScale.Companion
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
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

//@Preview(showBackground = true,device = Devices.PIXEL_4_XL,
//    uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_NORMAL,
//    showSystemUi = true
//)
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
            //.fillMaxWidth()
            //.wrapContentHeight()
            .wrapContentWidth()
//            .background(
//                color = Color.LightGray,
//                shape = RoundedCornerShape(18.dp),
//            )
//            .border(
//                width = 2.dp,
//                color = Color.Cyan,
//                shape = RoundedCornerShape(18.dp),
//
//                )
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


@Composable
fun SimpleButton(){

    Button(
        modifier = Modifier
            .padding(start = 18.dp, end = 18.dp, top = 18.dp, bottom = 18.dp)
            .height(68.dp)
            .fillMaxWidth(),

        shape = RoundedCornerShape(18.dp),
        
        onClick = {
            Log.d("Button","Clicked")

        })
    {
        NormalText(value = "Click Me")
    }

}

@Preview
@Composable
fun SimpleButtonPreview(){
    SimpleButton()
}

@Composable
fun NormalText(value: String , alignment : TextAlign = TextAlign.Start){
    Text(
        modifier = Modifier
            //.fillMaxSize()
//            .height(68.dp)
//            .width(200.dp)
            //.padding(top = 8.dp)
            .fillMaxWidth()

        ,
        text = value,
        textAlign = alignment,


    )
}

// TextField for text input
@Composable
fun TextFieldComponent(){

    val nameText = remember { mutableStateOf("") }
    val numberText = remember { mutableStateOf("") }




    TextField(
        modifier = Modifier
            .height(60.dp)
            .padding(start = 18.dp, end = 18.dp)
            .fillMaxWidth(),

        value = nameText.value,
        textStyle = TextStyle.Default.copy(
            color = Color.Black,
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
        ),
        onValueChange = { newText ->
            nameText.value = newText
        },
        label = {
            Text("Name:", textAlign = TextAlign.Center)
        },
        placeholder = {
            Text("Enter your name")
        },
    )

    Spacer(modifier = Modifier.height(16.dp))

    TextField(
        modifier = Modifier
            .height(60.dp)
            .padding(start = 18.dp, end = 18.dp)

            .fillMaxWidth(),

        value = numberText.value,
        textStyle = TextStyle.Default.copy(
            color = Color.Black,
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
        ),
        onValueChange = { newText ->
            numberText.value = newText
        },
        label = {
            Text("Number:", textAlign = TextAlign.Center)
        },
        placeholder = {
            Text("Enter your number")
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
}

@Preview
@Composable
fun TextFieldComponentPreview(){
    TextFieldComponent()
}

@Composable
fun ImageComponent(){

    //var imageList = List<Image>(3,Image::class.java)

    Column (
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                modifier = Modifier
                    //.padding(start = 18.dp, end = 18.dp)
                    .size(85.dp)
                    .background(Color.Gray, CircleShape)
                    .clip(CircleShape),
                painter = painterResource(R.drawable.coffe),
                contentDescription = "",
                alignment = Alignment.Center,
                contentScale = ContentScale.Crop,
                //colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(Color.Gray),
            )
            Image(
                modifier = Modifier
                    //.padding(start = 18.dp, end = 18.dp)
                    .size(85.dp)
                    .background(Color.Gray, CircleShape)
                    .clip(CircleShape),
                painter = painterResource(R.drawable.coffe),
                contentDescription = "",
                alignment = Alignment.Center,
                contentScale = ContentScale.Crop,
                //colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(Color.Gray),
            )
            Image(
                modifier = Modifier
                    //.padding(start = 18.dp)
                    .size(85.dp)
                    .background(Color.Gray, CircleShape)
                    .clickable { }
                    .clip(CircleShape),
                painter = painterResource(R.drawable.coffe),
                contentDescription = "",
                alignment = Alignment.Center,
                contentScale = ContentScale.Crop,

                //colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(Color.Gray),
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                modifier = Modifier
                    //.padding(start = 18.dp, end = 18.dp)
                    .size(85.dp)
                    .background(Color.Gray, CircleShape)
                    .clip(CircleShape),
                painter = painterResource(R.drawable.coffe),
                contentDescription = "",
                alignment = Alignment.Center,
                contentScale = ContentScale.Crop,
                //colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(Color.Gray),
            )
            Image(
                modifier = Modifier
                    //.padding(start = 18.dp, end = 18.dp)
                    .size(85.dp)
                    .background(Color.Gray, CircleShape)
                    .clip(CircleShape),
                painter = painterResource(R.drawable.coffe),
                contentDescription = "",
                alignment = Alignment.Center,
                contentScale = ContentScale.Crop,
                //colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(Color.Gray),
            )
            Image(
                modifier = Modifier
                    //.padding(start = 18.dp)
                    .size(85.dp)
                    .background(Color.Gray, CircleShape)
                    .clickable { }
                    .clip(CircleShape),
                painter = painterResource(R.drawable.coffe),
                contentDescription = "",
                alignment = Alignment.Center,
                contentScale = ContentScale.Crop,

                //colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(Color.Gray),
            )
        }

    }



    Spacer(modifier = Modifier.height(16.dp))

//    Button(
//        onClick = { /*TODO*/ },
//        modifier = Modifier
//            .size(100.dp)
//            .clip(CircleShape)
//            .background()
//            ,
//
//    ) {






}

@Preview(showSystemUi = true)
@Composable
fun ImageComponentPreview(){
    ImageComponent()
}



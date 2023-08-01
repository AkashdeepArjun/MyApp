package com.example.myapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ImageCard(
    painter: Painter,
    contentDesc:String,
    title:String,
    modifier: Modifier = Modifier
){

    Card(modifier=modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(5.dp,3.dp,4.dp,4.dp,7.dp,0.dp)

    ) {

        Box(
            modifier= Modifier.height(200.dp)

        ){

            Image(painter=painter,
                contentDescription = contentDesc,
                contentScale = ContentScale.Crop)

            Box(modifier= Modifier.fillMaxSize()
                .background(
                    Brush.verticalGradient(
                    colors = listOf(

                        Color.Transparent,
                        Color.Black

                    ), startY = 300f)
                ))


            Box(modifier= Modifier
                .fillMaxSize()
                .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ){

                Text(text = title, style = TextStyle(color = Color.White, fontSize = 16.sp))

            }


        }


    }




}






// CREATES STYLISH TEXT

@Composable

fun CreateSampleStylishText(text :String){

    val font_family= FontFamily(
        Font(R.font.f1, FontWeight.Thin),
        Font(R.font.f1, FontWeight.Bold),
        Font(R.font.f1, FontWeight.ExtraBold),
        Font(R.font.f1, FontWeight.ExtraLight),
        Font(R.font.f1, FontWeight.SemiBold),
    )


    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF101010))
    ){

        Text(
            buildAnnotatedString {
                withStyle(
                    style= SpanStyle(
                        color=Color.Green,
                        textDecoration = TextDecoration.None

                    )
                ){
                    append("We are")
                }
                append("happy to help you")
            },
            color=Color.White,
            fontSize = 30.sp,
            fontFamily = font_family,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.End,
            textDecoration = TextDecoration.LineThrough
        )
    }


















}



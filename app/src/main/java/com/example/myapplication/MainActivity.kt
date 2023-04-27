package com.example.myapplication

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    Photo()
                    Start()
                    Board()

                }
            }
        }
    }


}


@Composable
fun Photo(){

    val image = painterResource(id = R.drawable.audi)

    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.Crop
    )

}


@Composable
fun Start() {
    Column (
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(10.dp)
            ){

        val photo = painterResource(id = R.drawable.image_1)

        Image(
            painter = photo,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
        )



        Text(

            text = stringResource(R.string.NomeCompleto),
            modifier = Modifier
                .padding(5.dp),
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.Bold,
            color = Color(104, 34, 139)
        )

        Text(
            text = stringResource(R.string.Cargo),
            modifier = Modifier,
            fontFamily = FontFamily.Serif,
            color = Color(104, 34, 139),
            fontWeight = FontWeight.Bold


        )
    }
}

@Composable
fun Board(){
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Contact(
            painter = painterResource(id = R.drawable.email_12),
            text = stringResource(R.string.email)
        )

        Contact(
            painter = painterResource(id = R.drawable.tel_12) ,
            text = stringResource(R.string.telefone)
        )

        Contact(
            painter = painterResource(id = R.drawable.instagram_12),
            text = stringResource(R.string.instagram)
        )
    }

}


@Composable
fun Contact(painter: Painter, text: String) {


    Divider(
        color = Color(	248, 248,255),
        modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)

    )

    Row {

        Image(
            painter = painter,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(40.dp)
        )

        Text(
            text = text,
            color = Color(104, 34, 139),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, bottom = 20.dp),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold

        )
    }

}






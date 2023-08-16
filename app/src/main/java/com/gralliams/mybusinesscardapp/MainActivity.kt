package com.gralliams.mybusinesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gralliams.mybusinesscardapp.ui.theme.MyBusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyBusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CardHeader()
                }
            }
        }
    }
}

@Composable
fun CardHeader(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color.DarkGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(120.dp)
                    .width(150.dp)
                    .padding(bottom = 8.dp)
            )

        Text(
            text = "Grant Williams",
            modifier = Modifier.padding(bottom = 8.dp, top = 8.dp)
        )

        Text(
            text = "Android Developer Extraordinaire"
        )
    }

    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 500.dp, bottom = 70.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 40.dp),
            ){

            Icon(
                painter = painterResource(id = R.drawable.baseline_phone_24),
                contentDescription = null,
            )

            Text(
                text = "+2348027904351",
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(40.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_share_24),
                contentDescription = null,
            )

            Text(
                text = "@iAmGreatGrant",
                modifier = Modifier.padding(start = 8.dp))
        }

        Row(
            modifier = Modifier
                .padding(start = 40.dp)
                .fillMaxWidth()
            ){
            Icon(
                painter = painterResource(id = R.drawable.baseline_message_24),
                contentDescription = null
            )
            Text(
                text = "greatgrant116@gmail.com",
                modifier = Modifier.padding(start = 8.dp)
            )
        }
    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(
    showBackground = true,
    showSystemUi = true)
@Composable
fun BusinessCardPreview() {
    MyBusinessCardAppTheme {
        CardHeader()
    }
}
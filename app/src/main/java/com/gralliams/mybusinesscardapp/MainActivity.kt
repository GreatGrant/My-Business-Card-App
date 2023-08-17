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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
fun CardHeader() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .height(120.dp)
                .width(120.dp)
                .padding(bottom = 8.dp)
                .background(colorResource(R.color.dark_blue))
        ){
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }

        Text(
            text = stringResource(R.string.grant_williams),
            modifier = Modifier.padding(bottom = 8.dp, top = 8.dp),
            fontSize = 36.sp
        )

        Text(
            text = stringResource(R.string.caption),
            color = colorResource(R.color.teal_700)
        )
    }
    BusinessCardFooter()

}

@Composable
fun BusinessCardFooter(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
        ) {

            RowItem(
                iconResId = R.drawable.baseline_phone_24,
                text = stringResource(R.string.phone_number),
            )
            RowItem(
                iconResId = R.drawable.baseline_share_24,
                text = stringResource(R.string.username)
            )
            RowItem(
                iconResId = R.drawable.baseline_message_24,
                text = stringResource(R.string.email)
            )
        }
    }
}

@Composable
fun RowItem(iconResId: Int, text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = iconResId),
            contentDescription = null,
            tint = colorResource(id = R.color.teal_700),
            modifier = Modifier.size(24.dp)
        )

        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = text,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
        )


    }
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
package com.alwinsden.finalebuild.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alwinsden.finalebuild.Greeting

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    color = Color.White
                ) {
                    Box (
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                brush = HandyConnectMGradient(
                                    colors = listOf(
                                        Color(0xFFFFDEAF),
                                        Color(0xFFF8EEFF),
                                        Color.White,
                                    )
                                )
                            ),

                    ){
                        Image(
                            painter = painterResource(id = R.drawable.account_side),
                            contentDescription = "account_desc",
                            modifier = Modifier
                                .padding(10.dp)
                                .size(30.dp)
                        )
                        Column {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(55.dp)
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.hc_logo),
                                        contentDescription = "Test Cost",
                                        modifier = Modifier
                                            .size(55.dp)
                                    )
                                }
                            }
                            Divider(
                                color = Color(0xFFB1B1B1),
                                modifier = Modifier
                                    .height(1.dp)
                                    .fillMaxWidth()
                            )
                            VerticalScrollMain()
                        }
                    }
                }
            }
        }
    }
}

//adding gradient brush
@Composable
private fun HandyConnectMGradient(
    colors: List<Color>
)  : Brush {
    return Brush.linearGradient(
        colors = colors,
        start = Offset.Zero,
        end = Offset(0f, Float.POSITIVE_INFINITY)
    )
}

@Composable
fun GreetingView(text: String) {
    Text(text = text)
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        GreetingView("Hello, Android!")
    }
}

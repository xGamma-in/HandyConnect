package com.alwinsden.finalebuild.android.facilities

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.alwinsden.finalebuild.android.InnNavHeader
import com.alwinsden.finalebuild.android.MyApplicationTheme
import com.alwinsden.finalebuild.android.R
import com.alwinsden.finalebuild.android.VerticalScroll
import com.alwinsden.finalebuild.android.handyConnectMGradient
import com.alwinsden.finalebuild.android.ui.ThemeLightGrey
import com.alwinsden.finalebuild.android.ui.ThemeOrange
import com.alwinsden.finalebuild.android.urbanistFont

//the User Interface for hiring a car technician.
@Composable
fun CarTech(navController: NavController) {
    MyApplicationTheme {
        Surface(
            modifier = Modifier
                .fillMaxSize(),
            color = Color.White
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = handyConnectMGradient(
                            colors = listOf(
                                Color(0xFFFFDEAF),
                                Color(0xFFF8EEFF),
                                Color.White,
                            )
                        )
                    ),
            ) {
                Column {
                    InnNavHeader(navController, "Hire car technician", "home")
                    ScrollWrapper()
                }
            }
        }
    }
}

//hire technician
@Composable
fun ScrollWrapper() {
    VerticalScroll {
        Box(
            modifier = Modifier.padding(top = 17.dp, bottom = 8.dp)
        ) {
            SavedVehicles()
        }

        //row divider
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Divider(
                color = Color(ThemeLightGrey),
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "or",
                color = Color(ThemeLightGrey),
                fontFamily = urbanistFont,
                modifier = Modifier.padding(horizontal = 8.dp)
            )
            Divider(
                color = Color(ThemeLightGrey),
                modifier = Modifier.weight(1f),
            )
        }

        CarDetails()
    }
}

//previous history button
@Composable
fun SavedVehicles() {
    Box(
        modifier = Modifier.clip(shape = RoundedCornerShape(50))
    ) {
        Row(
            modifier = Modifier
                .background(color = Color(0xFFFF8A00))
                .border(
                    width = 1.dp,
                    shape = RoundedCornerShape(50),
                    color = Color(ThemeOrange)
                )
                .padding(horizontal = 18.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.car_screen1),
                contentDescription = "Car screen",
                modifier = Modifier.size(42.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "Select one of your saved vehicles. Godspeed!",
                fontFamily = urbanistFont,
                fontSize = 12.sp,
                fontWeight = FontWeight(600),
                color = Color.White
            )
            Spacer(modifier = Modifier.weight(1f))
        }
    }
}
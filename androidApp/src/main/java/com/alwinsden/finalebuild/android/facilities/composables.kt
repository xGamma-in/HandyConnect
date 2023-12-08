package com.alwinsden.finalebuild.android.facilities

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.alwinsden.finalebuild.android.InnNavHeader
import com.alwinsden.finalebuild.android.MyApplicationTheme
import com.alwinsden.finalebuild.android.handyConnectMGradient

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
                    Text(text = "Hey there!")
                }
            }
        }
    }
}

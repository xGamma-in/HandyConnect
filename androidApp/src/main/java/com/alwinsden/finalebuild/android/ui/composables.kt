package com.alwinsden.finalebuild.android.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

//An alert box for the GPS
@Composable
fun GpsAlert() {
    Box() {
        Text(text = "Turn on GPS network for locating nearest services.")
    }
}

//Search bar for the main login
@Composable
fun SearchBar() {
    Box(
        modifier = Modifier
            .padding(start = 10.dp, end = 10.dp, top = 12.dp)
            .clip(RoundedCornerShape(50))
    ) {
        Row(
            modifier = Modifier
                .background(color = Color.White)
                .fillMaxWidth()
                .border(
                    color = Color(0xFF878787),
                    shape = RoundedCornerShape(50),
                    width = .5.dp
                )
        ) {
            Text(text = "This is the search bar")
        }
    }
}
package com.alwinsden.finalebuild.android.facilities

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alwinsden.finalebuild.android.urbanistFont

@Composable
fun CarDetails() {
    Text(
        text = "Car Details (will be saved)",
        style = TextStyle(
            fontSize = 13.sp,
            fontFamily = urbanistFont,
            fontWeight = FontWeight(600),
            color = Color(0xFF000000),
        ),
        modifier = Modifier.padding(bottom = 4.dp)
    )
    Box(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = Color(0xFFBBBBBB),
                shape = RoundedCornerShape(size = 10.dp)
            )
            .fillMaxWidth()
    ) {

    }
}
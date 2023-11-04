//package com.alwinsden.finalebuild.android.ui
package com.alwinsden.finalebuild.android

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//An alert box for the GPS
@Composable
fun GpsAlert() {
    Box(
        modifier = Modifier
            .padding(start = 10.dp, end = 10.dp, top = 12.dp)
            .clip(RoundedCornerShape(20))
    ) {
        Column(
            modifier = Modifier
                .background(color = Color.White)
                .fillMaxWidth()
                .border(
                    color = Color(0xFF878787), shape = RoundedCornerShape(20), width = .5.dp
                )
                .height(110.dp),
        ) {
            Row(
                modifier = Modifier.padding(
                    vertical = 10.dp, horizontal = 10.dp
                )
            ) {
                Icon(
                    imageVector = Icons.Default.LocationOn,
                    contentDescription = "location pin",
                    tint = Color(0xFFFF8A00)
                )
                Text(
                    text = "Turn on GPS network for locating nearest services.",
                    fontFamily = urbanistFont,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(start = 5.dp)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        end = 10.dp,
                        bottom = 10.dp
                    ),
                horizontalArrangement = Arrangement.End,
            ) {
                OutlinedButton(
                    onClick = { /*TODO*/ }, border = BorderStroke(.5.dp, color = StndOrange)
                ) {
                    Text(
                        text = "Cancel",
                        fontFamily = urbanistFont,
                        fontSize = 16.sp,
                        color = StndOrange
                    )
                }
                OutlinedButton(
                    onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
                        containerColor = StndOrange
                    ),
                    border = BorderStroke(.5.dp, color = StndOrange),
                    modifier = Modifier.padding(start = 10.dp)
                ) {
                    Text(
                        text = "Turn On",
                        color = Color.White,
                        fontFamily = urbanistFont,
                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}

//Search bar for the main login
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar() {
    var input by remember {
        mutableStateOf("")
    }
    Box(
        modifier = Modifier
            .padding(start = 10.dp, end = 10.dp, top = 12.dp)
            .clip(RoundedCornerShape(20))
    ) {
        Row(
            modifier = Modifier
                .background(color = Color.White)
                .fillMaxWidth()
                .border(
                    color = Color(0xFF878787), shape = RoundedCornerShape(20), width = .5.dp
                )
                .height(60.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            TextField(
                value = input,
                onValueChange = {
                    input = it
                },
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.White,
                    focusedIndicatorColor = Color.White,
                    unfocusedIndicatorColor = Color.White,
                    focusedTextColor = Color.Black
                ),
                singleLine = true,
                placeholder = { Text(text = "Search for services, electricians....") },
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(7.dp),
                modifier = Modifier.padding(end = 10.dp)
            ) {
                Icon(imageVector = Icons.Default.Search, contentDescription = "Search icon")
                Divider(
                    color = Color(0xFF8B8B8B), modifier = Modifier
                        .height(30.dp)
                        .width(1.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.microphone_icon),
                    contentDescription = "Mic Icons",
                    modifier = Modifier.size(35.dp)
                )
            }
        }
    }
}
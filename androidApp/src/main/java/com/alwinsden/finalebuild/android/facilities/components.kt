package com.alwinsden.finalebuild.android.facilities

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alwinsden.finalebuild.android.ui.ThemeOrange
import com.alwinsden.finalebuild.android.urbanistFont

@Preview
@Composable
fun CarDetails() {
    Text(
        text = "Car Details (will be saved)",
        style = TextStyle(
            fontSize = 16.sp,
            fontFamily = urbanistFont,
            fontWeight = FontWeight(600),
            color = Color(0xFF000000),
        ),
        modifier = Modifier.padding(bottom = 6.dp)
    )
    Column(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = Color(0xFFBBBBBB),
                shape = RoundedCornerShape(size = 10.dp)
            )
            .fillMaxWidth()
            .padding(6.dp),
        verticalArrangement = Arrangement.spacedBy(9.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            //car maker option
            Box(
                modifier = Modifier.clip(shape = RoundedCornerShape(25))
            ) {
                Row(
                    modifier = Modifier
                        .background(color = Color(0xFFFFFFFF))
                        .border(
                            width = .8.dp,
                            color = Color(0xFF878787),
                            shape = RoundedCornerShape(25)
                        )
                        .padding(0.3.dp)
                        .width(151.dp)
                        .height(50.dp)
                        .background(color = Color(0xFFFFFFFF))
                        .padding(horizontal = 9.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Car maker",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = urbanistFont,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF878787),
                        )
                    )
                    IconButton(
                        modifier = Modifier.size(24.dp),
                        onClick = { /*TODO*/ }
                    ) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowDown,
                            contentDescription = "Downward caret"
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.weight(1f))
            //car model option
            Box(
                modifier = Modifier.clip(shape = RoundedCornerShape(25))
            ) {
                Row(
                    modifier = Modifier
                        .background(color = Color(0xFFFFFFFF))
                        .border(
                            width = .8.dp,
                            color = Color(0xFF878787),
                            shape = RoundedCornerShape(25)
                        )
                        .padding(0.3.dp)
                        .fillMaxWidth()
                        .height(50.dp)
                        .background(color = Color(0xFFFFFFFF))
                        .padding(horizontal = 9.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Model",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = urbanistFont,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF878787),
                        )
                    )
                    IconButton(
                        modifier = Modifier.size(24.dp),
                        onClick = { /*TODO*/ }
                    ) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowDown,
                            contentDescription = "Downward caret"
                        )
                    }
                }
            }
        }

        //license plate entry
        Box(
            modifier = Modifier.clip(shape = RoundedCornerShape(25))
        ) {
            Row(
                modifier = Modifier
                    .background(color = Color(0xFFFFFFFF))
                    .border(
                        width = .8.dp,
                        color = Color(0xFF878787),
                        shape = RoundedCornerShape(25)
                    )
                    .padding(0.3.dp)
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(color = Color(0xFFFFFFFF))
                    .padding(horizontal = 9.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "License plate - e.g KA-05-SG-2113",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = urbanistFont,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF878787),
                    )
                )
            }
        }

        //radio button groups
        MyRadioButton()
    }
}

@Composable
fun MyRadioButton() {
    val selected =
        remember { mutableStateOf("Petrol") } // Remember the state of the selected option
    Column {
        RadioButtonGroup(
            options = listOf("Petrol", "Electric", "Diesel", "CN Gas"),
            selected = selected
        )
    }
}

@Composable
fun RadioButtonGroup(options: List<String>, selected: MutableState<String>) {
    Column(
        verticalArrangement = Arrangement.spacedBy(9.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            options.take(2).forEach { text ->
                val isSelected = text == selected.value
                Box(
                    modifier = Modifier.clip(shape = RoundedCornerShape(25))
                ) {
                    Row(
                        modifier = Modifier
                            .background(color = Color(0xFFFFFFFF))
                            .border(
                                width = .8.dp,
                                color = Color(0xFF878787),
                                shape = RoundedCornerShape(25)
                            )
                            .padding(0.3.dp)
                            .height(50.dp)
                            .width(180.dp)
                            .background(
                                color = if (selected.value == text) {
                                    Color(ThemeOrange)
                                } else {
                                    Color(0xFFFFFFFF)
                                }
                            )
                            .padding(horizontal = 10.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        RadioButton(
                            selected = isSelected,
                            onClick = { selected.value = text },
                            modifier = Modifier.size(30.dp),
                            colors = RadioButtonDefaults.colors(
                                selectedColor = Color.White,
                                unselectedColor = Color.Black
                            )
                        )
                        Text(
                            text = text,
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontFamily = urbanistFont,
                                fontWeight = FontWeight(600),
                                color = if (selected.value == text) {
                                    Color(0xFFFFFFFF)
                                } else {
                                    Color(0xFF878787)
                                }
                            )
                        )
                    }
                }
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            options.takeLast(2).forEach { text ->
                val isSelected = text == selected.value
                Box(
                    modifier = Modifier.clip(shape = RoundedCornerShape(25))
                ) {
                    Row(
                        modifier = Modifier
                            .background(color = Color(0xFFFFFFFF))
                            .border(
                                width = .8.dp,
                                color = Color(0xFF878787),
                                shape = RoundedCornerShape(25)
                            )
                            .padding(0.3.dp)
                            .height(50.dp)
                            .width(180.dp)
                            .background(
                                color = if (selected.value == text) {
                                    Color(ThemeOrange)
                                } else {
                                    Color(0xFFFFFFFF)
                                }
                            )
                            .padding(horizontal = 10.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        RadioButton(
                            selected = isSelected,
                            onClick = { selected.value = text },
                            modifier = Modifier.size(30.dp),
                            colors = RadioButtonDefaults.colors(
                                selectedColor = Color.White,
                                unselectedColor = Color.Black
                            )
                        )
                        Text(
                            text = text,
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontFamily = urbanistFont,
                                fontWeight = FontWeight(600),
                                color = if (selected.value == text) {
                                    Color(0xFFFFFFFF)
                                } else {
                                    Color(0xFF878787)
                                }
                            )
                        )
                    }
                }
            }
        }
    }
}
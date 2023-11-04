package com.alwinsden.finalebuild.android

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalMinimumInteractiveComponentEnforcement
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VerticalScrollMain() {
    Box(modifier = Modifier) {
        var scrollState = rememberScrollState()
        val context = LocalContext.current
        var expanded by remember {
            mutableStateOf(false)
        }
        Column(
            modifier = Modifier.verticalScroll(scrollState)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = 5.dp
                    ),
                verticalAlignment = Alignment.CenterVertically
            ) {
                //part of code for the dropdown and stuff
                Column {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    ) {
                        Image(
                            painter = painterResource(
                                id = R.drawable.home_nav
                            ),
                            contentDescription = "Home Navigation",
                            modifier = Modifier.size(22.dp)
                        )
                        Text(
                            text = "Home",
                            fontFamily = urbanistFont,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(
                                start = 3.dp
                            )
                        )
                        CompositionLocalProvider(
                            LocalMinimumInteractiveComponentEnforcement provides false
                        ) {
                            IconButton(
                                modifier = Modifier.size(24.dp),
                                onClick = { expanded = !expanded }
                            ) {
                                Icon(
                                    imageVector = Icons.Default.KeyboardArrowDown,
                                    contentDescription = "downward caret"
                                )
                            }
                            DropdownMenu(
                                expanded = expanded,
                                onDismissRequest = { expanded = false }
                            ) {
                                DropdownMenuItem(
                                    text = {
                                        Text(
                                            "H.no 35, RK Layout\n" +
                                                    "Jp Nagar, Mysore - 570008"
                                        )
                                    },
                                    onClick = {
                                        Toast.makeText(context, "Selected", Toast.LENGTH_SHORT)
                                            .show()
                                        expanded = false
                                    }
                                )
                                Divider()
                                DropdownMenuItem(
                                    text = {
                                        Text(
                                            "Srivatsa Road, Kuvmpura Puram\n" +
                                                    ", Mandya - 345000"
                                        )
                                    },
                                    onClick = {
                                        Toast.makeText(context, "Selected", Toast.LENGTH_SHORT)
                                            .show()
                                        expanded = false
                                    }
                                )
                            }
                        }
                    }
                    Row {
                        Text(
                            text = "#436, Wall Street, NY, Delhi - 457455",
                            modifier = Modifier.padding(start = 10.dp, top = 2.dp),
                            fontSize = 12.sp,
                            fontFamily = urbanistFont
                        )
                    }
                }
                //the premium button
                CompositionLocalProvider(
                    LocalMinimumInteractiveComponentEnforcement provides false
                ) {
                    OutlinedButton(
                        onClick = { /*TODO*/ },
                        contentPadding = PaddingValues(
                            horizontal = 20.dp,
                            vertical = 5.dp
                        ),
                        modifier = Modifier
                            .padding(
                                end = 10.dp
                            )
                            .defaultMinSize(minHeight = 1.dp),
                        shape = RoundedCornerShape(50),
                        border = BorderStroke(.5.dp, Color(0xFFFF8A00)),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White)
                    ) {
                        Text(
                            text = "premium",
                            color = Color(0xFFFF8A00),
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 16.sp,
                        )
                    }
                }
            }
            SearchBar()
            GpsAlert()
            ImageSlider()
            QuickAccess()
            ReferralRewards()
            FeatureLising()
        }
    }
}
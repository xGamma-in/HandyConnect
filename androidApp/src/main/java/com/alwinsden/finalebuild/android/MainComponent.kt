package com.alwinsden.finalebuild.android

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun VerticalScrollMain (){
    Box(modifier = Modifier){
        var scrollState = rememberScrollState()
        Column(
            modifier = Modifier.verticalScroll(scrollState)
        ){
            Text(text = "Hey there", fontFamily = urbanistFont)
        }
    }
}
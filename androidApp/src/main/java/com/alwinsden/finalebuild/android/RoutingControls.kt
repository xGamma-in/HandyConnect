package com.alwinsden.finalebuild.android

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alwinsden.finalebuild.android.facilities.CarTech

@Composable
fun RoutingControl() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "cartech") {
        composable("home") { Home() }
        composable("cartech") { CarTech(navController) }
    }
}
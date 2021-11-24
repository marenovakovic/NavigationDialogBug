package com.mapps.navigationdialogbug

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.dialog
import androidx.navigation.compose.rememberNavController

@JvmInline
value class Route(val route: String) {
    companion object {
        val Main = Route("main")
        val Dialog = Route("dialog")
    }
}

@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Route.Main.route) {
        composable(Route.Main.route) {
            MainScreen { navController.navigate(Route.Dialog.route) }
        }
        dialog(Route.Dialog.route) {
            Dialog { navController.popBackStack() }
        }
    }
}
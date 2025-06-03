package com.example.mviarchitecture.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.mviarchitecture.common.constants.RouteConstants


@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        startDestination = RouteConstants.AUTHENTICATION,
        navController = navController,
        route = RouteConstants.ROOT
    ) {
        authNavGraph(navController)
        homeNavGraph(navController)
    }
}

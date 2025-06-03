package com.example.mviarchitecture.navigation.nav_graph

import android.util.Log
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.navArgument
import com.example.mviarchitecture.common.arguments.DetailScreenArguments
import com.example.mviarchitecture.common.constants.RouteConstants
import com.example.mviarchitecture.features.screens.detail.DetailScreen
import com.example.mviarchitecture.features.screens.home.HomeScreen
import com.example.mviarchitecture.navigation.routes.home.HomeRoutes

fun NavGraphBuilder.homeNavGraph(navController: NavHostController){
    navigation(startDestination = HomeRoutes.Home.route, route = RouteConstants.HOME) {
        composable(
            route = HomeRoutes.Home.route
        ) {
            HomeScreen(navController)
        }
        composable(
            route = HomeRoutes.Detail.route,
            arguments = listOf(navArgument(DetailScreenArguments.ID){
                type = NavType.IntType
            }, navArgument(DetailScreenArguments.NAME){
                type = NavType.StringType
            })
        ) {
            Log.d("Args",it.arguments?.getInt(DetailScreenArguments.ID).toString())
            DetailScreen(navController)
        }
    }

}
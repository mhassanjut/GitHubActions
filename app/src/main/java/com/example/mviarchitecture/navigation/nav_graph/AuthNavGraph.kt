package com.example.mviarchitecture.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.mviarchitecture.common.constants.RouteConstants
import com.example.mviarchitecture.navigation.routes.auth.AuthRoutes
import com.example.mviarchitecture.features.screens.auth.login.LoginScreen
import com.example.mviarchitecture.features.screens.auth.signup.SignupScreen

fun NavGraphBuilder.authNavGraph(navController: NavHostController){
    navigation(startDestination = AuthRoutes.Login.route, route = RouteConstants.AUTHENTICATION) {
        composable(
            route = AuthRoutes.Login.route
        ) {
            LoginScreen(navController)
        }
        composable(
            route = AuthRoutes.Signup.route
        ) {
            SignupScreen(navController)
        }
    }

}
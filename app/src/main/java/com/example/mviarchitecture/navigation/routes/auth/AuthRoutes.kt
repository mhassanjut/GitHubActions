package com.example.mviarchitecture.navigation.routes.auth




sealed class AuthRoutes(val route: String) {

    data object Login : AuthRoutes(route = "login_screen")
    data object Signup : AuthRoutes(route = "signup_screen")

}
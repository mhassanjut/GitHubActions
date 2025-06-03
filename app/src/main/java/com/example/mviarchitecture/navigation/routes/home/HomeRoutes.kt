package com.example.mviarchitecture.navigation.routes.home

import com.example.mviarchitecture.navigation.routes.auth.AuthRoutes

sealed class HomeRoutes(val route: String) {
    data object Home : HomeRoutes(route = "home_screen")
    data object Detail : HomeRoutes(route = "detail_screen/{id}/{name}?city={city}&state={state}"){
        fun passDetails(id:Int,name:String,city:String?=null,state:String?=null):String{
            val queryParams = listOfNotNull(
                city?.let { "city=$it" },
                state?.let { "state=$it" }
            ).joinToString("&")

            return buildString {
                append("detail_screen/$id/$name")
                if (queryParams.isNotEmpty()) append("?$queryParams")
            }

        }
    }
}
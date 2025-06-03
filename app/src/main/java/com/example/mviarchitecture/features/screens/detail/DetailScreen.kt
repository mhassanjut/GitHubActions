package com.example.mviarchitecture.features.screens.detail

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mviarchitecture.navigation.routes.auth.AuthRoutes
import com.example.mviarchitecture.navigation.routes.home.HomeRoutes

@Composable
fun DetailScreen(navController: NavHostController) {
    Box(
        modifier = Modifier.fillMaxSize().background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Text(
            modifier = Modifier.clickable {
                navController.navigate(HomeRoutes.Home.route){
                    popUpTo(HomeRoutes.Home.route){
                        inclusive=true
                    }
                }
            },
            text = "Detail Screen",
            color = Color.Black,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

    }
}

@Preview
@Composable
private fun DetailScreenPreview(showBackground: Boolean = true) {
    DetailScreen(navController= rememberNavController())
}
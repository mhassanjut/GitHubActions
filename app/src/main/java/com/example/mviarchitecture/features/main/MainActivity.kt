package com.example.mviarchitecture.features.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mviarchitecture.navigation.nav_graph.SetupNavGraph
import com.example.mviarchitecture.ui.theme.MviArchitectureTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MviArchitectureTheme {
                navController = rememberNavController()
                SetupNavGraph(navController)
            }
        }
    }
}

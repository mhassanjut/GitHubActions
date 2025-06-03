package com.example.mviarchitecture.features.screens.settings

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

@Composable
fun SettingsScreen() {
    Box(
        modifier = Modifier.fillMaxSize().background(Color.White),
        contentAlignment = Alignment.Center
    ) {

        Text(
            modifier = Modifier.clickable {
            },
            text = "Settings",
            color = Color.Red,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

    }
}

@Preview
@Composable
private fun SettingsScreenPreview(showBackground: Boolean = true) {
    SettingsScreen()
}
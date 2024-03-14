package com.example.jcvalorant.menu.agents

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


@Preview(showSystemUi = true)
@Composable
fun X() {
    val navController = rememberNavController()
    A(navController = navController)
}

@Composable
fun A(navController: NavHostController) {
    Text(text = "AGENTS")
}
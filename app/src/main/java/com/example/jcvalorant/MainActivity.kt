package com.example.jcvalorant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jcvalorant.menu.agents.A
import com.example.jcvalorant.ui.theme.JCValorantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JCValorantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination =Screen.Welcome.rout
                    ) {
                        composable(Screen.Welcome.rout) {
                            Welcome(navController=navController)
                        }
                        composable(Screen.Home.rout) {
                            Menu(navController=navController)
                        }
                        composable(Screen.Agents.rout) {
                            A(navController=navController)
                        }
                    }
                }
            }
        }
    }
}
package com.example.jcvalorant


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.jcvalorant.ui.theme.ButtomBorder
import com.example.jcvalorant.ui.theme.font1
import com.example.jcvalorant.ui.theme.vbackground

@Composable
fun Menu(navController: NavHostController) {
    MenuSection(
        options = listOf(
            "AGENTS",
            "MAPS",
            "ARSENAL",
            "PREMIER",
            "MEDIA",
            "NEWS",
            "LEADERBOARDS",
            "SUPPORT",
            "OUR SOCIALS",
            "ESPORTS"
        ),
        navController = navController
    )
}

@Composable
fun MenuSection(options: List<String>, navController: NavHostController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(vbackground)
            .padding(vertical = 30.dp),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        items(options.size) { it ->
            Box(
                modifier = Modifier
                    .padding(45.dp, 20.dp)
                    .border(0.9.dp, ButtomBorder)
                    .padding(10.dp),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            when (options[it]) {
                                "AGENTS" -> navController.navigate(Screen.Agents.rout)
                                "MAPS" -> navController.navigate(Screen.Agents.rout)
                                "ARSENAL" -> navController.navigate(Screen.Agents.rout)
                                "PREMIER" -> navController.navigate(Screen.Agents.rout)
                                "MEDIA" -> navController.navigate(Screen.Agents.rout)
                                "NEWS" -> navController.navigate(Screen.Agents.rout)
                                "LEADERBOARDS" -> navController.navigate(Screen.Agents.rout)
                                "SUPPORT" -> navController.navigate(Screen.Agents.rout)
                                "OUR SOCIALS" -> navController.navigate(Screen.Agents.rout)
                                "ESPORTS" -> navController.navigate(Screen.Agents.rout)
                            }
                        }
                        .clip(RectangleShape)
                        .background(font1)
                        .padding(25.dp, 20.dp)
                ) {
                    Text(text = options[it], color = Color.White)
                }
            }
        }
    }
}
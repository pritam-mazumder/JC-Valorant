package com.example.jcvalorant

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.jcvalorant.ui.theme.font1
import com.example.jcvalorant.ui.theme.font2
import com.example.jcvalorant.ui.theme.vbackground

@Composable
fun Welcome(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(vbackground)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "WE ARE VALORANT",
                style = TextStyle(
                    fontSize = 48.sp,
                    fontFamily = FontFamily(Font(R.font.tungstenbold)),
                    color = font1
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 103.dp)
            )
            Text(
                text = "Blend your style and experience on a \n" +
                        "global, competitive stage. You have 13 \n" +
                        "rounds to attack and defend your side \n" +
                        "using sharp gunplay and tactical abilities. \n" +
                        "And, with one life per-round, you'll need \n" +
                        "to think faster than your opponent if you \n" +
                        "want to survive. Take on foes across \n" +
                        "Competitive and Unranked modes as well \n" +
                        "as Deathmatch and Spike Rush.",
                style = TextStyle(
                    fontSize = 18.sp,
                    color = font2
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 40.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "",
                tint = Color.Black,
                modifier = Modifier
                    .padding(70.dp)
                    .size(80.dp)
                    .clickable {
                        navController.navigate(Screen.Home.rout)
                    }
            )
        }
    }
}
package com.example.jcvalorant

sealed class Screen(val rout: String) {
    data object Home : Screen("home")
    data object Welcome : Screen("welcome")
    data object Agents : Screen("agents")
}
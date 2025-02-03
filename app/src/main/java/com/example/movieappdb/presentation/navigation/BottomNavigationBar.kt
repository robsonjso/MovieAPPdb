package com.example.movieappdb.presentation.navigation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

// Classe de modelo para representar um item de navegação no Bottom Navigation
@Composable
fun BottomNavigationBar(navController: NavController) {
    // Lista de itens de navegação do Bottom Navigation
    val items = listOf(
        BottomNavItem.MoviePopular, BottomNavItem.MovieSearch, BottomNavItem.MovieFavorite
    )
    // Composable que representa o Bottom Navigation
    BottomNavigation(
        contentColor = Color.Yellow, backgroundColor = Color.Black
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        // Itera sobre a lista de itens e constrói os itens do Bottom Navigation
        items.forEach { destination ->
            BottomNavigationItem(selected = currentRoute == destination.route,
                onClick = {
                    navController.navigate(destination.route) {
                        launchSingleTop = true
                    }
                },
                icon = {
                    Icon(imageVector = destination.icon, contentDescription = null)
                },
                label = {
                    Text(text = destination.title)
                }
            )
        }
    }
}

@Preview
@Composable
fun BottomNavigationBarPreview() {
    BottomNavigationBar(navController = rememberNavController())
}


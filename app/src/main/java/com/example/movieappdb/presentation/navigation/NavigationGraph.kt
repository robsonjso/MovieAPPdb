package com.example.movieappdb.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

// Classe de modelo para representar um item de navegação no Bottom Navigation
@Composable
fun NavigationGraph(navController: NavHostController) {
    // Composable que representa o gráfico de navegação
    NavHost(
        navController = navController,
        startDestination = BottomNavItem.MoviePopular.route

    ) {
        // Definição das telas do gráfico de navegação
        composable(BottomNavItem.MoviePopular.route) {

        }
        composable(BottomNavItem.MovieSearch.route) {

        }
        composable(BottomNavItem.MovieFavorite.route) {

        }
    }
}
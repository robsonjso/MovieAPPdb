package com.example.movieappdb.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Movie
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

// Classe de modelo para representar um item de navegação no Bottom Navigation
sealed class BottomNavItem(val title:String, val icon: ImageVector, val route:String){
    // Objetos que representam os itens do Bottom Navigation
    object MoviePopular: BottomNavItem(
        title = "Filmes Populares",
        icon = Icons.Default.Movie,
        route = "movie_popular_screen")

    // Objetos que representam os itens do Bottom Navigation
    object MovieSearch: BottomNavItem(
        title = "Pesquisar",
        icon = Icons.Default.Search,
        route = "movie_search_screen"
    )

    // Objetos que representam os itens do Bottom Navigation
    object MovieFavorite: BottomNavItem(
        title = "Favoritos",
        icon = Icons.Default.Favorite,
        route = "movie_favorite_screen"
    )
}

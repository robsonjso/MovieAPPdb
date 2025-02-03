package com.example.movieappdb.presentation.navigation

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.google.ai.client.generativeai.type.content

// Classe de modelo para representar um item de navegação no Bottom Navigation
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavHostController) {
    // Composable que representa a tela principal da aplicação
    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController)
        },
        content = {
            NavigationGraph(navController = navController)
        }
    )
}
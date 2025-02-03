package com.example.movieappdb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.movieappdb.presentation.navigation.MainScreen
import com.example.movieappdb.ui.theme.MovieAPPdbTheme
import dagger.hilt.android.AndroidEntryPoint

val apiKey = BuildConfig.API_KEY

// Classe de modelo para representar um item de navegação no Bottom Navigation
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MovieAPPdbTheme {
                MainScreen(navController = rememberNavController())
            }
        }
    }
}

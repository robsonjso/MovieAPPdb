package com.example.movieappdb.core.domain.model

data class MovieSearch(
    // Classe de modelo para representar os resultados dos filmes
    val id: Int,
    val voteAverage: Double = 0.0,
    val imageUrl: String = ""
)

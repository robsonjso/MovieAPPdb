package com.example.movieappdb.core.domain.model

data class Movie(
    // Classe de modelo para representar um filme
    val id: Int,
    val title: String,
    val voteAverage: Double = 0.0,
    val imageUrl: String = ""
)

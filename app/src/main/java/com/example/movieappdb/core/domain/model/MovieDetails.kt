package com.example.movieappdb.core.domain.model

data class MovieDetails(
    // Classe de modelo para representar os detalhes do filme
    val id: Int,
    val title: String,
    val genres: List<String>,
    val overview: String = "",
    val backdropPathUrl: String = "",
    val releaseDate: String = "",
    val voteAverage: Double = 0.0,
    val duration: String = "",
    val voteCount: Int = 0
)

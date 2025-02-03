package com.example.movieappdb.core.data.remote.response

import com.example.movieappdb.core.data.remote.response.Model.MovieResult

import com.google.gson.annotations.SerializedName

// Modelo de resposta da API
data class MovieResponse(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val results: List<MovieResult>,
    @SerializedName("total_page")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)
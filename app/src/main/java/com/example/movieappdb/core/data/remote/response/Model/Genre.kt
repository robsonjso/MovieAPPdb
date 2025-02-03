package com.example.movieappdb.core.data.remote.response.Model

import com.google.gson.annotations.SerializedName

// Classe para representar um gênero de filme
data class Genre(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String
)
package com.example.movieappdb.core.data.remote.response.Model

import com.google.gson.annotations.SerializedName

// Classe de modelo para representar um gênero de filme
data class ProductionCountry(
    @SerializedName("iso_3166_1")
    val iso31661: String,
    @SerializedName("name")
    val name: String
)
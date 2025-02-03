package com.example.movieappdb.core.data.remote.response.Model

import com.google.gson.annotations.SerializedName

// Classe de modelo para representar um gênero de filme
data class SpokenLanguage(
    @SerializedName("english_name")
    val englishNname: String,
    @SerializedName("iso_639_1")
    val iso6391: String,
    @SerializedName("name")
    val name: String
)
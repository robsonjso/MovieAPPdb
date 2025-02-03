package com.example.movieappdb.core.data.remote.response.Model

import com.google.gson.annotations.SerializedName

// Classe para representar uma empresa de produção
data class ProductionCompany(
    @SerializedName("id")
    val id: Int,
    @SerializedName("logo_path")
    val logoPath: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("origin_country")
    val originCcountry: String
)
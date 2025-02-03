package com.example.movieappdb.core.util

import com.example.movieappdb.BuildConfig

// Extensão para converter um caminho de imagem em uma URL completa
fun String?.toPostUrl() = "${BuildConfig.BASE_URL_IMAGE}$this"

// Classe de modelo para representar um gênero de filme
fun String?.toBackDropUrl() = "${BuildConfig.BASE_URL_IMAGE}$this"
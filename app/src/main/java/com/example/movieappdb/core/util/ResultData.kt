package com.example.movieappdb.core.util

sealed class ResultData<out T> {

    // Classe para representar um resultado de sucesso

    object Loading : ResultData<Nothing>()
    data class Success<out T>(val data: T?) : ResultData<T>()
    data class Error(val exception: Exception) : ResultData<Nothing>()

}
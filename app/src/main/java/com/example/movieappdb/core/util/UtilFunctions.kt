package com.example.movieappdb.core.util

import timber.log.Timber

object UtilFunctions {
    // Função para log de erros
    fun logError(tag: String, message: String) {
        Timber.tag(tag).e("error -> $message")
    }
    // Função para log de informações
    fun logInfo(tag: String, message: String) {
        Timber.tag(tag).i("Info -> $message")
    }

}
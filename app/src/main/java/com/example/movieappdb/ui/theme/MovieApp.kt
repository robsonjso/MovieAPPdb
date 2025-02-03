package com.example.movieappdb.ui.theme

import android.app.Application
import com.example.movieappdb.BuildConfig
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

// Classe de aplicativo para inicialização do Hilt
@HiltAndroidApp
class MovieApp : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())

        }
    }
}
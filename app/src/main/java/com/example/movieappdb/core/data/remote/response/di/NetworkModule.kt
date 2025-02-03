package com.example.movieappdb.core.data.remote.response.di

import com.example.movieappdb.BuildConfig
import com.example.movieappdb.core.data.remote.response.MovieService
import com.example.movieappdb.core.data.remote.response.ParamsInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

// Módulo para injeção de dependência
@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    private const val TIMEOUT_SECONDS = 15L

    @Provides
    fun provideParamsInterceptor(): ParamsInterceptor {
        return ParamsInterceptor()
    }

    // Configuração do log
    @Provides
    fun provideLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().apply {
            // Em ambiente de debug, mostra o corpo completo da requisição/resposta;
            // em ambiente de produção, desativa o log.
            level = if (BuildConfig.DEBUG)
                HttpLoggingInterceptor.Level.BODY
            else
                HttpLoggingInterceptor.Level.NONE
        }
    }

    // Configuração do cliente HTTP
    @Provides
    fun provideOkHttpClient(
        paramsInterceptor: ParamsInterceptor,
        loggingInterceptor: HttpLoggingInterceptor
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(paramsInterceptor)
            .addInterceptor(loggingInterceptor)
            .connectTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS)
            .readTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS)
            .writeTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS)
            .build()
    }

    // Converter para JSON
    @Provides
    fun provideGsonConverterFactory(): GsonConverterFactory {
        return GsonConverterFactory.create()
    }

    // Configuração do Retrofit
    @Provides
    fun provideMovieService(
        client: OkHttpClient,
        converterFactory: GsonConverterFactory
    ):MovieService {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .client(client)
            .addConverterFactory(converterFactory)
            .build()
            .create(MovieService::class.java)
    }
}

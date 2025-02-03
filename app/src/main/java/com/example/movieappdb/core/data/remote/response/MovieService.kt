package com.example.movieappdb.core.data.remote.response

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

// Interface para definir os endpoints da API
interface MovieService {

    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("page") page: Int
    ):MovieResponse

    @GET("search/multi")
    suspend fun searchMovie (
        @Query("query") query: String,
        @Query("page") page: Int
    ):SearchResponse

    @GET("movie/{movie_id}")
    suspend fun getMovie(
        @Path("movie_id") movieId: Int,
    ):MovieDetailResponse

    @GET("movie/{movie_id}/similar")
    suspend fun getMoviesSimilar (
        @Path("movie_id") movieId: Int,
        @Query("page") page: Int
    ):MovieResponse
}
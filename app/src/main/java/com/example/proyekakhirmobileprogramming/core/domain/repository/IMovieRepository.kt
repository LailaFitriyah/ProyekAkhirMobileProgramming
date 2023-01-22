package com.example.proyekakhirmobileprogramming.core.domain.repository

import com.example.proyekakhirmobileprogramming.core.data.remote.Resource
import com.project.proyek_akhir_mobile_programming.core.domain.model.Movie
import com.example.proyekakhirmobileprogramming.core.domain.model.TvShow
import kotlinx.coroutines.flow.Flow

interface IMovieRepository {
    fun getMovies(): Flow<Resource<List<Movie>>>
    fun getTvShow(): Flow<Resource<List<TvShow>>>
}
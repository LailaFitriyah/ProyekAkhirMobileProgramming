package com.project.proyek_akhir_mobile_programming.core.domain.usecase.movie

import com.example.proyekakhirmobileprogramming.core.data.remote.Resource
import com.project.proyek_akhir_mobile_programming.core.domain.model.Movie
import com.example.proyekakhirmobileprogramming.core.domain.model.TvShow
import kotlinx.coroutines.flow.Flow

interface MovieUseCase{
    fun getMovies(): Flow<Resource<List<Movie>>>
    fun getTvShow(): Flow<Resource<List<TvShow>>>
}
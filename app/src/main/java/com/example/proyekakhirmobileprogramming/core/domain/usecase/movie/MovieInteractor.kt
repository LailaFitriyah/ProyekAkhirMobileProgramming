package com.project.proyek_akhir_mobile_programming.core.domain.usecase.movie

import com.example.proyekakhirmobileprogramming.core.data.remote.Resource
import com.project.proyek_akhir_mobile_programming.core.domain.model.Movie
import com.example.proyekakhirmobileprogramming.core.domain.model.TvShow
import com.example.proyekakhirmobileprogramming.core.domain.repository.IMovieRepository
import kotlinx.coroutines.flow.Flow

class MovieInteractor(private val repository: IMovieRepository): MovieUseCase {
    override fun getMovies(): Flow<Resource<List<Movie>>> = repository.getMovies()
    override fun getTvShow(): Flow<Resource<List<TvShow>>> = repository.getTvShow()
}
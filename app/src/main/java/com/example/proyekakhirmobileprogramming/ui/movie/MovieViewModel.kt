package com.example.proyekakhirmobileprogramming.ui.movie



import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.project.proyek_akhir_mobile_programming.core.domain.usecase.movie.MovieUseCase


class MovieViewModel(private val useCase: MovieUseCase): ViewModel() {
    fun getMovies() = useCase.getMovies().asLiveData()
}


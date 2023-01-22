package com.example.proyekakhirmobileprogramming.ui.tvshow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.project.proyek_akhir_mobile_programming.core.domain.usecase.movie.MovieUseCase


class TvShowViewModel(private val useCase: MovieUseCase): ViewModel() {
    fun getTvShow() = useCase.getTvShow().asLiveData()
}
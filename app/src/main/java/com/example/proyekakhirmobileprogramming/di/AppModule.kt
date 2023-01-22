package com.project.proyek_akhir_mobile_programming.di

import com.example.proyekakhirmobileprogramming.ui.movie.MovieViewModel
import com.example.proyekakhirmobileprogramming.ui.tvshow.TvShowViewModel
import com.project.proyek_akhir_mobile_programming.core.domain.usecase.movie.MovieInteractor
import com.project.proyek_akhir_mobile_programming.core.domain.usecase.movie.MovieUseCase

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<MovieUseCase> { MovieInteractor(get()) }
}

val viewModelModule = module {
    viewModel { MovieViewModel(get()) }
    viewModel { TvShowViewModel(get()) }
}
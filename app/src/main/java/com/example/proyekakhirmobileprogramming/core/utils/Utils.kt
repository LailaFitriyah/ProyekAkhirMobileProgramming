package com.example.proyekakhirmobileprogramming.core.utils

import com.example.proyekakhirmobileprogramming.core.data.remote.response.MovieResponse
import com.project.proyek_akhir_mobile_programming.core.domain.model.Movie
import com.example.proyekakhirmobileprogramming.core.data.remote.response.TvShowResponse
import com.example.proyekakhirmobileprogramming.core.domain.model.TvShow

fun mapMovieResponseToDomain(input: MovieResponse) =
    Movie(
        input.id,
        input.name,
        input.desc,
        input.poster,
        input.imgPreview,
        input.releaseDate
    )
fun mapTvShowResponseToDomain(input: TvShowResponse) =
    TvShow(
        input.id,
        input.name,
        input.desc,
        input.poster,
        input.imgPreview,
        input.releaseDate
    )


package com.example.movie.service;

import com.example.movie.domain.Movie;

import java.util.List;

public interface IMovieService {
    Movie save(Movie movie);
    List<Movie> getAllMovies();
}

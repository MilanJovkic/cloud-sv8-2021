package com.example.movie.service;

import com.example.movie.domain.Movie;
import com.example.movie.repository.IMovieRepository;
import com.example.movie.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovieService implements IMovieService {
    @Autowired
    private IMovieRepository movieRepository;

    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
}

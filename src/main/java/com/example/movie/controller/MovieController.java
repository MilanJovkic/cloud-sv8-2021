package com.example.movie.controller;

import com.example.movie.domain.Movie;
import com.example.movie.service.IMovieService;
import com.example.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private IMovieService movieService;

    @PostMapping
    public Movie createMovie(@RequestBody Movie movie) {
        return movieService.save(movie);
    }
    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }
}

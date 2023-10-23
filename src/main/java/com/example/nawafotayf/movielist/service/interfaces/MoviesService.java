package com.example.nawafotayf.movielist.service.interfaces;

import com.example.nawafotayf.movielist.entity.Movies;

import java.util.List;

public interface MoviesService {
    public String addmovie(List<Movies> movies);
    public List<Movies> listAllMovies();
    public String deleteMovie(String name);
    public String updateMovie(String name, Movies movies);
}

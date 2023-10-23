package com.example.nawafotayf.movielist.controller;

import com.example.nawafotayf.movielist.entity.Movies;
import com.example.nawafotayf.movielist.service.implementations.MoviesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    MoviesServiceImpl moviesServiceImpl;
    @GetMapping(value = "movielist/movies")
    public List<Movies> movies (){
        return moviesServiceImpl.listAllMovies();
    }

    @PostMapping(value = "movielist/movies/addmovies")
    public String addMovie(@RequestBody List<Movies> movies){
        return moviesServiceImpl.addmovie(movies);
    }

    @DeleteMapping(value = "movielist/movies/deletemovie")
    public String deleteMovie(@RequestParam String name){
        return moviesServiceImpl.deleteMovie(name);
    }
    @PutMapping(value = "movielist/movies/updatemovie")
    public String updatemovie(@RequestParam String name, @RequestBody Movies movies){
        return moviesServiceImpl.updateMovie(name, movies);
    }


}

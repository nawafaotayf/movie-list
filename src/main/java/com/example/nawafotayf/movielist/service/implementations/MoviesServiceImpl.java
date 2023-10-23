package com.example.nawafotayf.movielist.service.implementations;

import com.example.nawafotayf.movielist.entity.Movies;
import com.example.nawafotayf.movielist.repository.MoviesRepository;
import com.example.nawafotayf.movielist.service.interfaces.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MoviesServiceImpl implements MoviesService {

    @Autowired
    MoviesRepository moviesRepository;
    @Override
    public String addmovie(List<Movies> movies) {
        moviesRepository.saveAll(movies);
        return "Movie added successfully";
    }

    @Override
    public List<Movies> listAllMovies() {
        return moviesRepository.findAll();
    }
    @Override
    public String deleteMovie(String name) {
        Movies movieName = moviesRepository.findByname(name);
        moviesRepository.delete(movieName);
        return "Movie deleted successfully";
    }
    @Override
    public String updateMovie(String name, Movies movies) {
        Movies movieName = moviesRepository.findByname(name);
        if(movies.getName() != null){
            movieName.setName(movies.getName());
        }
        if(movies.getStory() != null){
            movieName.setStory(movies.getStory());
        }
        if(movies.getDuration() != 0){
            movieName.setDuration(movies.getDuration());
        }
        if(movies.getStudios() != null){
            movieName.setStudios(movies.getStudios());
        }
        if(movies.getStart() != null){
            movieName.setStart(movies.getStart());
        }
        if(movies.getEnd() != null){
            movieName.setEnd(movies.getEnd());
        }
        moviesRepository.save(movieName);
        return "movie updated successfully";
    }
}


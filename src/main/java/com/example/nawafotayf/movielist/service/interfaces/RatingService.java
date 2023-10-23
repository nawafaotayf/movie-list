package com.example.nawafotayf.movielist.service.interfaces;

import com.example.nawafotayf.movielist.entity.Rating;

import java.util.List;

public interface RatingService {
    public String addRating(List<Rating> ratings);
    public List<Rating> listAllRating();
    public String deleteRating(int id);
    public String updateRating(int id, Rating rating);
}

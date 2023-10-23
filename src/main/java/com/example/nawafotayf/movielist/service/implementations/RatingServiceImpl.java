package com.example.nawafotayf.movielist.service.implementations;

import com.example.nawafotayf.movielist.entity.Rating;
import com.example.nawafotayf.movielist.repository.RatingRepository;
import com.example.nawafotayf.movielist.service.interfaces.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    RatingRepository ratingRepository;
    @Override
    public String addRating(List<Rating> ratings) {
        ratingRepository.saveAll(ratings);
        return "Rating added successfully";
    }

    @Override
    public List<Rating> listAllRating() {
        return ratingRepository.findAll();
    }

    @Override
    public String deleteRating(int id) {
       Rating rating = ratingRepository.findById(id).get();
       ratingRepository.delete(rating);
        return "rating delete successfully";
    }

    @Override
    public String updateRating(int id, Rating rating) {
        Rating findRating = ratingRepository.findById(id).get();
        if(rating.getRate() != null){
            findRating.setRate(rating.getRate());
        }
        if(rating.getComment() != null){
            findRating.setComment(rating.getComment());
        }
        ratingRepository.save(findRating);
        return "update successfully";
    }
}

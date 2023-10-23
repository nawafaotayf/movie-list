package com.example.nawafotayf.movielist.controller;

import com.example.nawafotayf.movielist.entity.Rating;
import com.example.nawafotayf.movielist.service.implementations.RatingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RatingController {
    @Autowired
    RatingServiceImpl ratingServiceImpl;

    @PostMapping(value = "movielist/rating/addrating")
    public String addRating(@RequestBody List<Rating> ratings){
        return ratingServiceImpl.addRating(ratings);
    }
    @GetMapping(value = "movielist/rating")
    public List<Rating> ratings (){
        return ratingServiceImpl.listAllRating();
    }
    @DeleteMapping(value = "movielist/rating/delete")
    public String deleteRating(@RequestParam int id){
        return ratingServiceImpl.deleteRating(id);
    }
    @PutMapping(value = "movielist/rating/update")
    public String updateRating(@RequestParam int id, @RequestBody Rating rating){
        return ratingServiceImpl.updateRating(id, rating);
    }
}

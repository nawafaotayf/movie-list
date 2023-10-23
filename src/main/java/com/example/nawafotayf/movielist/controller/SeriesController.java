package com.example.nawafotayf.movielist.controller;

import com.example.nawafotayf.movielist.entity.Series;
import com.example.nawafotayf.movielist.service.implementations.SeriesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SeriesController {
    @Autowired
    SeriesServiceImpl seriesServiceImpl ;

    @PostMapping(value = "movielist/series/addseries")
    public String addSeries(@RequestBody List<Series> series){
        return seriesServiceImpl.addSeries(series);
    }
    @GetMapping(value = "movielist/series")
    public List<Series> listAllSeries(){
        return seriesServiceImpl.listAllSeries();
    }
    @DeleteMapping(value = "movielist/series/delete")
    public String deleteSeries(@RequestParam String name){
        return seriesServiceImpl.deleteSeries(name);
    }
    @PutMapping(value = "movielist/series/update")
    public String updateSeries(@RequestParam String name, @RequestBody Series series){
        return seriesServiceImpl.updateSeries(name, series);
    }
}

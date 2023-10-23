package com.example.nawafotayf.movielist.service.interfaces;

import com.example.nawafotayf.movielist.entity.Series;

import java.util.List;

public interface SeriesService {

    public String addSeries(List<Series> series);
    public List<Series> listAllSeries();
    public String deleteSeries(String name);
    public String updateSeries(String name, Series series);
}

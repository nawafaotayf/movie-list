package com.example.nawafotayf.movielist.service.implementations;

import com.example.nawafotayf.movielist.entity.Series;
import com.example.nawafotayf.movielist.repository.SeriesRepository;
import com.example.nawafotayf.movielist.service.interfaces.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeriesServiceImpl implements SeriesService {
    @Autowired
    SeriesRepository seriesRepository;

    @Override
    public String addSeries(List<Series> series) {
        seriesRepository.saveAll(series);
        return "Series added Successfully";
    }

    @Override
    public List<Series> listAllSeries() {
        return seriesRepository.findAll();
    }

    @Override
    public String deleteSeries(String name) {
        Series series = seriesRepository.findByname(name);
        seriesRepository.delete(series);
        return "deleted successfully";
    }

    @Override
    public String updateSeries(String name, Series series) {
        Series findSeries = seriesRepository.findByname(name);
        if(series.getName() != null){
            findSeries.setName(series.getName());
        }
        if(series.getStory() != null){
            findSeries.setStory(series.getStory());
        }
        if(series.getDuration() != 0){
            findSeries.setDuration(series.getDuration());
        }
        if(series.getStudios() != null){
            findSeries.setStudios(series.getStudios());
        }
        if(series.getStart() != null){
            findSeries.setStart(series.getStart());
        }
        if(series.getEnd() != null){
            findSeries.setEnd(series.getEnd());
        }
        if(series.getSeasons() != 0){
            findSeries.setSeasons(series.getSeasons());
        }
        if(series.getEpisodes() != 0){
            findSeries.setEpisodes(series.getEpisodes());
        }
        seriesRepository.save(findSeries);

        return "Series updated successfully";
    }

}

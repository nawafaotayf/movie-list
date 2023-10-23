package com.example.nawafotayf.movielist.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_series")
public class Series extends Movies{
    private int episodes;
    private int seasons;

    public Series(int seasons, String name, String story, int duration, String studios, LocalDate start, LocalDate end, int episodes) {
        super(name, story, duration, studios, start, end);
        this.episodes = episodes;
        this.seasons = seasons;
    }

    public Series(){

    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Series series = (Series) o;
        return episodes == series.episodes && seasons == series.seasons;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), episodes, seasons);
    }

    @Override
    public String toString() {
        return "Series{" +
                "episodes=" + episodes +
                ", seasons=" + seasons +
                '}';
    }
}

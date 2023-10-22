package com.example.nawafotayf.movielist.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "tb_movies")
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String name;
    private String story;
    private int duration;
    private String studios;
    private LocalDate start;
    private LocalDate end;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;
    @OneToMany(mappedBy = "movies")
    private Set<Rating> rating;

    public Movies(String name, String story, int duration, String studios, LocalDate start, LocalDate end) {
        this.name = name;
        this.story = story;
        this.duration = duration;
        this.studios = studios;
        this.start = start;
        this.end = end;
    }

    public Movies() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getStudios() {
        return studios;
    }

    public void setStudios(String studios) {
        this.studios = studios;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Set<Rating> getRating() {
        return rating;
    }

    public void setRating(Set<Rating> rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movies movies = (Movies) o;
        return Id == movies.Id && duration == movies.duration && Objects.equals(name, movies.name) && Objects.equals(story, movies.story) && Objects.equals(studios, movies.studios) && Objects.equals(start, movies.start) && Objects.equals(end, movies.end) && Objects.equals(users, movies.users) && Objects.equals(rating, movies.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name, story, duration, studios, start, end, users, rating);
    }

    @Override
    public String toString() {
        return "Movies{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", story='" + story + '\'' +
                ", duration=" + duration +
                ", studios='" + studios + '\'' +
                ", start=" + start +
                ", end=" + end +
                ", users=" + users +
                ", rating=" + rating +
                '}';
    }
}

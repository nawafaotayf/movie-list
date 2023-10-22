package com.example.nawafotayf.movielist.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "You need to add username")
    private String username;
    @NotBlank(message = "You need to add password")
    private String password;
    @NotBlank(message = "You need to add date of birth")
    private LocalDate dob;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Roles roles;
    @OneToMany(mappedBy = "users")
    private Set<Movies> movies;
    @OneToMany(mappedBy = "users")
    private Set<Rating> rating;
    @OneToMany(mappedBy = "users")
    private Set<Series> series;
    public Users(String username, String password, LocalDate dob, Roles roles) {
        this.username = username;
        this.password = password;
        this.dob = dob;
        this.roles = roles;
    }

    public Users() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public Set<Movies> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movies> movies) {
        this.movies = movies;
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
        Users users = (Users) o;
        return id == users.id && Objects.equals(username, users.username) && Objects.equals(password, users.password) && Objects.equals(dob, users.dob) && Objects.equals(roles, users.roles) && Objects.equals(movies, users.movies) && Objects.equals(rating, users.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, dob, roles, movies, rating);
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", dob=" + dob +
                ", roles=" + roles +
                ", movies=" + movies +
                ", rating=" + rating +
                '}';
    }
}

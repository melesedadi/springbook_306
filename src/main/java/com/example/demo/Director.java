package com.example.demo;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long directorid;
    private String name;
    private String genre;
    @OneToMany(mappedBy = "director", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<Movie> movies;

    public long getDirectorid() {
        return directorid;
    }

    public void setDirectorid(long directorid) {
        this.directorid = directorid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }
}

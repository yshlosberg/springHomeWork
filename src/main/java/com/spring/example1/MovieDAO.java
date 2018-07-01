package com.spring.example1;

import java.util.Map;

public class MovieDAO {

    private Map<String,Movie> movies;

    public Map<String, Movie> getMovies() {
        return movies;
    }

    public void setMovies(Map<String, Movie> movies) {
        this.movies = movies;
    }
}

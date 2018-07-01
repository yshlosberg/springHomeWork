package com.spring.example1;

import java.util.List;

public interface IMDBService {

    int totalDefinedMovies();
    int totalDefinedActors();
    List<Actor> getActorsOfMovie(int movieID);
    List<Movie> getAllMoviesForActor(int actorID);




}


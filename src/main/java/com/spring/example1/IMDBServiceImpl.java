package com.spring.example1;

import java.util.ArrayList;
import java.util.List;

public class IMDBServiceImpl implements IMDBService {

    private MovieDAO moviesDAO;
    private ActorsDAO actorsDAO;


    @Override
    public int totalDefinedMovies() {
        return moviesDAO.getMovies().size();
    }

    @Override
    public int totalDefinedActors() {
        return actorsDAO.getActors().size();
    }

    @Override
    public List<Actor> getActorsOfMovie(int movieID) {
        return moviesDAO.getMovies().get(movieID).getActors();
    }

    @Override
    public List<Movie> getAllMoviesForActor(int actorID) {
        List<Movie> movielist =  new ArrayList<>();
        moviesDAO.getMovies().entrySet().stream().forEach(entry ->{
            if (entry.getValue().getActors().contains(actorID)){
                movielist.add(entry.getValue());
            }
        });
        return movielist;
    }
}

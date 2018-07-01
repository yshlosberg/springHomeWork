package com.spring.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Movie {

    private int id;
    private String name;
    private Genre genre;
//    private Actor mainActor;
//    private Actor secondaryActor;
    private List<Actor> actors;
    private int rating;

    public Movie(int id, String name, Genre genre, int rating) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.rating = rating;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre=" + genre +
                ", actors=" + actors +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }



}

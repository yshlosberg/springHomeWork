package com.spring.example1;

import java.util.Map;

public class ActorsDAO {

    Map<String,Actor> actors;

    public Map<String, Actor> getActors() {
        return actors;
    }

    public void setActors(Map<String, Actor> actors) {
        this.actors = actors;
    }
}

package com.spring.example1;

public class IMDBServiceFactory {
    private IMDBServiceFactory() {
    }

    public static getInstnace(){
       return new IMDBServiceFactory(MovieDAO movieDAO, ActorsDAO actorsDAO);
    }
}

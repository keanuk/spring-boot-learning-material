package com.keanukerr.lesson1.model;

import java.util.UUID;

public class Movie {

    private UUID id;
    private String name;
    private String director;
    private int rating;

    public Movie(String name, String director, int rating) {
        this.name = name;
        this.director = director;
        this.rating = rating;
        this.id = UUID.randomUUID();
    }

    public Movie() {
        this.id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}

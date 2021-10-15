package com.keanukerr.demo1.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Song {

    private final UUID id;
    private String title;
    private String artist;
    private String album;
    private String rating;

    public Song(UUID id, String title, String artist, String album, String rating) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.rating = rating;
    }

    public Song(String title, String artist, String album, String rating) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.rating = rating;
    }

    public Song() {
        this.id = UUID.randomUUID();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public UUID getId() {
        return id;
    }
}

package com.keanukerr.demo1.repository;

import com.keanukerr.demo1.model.Song;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class MediaRepository implements IMediaRepository {

    private final List<Song> songs = new ArrayList<>();

    @Override
    public int insertSong(UUID id, Song song) {
        songs.add(new Song(id, song.getTitle(), song.getArtist(), song.getAlbum(), song.getRating()));
        return HttpStatus.OK.value();
    }

    @Override
    public List<Song> getAllSongs() {
        return this.songs;
    }
}

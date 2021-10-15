package com.keanukerr.demo1.repository;

import com.keanukerr.demo1.model.Song;

import java.util.List;
import java.util.UUID;

public interface IMediaRepository {

    int insertSong(UUID id, Song song);

    default int insertSong(Song song) {
        return insertSong(UUID.randomUUID(), song);
    }

    List<Song> getAllSongs();
}

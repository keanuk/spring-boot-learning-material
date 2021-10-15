package com.keanukerr.demo1.repository;

import com.keanukerr.demo1.model.Song;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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

    @Override
    public Song getSongById(UUID id) {
        for (Song song : songs) {
            if (Objects.equals(song.getId().toString(), id.toString())) {
                System.out.println("Got the song");
                return song;
            }
        }
        return null;
    }

    @Override
    public int deleteSongById(UUID id) {
        for (Song song : songs) {
            if (song.getId().toString().equals(id.toString())) {
                songs.remove(song);
                return HttpStatus.OK.value();
            }
        }
        return HttpStatus.NOT_FOUND.value();
    }

    @Override
    public int updateSongById(UUID id, Song updatedSong) {
        for (Song song : songs) {
            if (song.getId().toString().equals(id.toString())) {
                updatedSong.setId(id);
                songs.remove(song);
                songs.add(updatedSong);
                return HttpStatus.OK.value();
            }
        }
        return HttpStatus.NOT_FOUND.value();
    }
}

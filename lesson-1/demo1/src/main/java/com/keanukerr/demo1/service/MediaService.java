package com.keanukerr.demo1.service;

import com.keanukerr.demo1.model.Song;
import com.keanukerr.demo1.repository.IMediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MediaService {

    private final IMediaRepository mediaRepository;

    @Autowired
    public MediaService(IMediaRepository mediaRepository) {
        this.mediaRepository = mediaRepository;
    }

    public int insertSong(Song song) {
        return mediaRepository.insertSong(song);
    }

    public List<Song> getAllSongs() {
        return mediaRepository.getAllSongs();
    }

    public Song getSongById(UUID id) {
        return mediaRepository.getSongById(id);
    }

    public int deleteSongById(UUID id) {
        return mediaRepository.deleteSongById(id);
    }

    public int updateSongById(UUID id, Song song) {
        return mediaRepository.updateSongById(id, song);
    }
}

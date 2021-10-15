package com.keanukerr.demo1.service;

import com.keanukerr.demo1.model.Song;
import com.keanukerr.demo1.repository.IMediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

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
}

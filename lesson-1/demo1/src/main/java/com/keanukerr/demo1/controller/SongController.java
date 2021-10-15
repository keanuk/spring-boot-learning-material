package com.keanukerr.demo1.controller;

import com.keanukerr.demo1.model.Song;
import com.keanukerr.demo1.repository.MediaRepository;
import com.keanukerr.demo1.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/songs")
@RestController
public class SongController {

    private final MediaService mediaService;

    @Autowired
    public SongController(MediaService mediaService) {
        this.mediaService = mediaService;
    }

    @PostMapping("/save")
    public int saveSong(@RequestBody Song song) {
        return mediaService.insertSong(song);
    }

    @GetMapping("get-all")
    public List<Song> getAllSongs() {
        return mediaService.getAllSongs();
    }

}

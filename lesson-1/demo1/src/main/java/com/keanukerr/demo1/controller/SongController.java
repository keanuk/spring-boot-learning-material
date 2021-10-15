package com.keanukerr.demo1.controller;

import com.keanukerr.demo1.model.Song;
import com.keanukerr.demo1.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RequestMapping("/songs")
@RestController
public class SongController {

    private final MediaService mediaService;

    @Autowired
    public SongController(MediaService mediaService) {
        this.mediaService = mediaService;
    }

    @PostMapping("/save")
    public int saveSong(@RequestBody @Valid final Song song) {
        return mediaService.insertSong(song);
    }

    @GetMapping("/get-all")
    public List<Song> getAllSongs() {
        return mediaService.getAllSongs();
    }

    @GetMapping("/{id}")
    public Song getSongById(@PathVariable("id") UUID id) {
        return mediaService.getSongById(id);
    }

    @DeleteMapping("/delete")
    public int deleteSongById(@RequestParam(value = "id") UUID id) {
        return mediaService.deleteSongById(id);
    }

    @PutMapping("/update")
    public int updateSongById(@RequestParam(value = "id") UUID id, @RequestBody Song song) {
        return mediaService.updateSongById(id, song);
    }

}

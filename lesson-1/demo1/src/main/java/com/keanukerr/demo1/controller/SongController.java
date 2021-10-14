package com.keanukerr.demo1.controller;

import com.keanukerr.demo1.model.Song;
import com.keanukerr.demo1.repository.MediaRepository;
import org.springframework.web.bind.annotation.*;

@RestController("/songs")
public class SongController {

    private final MediaRepository repository;

    @GetMapping("/hello-world")
    public String helloWorld(@RequestParam(value = "name", defaultValue = "World") String name,
                             @RequestParam(value = "last-name") String lastName) {
        return "Hello " + name + " " + lastName;
    }

    @PostMapping("/save")
    public String saveSong(@RequestBody Song song) {

    }

}

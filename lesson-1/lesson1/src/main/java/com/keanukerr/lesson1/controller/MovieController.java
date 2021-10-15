package com.keanukerr.lesson1.controller;

import com.keanukerr.lesson1.model.Movie;
import com.keanukerr.lesson1.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/movies")
@RestController
public class MovieController {

    private final MediaService mediaService;

    @Autowired
    public MovieController(MediaService mediaService) {
        this.mediaService = mediaService;
    }

    @GetMapping
    public String helloWorld(@RequestParam(value = "name") String name) {
        return "Hello " + name;
    }

    @PostMapping(path = "/create")
    public int createMovie(@RequestBody Movie movie) {
        return mediaService.addMovie(movie);
    }

    @GetMapping(path = "/get-all")
    public List<Movie> getAllMovies() {
        return mediaService.getAllMovies();
    }

    @GetMapping("{id}")
    public Movie getMovieById(@PathVariable("id") UUID id) {
        return mediaService.getMovieById(id);
    }

    @DeleteMapping("delete/{id}")
    public int deleteMovieById(@PathVariable("id") UUID id) {
        return mediaService.deleteMovie(id);
    }

    @PutMapping("update/{id}")
    public int updateMovieById(@PathVariable("id") UUID id, @RequestBody Movie movie) {
        return mediaService.updateMovie(id, movie);
    }
}

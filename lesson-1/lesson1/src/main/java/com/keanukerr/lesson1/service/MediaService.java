package com.keanukerr.lesson1.service;

import com.keanukerr.lesson1.model.Movie;
import com.keanukerr.lesson1.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MediaService {

    MediaRepository mediaRepository;

    @Autowired
    public MediaService(MediaRepository mediaRepository) {
        this.mediaRepository = mediaRepository;
    }

    public int addMovie(Movie movie) {
        return mediaRepository.addMovie(movie);
    }

    public List<Movie> getAllMovies() {
        return mediaRepository.getAllMovies();
    }

    public Movie getMovieById(UUID id) {
        return mediaRepository.getMovieById(id);
    }

    public int deleteMovie(UUID id) {
        return mediaRepository.deleteMovie(id);
    }

    public int updateMovie(UUID id, Movie movie) {
        return mediaRepository.updateMovie(id, movie);
    }
}

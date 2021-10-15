package com.keanukerr.lesson1.repository;

import com.keanukerr.lesson1.model.Movie;
import com.keanukerr.lesson1.service.MediaService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class MediaRepository {

    List<Movie> movies;

    public MediaRepository() {
        this.movies = new ArrayList<>();
    }

    public int addMovie(Movie movie) {
        movies.add(movie);
        return HttpStatus.OK.value();
    }

    public List<Movie> getAllMovies() {
        return movies;
    }

    public Movie getMovieById(UUID id) {
        for(Movie movie : movies) {
            if (movie.getId().toString().equals(id.toString())) {
                return movie;
            }
        }
        return null;
    }

    public int deleteMovie(UUID id) {
        for (Movie movie : movies) {
            if (movie.getId().toString().equals(id.toString())) {
                movies.remove(movie);
                return HttpStatus.OK.value();
            }
        }
        return HttpStatus.NOT_FOUND.value();
    }

    public int updateMovie(UUID id, Movie updatedMovie) {
        for (Movie movie : movies) {
            if (movie.getId().toString().equals(id.toString())) {
                updatedMovie.setId(movie.getId());
                movies.remove(movie);
                movies.add(updatedMovie);
                return HttpStatus.OK.value();
            }
        }
        return HttpStatus.NOT_FOUND.value();
    }
}

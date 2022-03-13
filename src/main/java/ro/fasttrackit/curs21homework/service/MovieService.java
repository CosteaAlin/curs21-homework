package ro.fasttrackit.curs21homework.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.curs21homework.entity.Movie;
import ro.fasttrackit.curs21homework.repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public List<Movie> getMovies() {
        return repository.findAll();
    }
}

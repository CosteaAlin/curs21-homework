package ro.fasttrackit.curs21homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.curs21homework.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}

package ro.fasttrackit.curs21homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.curs21homework.entity.Rating;

public interface RatingRepository extends JpaRepository<Rating,Integer> {
}

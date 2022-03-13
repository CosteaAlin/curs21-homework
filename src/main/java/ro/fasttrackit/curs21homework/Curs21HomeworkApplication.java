package ro.fasttrackit.curs21homework;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.curs21homework.entity.*;
import ro.fasttrackit.curs21homework.repository.ActorRepository;
import ro.fasttrackit.curs21homework.repository.MovieRepository;
import ro.fasttrackit.curs21homework.repository.StudioRepository;

import java.util.List;

@SpringBootApplication
public class Curs21HomeworkApplication {
    public static void main(String[] args) {
        SpringApplication.run(Curs21HomeworkApplication.class, args);
    }

    @Bean
    CommandLineRunner atStartup(MovieRepository movieRepository,
                                StudioRepository studioRepository,
                                ActorRepository actorRepository) {
        return args -> {
            Studio warner = studioRepository.save(new Studio("Warner", "123"));
            Actor tim = actorRepository.save(new Actor("Justin", 1985));
            Actor michael = actorRepository.save(new Actor("Caine", 1979));
            Actor bale = actorRepository.save(new Actor("Christian", 1980));
            Actor amanda = actorRepository.save(new Actor("Seyfried", 1992));
            movieRepository.saveAll(List.of(
                    new Movie("Fight Club", 1999)
                    , new Movie("Inception", 2010, new Rating(9, "Hollywood"))
                    , new Movie("In time", 2012, new Rating(10, "Hollywood"),
                            List.of(
                                    new Review("Good", "Bogdan")
                                    , new Review("Meh", "Sergiu")),
                            warner, List.of(tim, amanda, bale)
                    )
                    , new Movie("Batman", 2019, new Rating(8, "DC"), List.of(),
                            warner,List.of(bale, michael, tim))
            ));
        };
    }
}

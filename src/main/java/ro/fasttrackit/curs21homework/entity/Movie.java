package ro.fasttrackit.curs21homework.entity;

import javax.persistence.*;
import java.util.List;


@Entity
public class Movie {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int year;

    @OneToOne(cascade = CascadeType.ALL)
    private Rating rating;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Review> reviews;

    @ManyToOne
    private Studio studio;

    @ManyToMany
    private List<Actor> actors;

    public Movie() {
    }

    public Movie(String name, int year) {
        this(name, year, null);
    }

    public Movie(String name, int year, Rating rating) {
        this(name, year, rating, List.of());
    }

    public Movie(String name, int year, Rating rating, List<Review> reviews) {
        this(name, year, rating, reviews, null);
    }

    public Movie(String name, int year, Rating rating, List<Review> reviews, Studio studio) {
        this(name,year,rating,reviews,studio,List.of());
    }

    public Movie(String name, int year, Rating rating, List<Review> reviews, Studio studio, List<Actor> actors) {
        this.name = name;
        this.year = year;
        this.rating = rating;
        this.reviews = reviews;
        this.studio = studio;
        this.actors = actors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }
}

package com.example.olegkochurov.always.yes.library_authors.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Book {
    private String heading;
    private String genre;
    private int rating;
    private int  id;

    public Book(String heading, String genre, int rating) {
        this.heading = heading;
        this.genre = genre;
        this.rating = rating;
    }

    public Book() {

    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Book{" +
                "heading='" + heading + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    public int  getId() {
        return id;
    }
}

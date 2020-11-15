package com.example.assignment.models;

public class Movie {
    String movie_Name;
    String ratings;
    String Description;
    public String getMovie_Name() {
        return movie_Name;
    }

    public String getRatings() {
        return ratings;
    }

    public String getDescription() {
        return Description;
    }

    public void setMovie_Name(String movie_Name) {
        this.movie_Name = movie_Name;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Movie(String movie_Name, String ratings, String description) {
        this.movie_Name = movie_Name;
        this.ratings = ratings;
        Description = description;
    }
}

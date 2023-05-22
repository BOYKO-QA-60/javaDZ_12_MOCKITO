package ru.netology.javaqa;

public class MoviePosters {
    private int movieID;
    private String movieTitle;
    private String movieGenre;

    public MoviePosters(int movieID, String movieTitle, String movieGenre) {
        this.movieID = movieID;
        this.movieTitle = movieTitle;
        this.movieGenre = movieGenre;
    }

    public int getMovieID() {
        return movieID;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

}
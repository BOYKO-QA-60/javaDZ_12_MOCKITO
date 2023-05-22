package ru.netology.javaqa;

public class MoviePostersManager {
    public MoviePosters[] movies = new MoviePosters[0];
    private final int limit;

    public MoviePostersManager() {
        this.limit = 5;
    }

    public MoviePostersManager(int limit) {
        this.limit = limit;
    }

    public void addMovie(MoviePosters movie) {
        MoviePosters[] tmp = new MoviePosters[movies.length + 1];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public MoviePosters[] findAll() {
        return movies;
    }

    public MoviePosters[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        MoviePosters[] tmp = new MoviePosters[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}
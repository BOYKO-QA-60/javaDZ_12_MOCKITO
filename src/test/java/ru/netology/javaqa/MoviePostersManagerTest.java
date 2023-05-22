package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoviePostersManagerTest {
    MoviePostersManager manager = new MoviePostersManager();
    MoviePosters movie1 = new MoviePosters(1, "Номер один", "комедия");
    MoviePosters movie2 = new MoviePosters(2, "Тролли. Мировой тур", "мультфильм");
    MoviePosters movie3 = new MoviePosters(3, "Человек-невидимка", "ужасы");
    MoviePosters movie4 = new MoviePosters(4, "Джентльмены", "боевик");
    MoviePosters movie5 = new MoviePosters(5, "Отель 'Белград'", "комедия");
    MoviePosters movie6 = new MoviePosters(6, "Вперед", "мультфильм");
    MoviePosters movie7 = new MoviePosters(7, "Бладшот", "боевик");

    @BeforeEach
    public void setUp() {
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
    }

    @Test
    public void shouldAddMovie() {
        MoviePostersManager manager = new MoviePostersManager();

        manager.addMovie(movie1);

        MoviePosters[] expected = {movie1};
        MoviePosters[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll() {
        MoviePosters[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        MoviePosters[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {

        MoviePosters[] expected = {movie7, movie6, movie5, movie4, movie3};
        MoviePosters[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastLess() {
        MoviePostersManager manager = new MoviePostersManager(5);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);

        MoviePosters[] expected = {movie3, movie2, movie1};
        MoviePosters[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMore() {
        MoviePostersManager manager = new MoviePostersManager(3);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);

        MoviePosters[] expected = {movie5, movie4, movie3};
        MoviePosters[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastEqual() {
        MoviePostersManager manager = new MoviePostersManager(4);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);

        MoviePosters[] expected = {movie4, movie3, movie2, movie1};
        MoviePosters[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCheckLimit() {
        MoviePostersManager manager2 = new MoviePostersManager();

        int expected = 5;
        int actual = manager2.getLimit();

        Assertions.assertEquals(expected, actual);
    }

}
package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FilmManager10FilmsTest {
    private Film first = new Film(1, "url1", "Film1", "Genre1");
    private Film second = new Film(2, "url2", "Film2", "Genre2");
    private Film third = new Film(3, "url3", "Film3", "Genre3");
    private Film fourth = new Film(4, "url4", "Film4", "Genre4");
    private Film fifth = new Film(5, "url5", "Film5", "Genre5");
    private Film sixth = new Film(6, "url6", "Film6", "Genre6");
    private Film seventh = new Film(7, "url7", "Film7", "Genre7");
    private Film eight = new Film(8, "url8", "Film8", "Genre8");
    private Film ninth = new Film(9, "url9", "Film9", "Genre9");
    private Film tenth = new Film(10, "url10", "Film10", "Genre10");
    private Film eleventh = new Film(11, "url11", "Film11", "Genre11");
    private Film twelfth = new Film(12, "url12", "Film12", "Genre12");

    FilmManager manager = new FilmManager();

    @BeforeEach
    public void setUp() {
        manager.addFilms(first);
        manager.addFilms(second);
        manager.addFilms(third);
        manager.addFilms(fourth);
        manager.addFilms(fifth);
        manager.addFilms(sixth);
        manager.addFilms(seventh);
        manager.addFilms(eight);
        manager.addFilms(ninth);
        manager.addFilms(tenth);
        manager.addFilms(eleventh);
        manager.addFilms(twelfth);
    }

    @Test
    public void shouldGetAllFilms(){
        Film[] expected = new Film[]{
                twelfth,
                eleventh,
                tenth,
                ninth,
                eight,
                seventh,
                sixth,
                fifth,
                fourth,
                third};
        Film[] actual = manager.getFilms();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddFilm(){
        manager.addFilms(first);
        Film[] expected = new Film[]{
                first,
                twelfth,
                eleventh,
                tenth,
                ninth,
                eight,
                seventh,
                sixth,
                fifth,
                fourth};
        Film[] actual = manager.getFilms();
        assertArrayEquals(expected, actual);
        }

    }


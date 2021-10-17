package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FilmManagerNegativeTest {
    FilmManager manager10films = new FilmManager();
    FilmManager manager5films = new FilmManager(5);

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

    @Test
    public void shouldGetAllWith5() {
        manager5films.addFilms(fifth);
        manager5films.addFilms(sixth);
        manager5films.addFilms(seventh);
        Film[] expected = new Film[]{
                seventh,
                sixth,
                fifth};
        Film[] actual = manager5films.getFilms();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAllWith10() {
        manager10films.addFilms(fifth);
        manager10films.addFilms(sixth);
        manager10films.addFilms(seventh);
        Film[] expected = new Film[]{
                seventh,
                sixth,
                fifth};
        Film[] actual = manager10films.getFilms();
        assertArrayEquals(expected, actual);
    }

}

package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {

    private final Film first = new Film(1, "url1", "Film1", "Genre1");
    private final Film second = new Film(2, "url2", "Film2", "Genre2");
    private final Film third = new Film(3, "url3", "Film3", "Genre3");
    private final Film fourth = new Film(4, "url4", "Film4", "Genre4");
    private final Film fifth = new Film(5, "url5", "Film5", "Genre5");
    private final Film sixth = new Film(6, "url6", "Film6", "Genre6");
    private final Film seventh = new Film(7, "url7", "Film7", "Genre7");
    private final Film eight = new Film(8, "url8", "Film8", "Genre8");
    private final Film ninth = new Film(9, "url9", "Film9", "Genre9");
    private final Film tenth = new Film(10, "url10", "Film10", "Genre10");
    private final Film eleventh = new Film(11, "url11", "Film11", "Genre11");
    private final Film twelfth = new Film(12, "url12", "Film12", "Genre12");


    @Test
    public void shouldAddFilms() {
        FilmManager manager = new FilmManager(5);
        manager.addFilms(first);
        Film[] expected = new Film[]{
                first,
                twelfth,
                eleventh,
                tenth,
                ninth};
        Film[] actual = manager.getFilms();
        assertArrayEquals(expected, actual);
        }


    @Test
    void getFilms() {
    }
}
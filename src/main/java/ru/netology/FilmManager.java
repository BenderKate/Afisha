package ru.netology;

public class FilmManager {
    private int filmAmount = 10;

    private Film[] films = new Film[filmAmount];

    public FilmManager() {
        int filmAmount = 10;
    }

    public FilmManager(int filmAmount) {
        this.filmAmount = filmAmount;
    }

    public void addFilms(Film film) {
        int length = films.length + 1;
        Film[] tmp = new Film[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }


    public Film[] getFilms() {
        int resultLength;
        if (filmAmount < 10) {
            resultLength = filmAmount;
        } else {
            resultLength = 10;
        }

        Film[] result = new Film[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

}

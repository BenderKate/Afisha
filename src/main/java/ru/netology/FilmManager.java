package ru.netology;

public class FilmManager {
    private int filmAmount = 10;

    private Film[] films = new Film[filmAmount];

    public FilmManager() {
        this.filmAmount = 10;
    }

    public FilmManager(int filmAmount) {
        this.filmAmount = filmAmount;
    }

    public void addFilms(Film film) {
        int length = films.length + 1;
        Film[] tmp = new Film[length];
        System.arraycopy(films, 0, tmp, 0, length - 1);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }


    public Film[] getFilms() {
        Film[] tmpresult = new Film[filmAmount];
        int counter = 0;
        for (int i = 0; i < filmAmount; i++) {
            int index = films.length - i - 1;
            if(films[index] != null){
                tmpresult[counter] = films[index];
                counter += 1;
            }
        }
        Film[] result = new Film[counter];
        System.arraycopy(tmpresult, 0, result, 0, counter );
        return result;
    }

}

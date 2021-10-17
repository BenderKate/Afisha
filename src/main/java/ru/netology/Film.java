package ru.netology;

public class Film {
    private int filmId;
    private String imageUrl;
    private String filmName;
    private String filmGenre;

    public Film(){
    }
    public Film(int filmId, String imageUrl, String filmName, String filmGenre) {
        this.filmId = filmId;
        this.imageUrl = imageUrl;
        this.filmName = filmName;
        this.filmGenre = filmGenre;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmId=" + filmId +
                ", imageUrl='" + imageUrl + '\'' +
                ", filmName='" + filmName + '\'' +
                ", filmGenre='" + filmGenre + '\'' +
                '}';
    }

    public void setFilmId(int filmId){
    }
    public int getFilmId(){
        return filmId;
    }

    public void setImageUrl(String imageUrl){
    }
    public String getImageUrl(){
        return imageUrl;
    }

    public void setFilmName(String filmName){
    }
    public String getFilmName(){
        return filmName;
    }

    public void setFilmGenre(String filmGenre){
    }
    public String getFilmGenre(){
        return filmGenre;
    }

}



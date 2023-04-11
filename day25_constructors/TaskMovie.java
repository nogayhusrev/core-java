package day25_constructors;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskMovie {
    public String country,title,genre,director;
    public LocalDate releaseDate;
    public ArrayList<String> casts=new ArrayList<>();

    public TaskMovie(String country,String title,String genre,LocalDate releaseDate,String director){

        this.country=country;
        this.title=title;
        this.genre=genre;
        this.releaseDate=releaseDate;
        this.director=director;

    }

    public void addCasts(String name){
        casts.add(name);
    }

    public void addCasts(String [] names){
        casts.addAll(Arrays.asList(names));
    }

    @Override
    public String toString() {
        return "TaskMovie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", releaseDate=" + releaseDate +
                ", casts=" + casts.size() +
                '}';
    }
}
/*
Task04:
    1. Create a custom class named  Movie:
        Attributes:
            country, title, Genre, releaseDate, director, casts (ArrayList<String>)

        Add a constructor to set the country, title, release date, and director of the Movie

        Actions
            addCast(String): adds the given string argument to the arrayList casts
            addCasts(String[]): adds the given string array argument to the arrayList casts
            toString(): returns the name of country, title, release date, and total number of casts

    2. create a class called TestMovieObjects
            1. create an object of the movie:
                    title: Java Developer: Zero to Hero
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 04/18/2021
                    director: Kuzzat Altay
                    Casts: Ozzy, Ali, Muhtar and 5 more students from your group

        print the full info of the movie
 */
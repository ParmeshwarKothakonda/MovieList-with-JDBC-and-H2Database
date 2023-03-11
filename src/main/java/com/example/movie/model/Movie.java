package com.example.movie.model;



public class Movie{
    private int movieId;
    private String movieName;
    private String leadActor;

    public Movie(int movieId, String movieName, String leadActor){
        this.movieId = movieId;
        this.movieName = movieName;
        this.leadActor = leadActor;
    } 

    public int getMovieId(){ //Getter
        return this.movieId;
    }

    public void setMovieId(int movieId){
        this.movieId = movieId;
    }

    public String getMovieName(){ //Getter
        return this.movieName;
    }

    public void SetMovieName(String movieName){
        this.movieName = movieName;
    }

    public String getLeadActor(){ //Getter
        return this.leadActor;
    }

    public void setLeadActor(String leadActor){
        this.leadActor = leadActor;
    }
}
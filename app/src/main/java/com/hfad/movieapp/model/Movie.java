package com.hfad.movieapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sdobhal on 6/8/2017.
 */

public class Movie {
    @SerializedName("poster_path")
    private String posterPath;
    @SerializedName("adult")
    private boolean adult;
    @SerializedName("overview")
    private String overview;
    @SerializedName("release_date")
    private String releaseDate;
    @SerializedName("genre_ids")
    private List<Integer> genreIds=new ArrayList<Integer>();
    @SerializedName("id")
    private Integer id;
    @SerializedName("original_title")
    private String originalTitle;
    @SerializedName("original_language")
    private String originalLanguage;
    @SerializedName("title")
    private String title;
    @SerializedName("backdrop_path")
    private String backdropPath;
    @SerializedName("popularity")
    private double popularity;
    @SerializedName("vote_count")
    private Integer voteCount;
    @SerializedName("video")
    private Boolean video;
    @SerializedName("vote_average")
    private double voteAverage;

    public Movie(String posterPath, boolean adult, String overview, String releaseDate, List<Integer> genreIds, Integer id, String originalTitle, String originalLanguage, String title, String backdropPath, double popularity, Integer voteCount, Boolean video, Double voteAverage){
        this.posterPath=posterPath;
        this.adult=adult;
        this.overview=overview;
        this.releaseDate=releaseDate;
        this.genreIds=genreIds;
        this.id=id;
        this.originalLanguage=originalLanguage;
        this.originalTitle=originalTitle;
        this.title=title;
        this.backdropPath=backdropPath;
        this.popularity=popularity;
        this.voteCount=voteCount;
        this.video=video;
        this.voteAverage=voteAverage;

    }

    String baseImageUrl="http://image.tmdb.org/t/p/w500";

    public String getPosterPath(){
        return "http://image.tmdb.org/t/p/w500"+posterPath;
    }
    public void setPosterPath(String posterPath){
        this.posterPath=posterPath;
    }
    public boolean isAdult(){
        return adult;
    }
    public void setAdult(boolean adult){
        this.adult=adult;
    }
    public String getOverview(){
        return overview;
    }
    public void setOverview(String overview){
        this.overview=overview;
    }
    public String getReleaseDate(){
        return releaseDate;
    }
    public void setReleaseDate(){
        this.releaseDate=releaseDate;
    }
    public List<Integer> getGenreIds(){
        return genreIds;
    }
    public void setGenreIds(){
        this.genreIds=genreIds;
    }
    public Integer getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public String getOriginalTitle(){
        return originalTitle;
    }
    public void setOriginalTitle(){
        this.originalTitle=originalTitle;
    }
    public String getOriginalLanguage(){
        return originalLanguage;
    }
    public void setOriginalLanguage(){
        this.originalLanguage=originalLanguage;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(){
        this.title=title;
    }
    public String getBackdropPath(){
        return backdropPath;
    }
    public void setBackdropPath(){
        this.backdropPath=backdropPath;
    }
    public double getPopularity(){
        return popularity;
    }
    public void setPopularity(){
        this.popularity=popularity;
    }
    public Integer getVoteCount(){
        return voteCount;
    }
    public void setVoteCount(){
        this.voteCount=voteCount;
    }
    public boolean isVideo(){
        return video;
    }
    public void setVideo(){
        this.video=video;
    }
    public double getvoteAverage(){
        return voteAverage;
    }
    public void setVoteAverage(){
        this.voteAverage=voteAverage;
    }
}

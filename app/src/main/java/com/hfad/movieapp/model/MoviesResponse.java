package com.hfad.movieapp.model;

import android.graphics.Movie;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by sdobhal on 6/8/2017.
 */

public class MoviesResponse {
    @SerializedName("page")
    private int page;
    @SerializedName("results")
    private List<Movie> results;
    @SerializedName("total_results")
    private int totalResults;
    @SerializedName("total_pages")
    private int totalPages;

    public int getPage(){
        return page;
    }
    public void setPage(){
        this.page=page;
    }
    public List<Movie> getResults(){
        return results;
    }
    public void setResults(){
        this.results=results;
    }

    public int getTotalResults(){
        return totalResults;
    }
    public void setTotalResults(){
        this.totalResults=totalResults;
    }
    public int getTotalPages(){
        return totalPages;
    }
    public void setTotalPages(){
        this.totalPages=totalPages;
    }

}
//Comment for GIT Check
//Comment for GIT Check
//Comment for GIT Check
//Comment for GIT Check

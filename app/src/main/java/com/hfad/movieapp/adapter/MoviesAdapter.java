package com.hfad.movieapp.adapter;

import android.content.Context;
import android.graphics.Movie;
import android.support.v4.widget.SearchViewCompatIcs;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.hfad.movieapp.R;
import com.hfad.movieapp.model.Movie;

import java.util.List;

/**
 * Created by sdobhal on 6/8/2017.
 */

public class  MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {
    private Context mContext;
    private List<com.hfad.movieapp.model.Movie> movieList;
    public MoviesAdapter(Context mContext, List<com.hfad.movieapp.model.Movie> movieList){
        this.mContext=mContext;
        this.movieList=movieList;
    }
    @Override
    public MoviesAdapter.MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(android.R.layout.movie_card, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MoviesAdapter.MyViewHolder viewHolder, int i){
        viewHolder.title.setText(movieList.get(i).getOriginalTitle());
        String vote=Double.toString(movieList.get(i).getvoteAverage());
        viewHolder.userrating.setText(vote);
        Glide.with(mContext)
                .load(movieList.get(i).getPosterPath())
                .placeholder(R.drawable.load)
                .into(viewHolder.thumbnail);
    }

    @Override
    public int getItemCount(){
        return movieList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title, userrating;
        public ImageView thumbnail;

        public MyViewHolder(View view){
            super(view);
            title=(TextView) view.findViewById(R.id.title);
            userrating=(TextView) view.findViewById(R.id.userrating);
            thumbnail=(ImageView)view.findViewById(R.id.thumbnail);

            view.setOnClickListener(new View.onClickListener(){
                @Override
                public  void onClick(View v){
                    int pos=getAdapterPosition();
                    
                }
            });
        }
    }

}
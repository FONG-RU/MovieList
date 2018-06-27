package com.example.administrator.movielist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MovieAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private ArrayList<Movie> movies;

    public MovieAdapter(Context context, ArrayList<Movie> movies) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        this.movies = movies;
    }

    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Object getItem(int position) {
        return movies.get(position);
    }

    @Override
    public long getItemId(int position) {
        return movies.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Movie movie = (Movie) getItem(position);
        View view = inflater.inflate(R.layout.item_list, null);
        ImageView img = view.findViewById(R.id.img);
        img.setImageResource(movie.getImg());
        TextView name = view.findViewById(R.id.name);
        name.setText(movie.getName());
        TextView date = view.findViewById(R.id.date);
        date.setText(movie.getDate());
        TextView introduction = view.findViewById(R.id.introduction);
        introduction.setText(movie.getIntroduction());
        return view;
    }
}

package com.example.assignment.adaptors;


import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.assignment.R;


    public class MovieCustomAdapter extends ArrayAdapter<String> {

        private final Activity context;
        private final String[] maintitle;
        private final String[] rating;
        private final Integer[] imgid;
        private final String[] description;

        public MovieCustomAdapter(Activity context, String[] maintitle, String[] rating, Integer[] imgid,String[] description) {
            super(context, R.layout.movies_row_layout, maintitle);
            // TODO Auto-generated constructor stub

            this.context=context;
            this.maintitle=maintitle;
            this.rating=rating;
            this.imgid=imgid;
            this.description=description;

        }


    }

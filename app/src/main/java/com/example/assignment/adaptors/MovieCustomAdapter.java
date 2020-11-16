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
        public View getView(int position,View view,ViewGroup parent) {
            LayoutInflater inflater=context.getLayoutInflater();
            View rowView=inflater.inflate(R.layout.movies_row_layout, null,true);

            TextView titleText = (TextView) rowView.findViewById(R.id.title);
            ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
            TextView ratingText = (TextView) rowView.findViewById(R.id.rating);
            TextView descriptiontext=(TextView) rowView.findViewById(R.id.description);
            titleText.setText(maintitle[position]);
            imageView.setImageResource(imgid[position]);
            ratingText.setText(rating[position]);
            descriptiontext.setText(description[position]);

            return rowView;

        };

    }

package com.example.assignment;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.assignment.adaptors.MovieCustomAdapter;

public class MainActivity extends AppCompatActivity {
    ListView list;

    String[] maintitle ={
            "UnnadiOkateyJindhagi","Linga","Narappa","Devadas","Dhrushyam",
    };

    String[] rating ={
            "Rating:3/5","Rating:2/5",
            "Rating:4/5","Rating:4.5/5",
            "Rating:5/5",
    };


    String[] description ={
            "this movie about Love story between two persons","This movie about bank robbery by two Brains",
            "plan to save his son from crucial situation","A beautiful gang war love story between two friends",
            "plan to escape his daughter from murder situations",
    };

    Integer[] imgid={
            R.drawable.download_1,R.drawable.download_2,
            R.drawable.download_3,R.drawable.download_4,
            R.drawable.download_5,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        



    }
}
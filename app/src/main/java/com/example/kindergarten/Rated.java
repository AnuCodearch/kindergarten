package com.example.kindergarten;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Rated extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rated);

        Intent caller=getIntent();
        float rating=caller.getFloatExtra("nbStars",0);
        TextView textView=(TextView) findViewById(R.id.textView);
        textView.setText("Thanks!! \n\n Your rating: "+rating);

    }
}

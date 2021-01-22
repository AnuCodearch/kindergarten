package com.example.kindergarten;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class RatingClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_class);
    }
    public void rateenter(View v){
        RatingBar ratingBar=(RatingBar) findViewById(R.id.ratingBar);
        float rating=ratingBar.getRating();
      Toast.makeText(getApplicationContext(), "Thanks for feedback!", Toast.LENGTH_SHORT).show();
        Intent rate=new Intent();
        rate.setClass(this,Rated.class);
        rate.putExtra("nbStars",rating);
        startActivity(rate);
        finish();
    }
}

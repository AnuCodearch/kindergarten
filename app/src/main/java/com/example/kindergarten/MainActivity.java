package com.example.kindergarten;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void learn(View v){
        Intent gotoLearn=new Intent();
        gotoLearn.setClass(this,Class_alpha.class);
        startActivity(gotoLearn);
    }

    public void rate(View v){
        Intent goToRate=new Intent();
        goToRate.setClass(this,RatingClass.class);
        startActivity(goToRate);
    }

    public void quizhome(View v){
        Intent home=new Intent();
        home.setClass(this,QuizhomeClass.class);
        startActivity(home);
    }

    public void exit(View v){
        finish();
    }
}
 /*public void meth_a(View v){
        Intent gotoA=new Intent();
        gotoA.setClass(this,Class_A.class);
        startActivity(gotoA);
    }*/
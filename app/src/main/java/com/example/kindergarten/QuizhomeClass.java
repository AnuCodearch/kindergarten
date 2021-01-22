package com.example.kindergarten;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class QuizhomeClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizhome_class);

        Intent caller=getIntent();
        TextView textView = findViewById(R.id.textView);
        textView.setText("Sorry, quizzes under maintenance !!");
    }
}

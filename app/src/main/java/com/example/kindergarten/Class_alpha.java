package com.example.kindergarten;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

public class Class_alpha extends AppCompatActivity {

    NumberPicker possibilities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_alpha);

        possibilities = (NumberPicker) findViewById(R.id.numberPicker);
        String[] possibilitiesStrings = {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        possibilities.setDisplayedValues(possibilitiesStrings);
        possibilities.setMinValue(1);
        possibilities.setMaxValue(possibilitiesStrings.length);

    }
     public void alpha_pick(View v) {
         ImageView img1 = (ImageView) findViewById(R.id.firstimage);
         ImageView img2 = (ImageView) findViewById(R.id.secondimage);
         ImageView img3 = (ImageView) findViewById(R.id.thirdimage);
         TextView nameplate=(TextView) findViewById(R.id.nameplate);
         int choice = possibilities.getValue();
     switch (possibilities.getValue()) {
         case 1:
             Toast.makeText(getApplicationContext(), "You picked A", Toast.LENGTH_SHORT).show();
             img1.setImageResource(R.drawable.a);
             img2.setImageResource(R.drawable.as);
             img3.setImageResource(R.drawable.afor1);
             nameplate.setText("A for Apple");
             break;
         case 2:
             Toast.makeText(getApplicationContext(), "You picked B", Toast.LENGTH_SHORT).show();
             img1.setImageResource(R.drawable.b);
             img2.setImageResource(R.drawable.bs);
             img3.setImageResource(R.drawable.bfor);
             nameplate.setText("B for Ball");
             break;
         case 3:
             Toast.makeText(getApplicationContext(), "You picked C", Toast.LENGTH_SHORT).show();
             img1.setImageResource(R.drawable.c);
             img2.setImageResource(R.drawable.cs);
             img3.setImageResource(R.drawable.cfor);
             nameplate.setText("C for Cat");
             break;
         case 4:
             Toast.makeText(getApplicationContext(), "You picked D", Toast.LENGTH_SHORT).show();
             img1.setImageResource(R.drawable.d);
             img2.setImageResource(R.drawable.ds);
             img3.setImageResource(R.drawable.dfor);
             nameplate.setText("D for Dog");
             break;
         case 5:
             Toast.makeText(getApplicationContext(), "You picked E", Toast.LENGTH_SHORT).show();
             img1.setImageResource(R.drawable.e);
             img2.setImageResource(R.drawable.es);
             img3.setImageResource(R.drawable.efor);
             nameplate.setText("E for Elephant");
             break;
         case 6:
             Toast.makeText(getApplicationContext(), "You picked F", Toast.LENGTH_SHORT).show();
             img1.setImageResource(R.drawable.f);
             img2.setImageResource(R.drawable.f);
             img3.setImageResource(R.drawable.ffor);
             nameplate.setText("F for Fish");
             break;
         case 7:
             Toast.makeText(getApplicationContext(), "You picked G", Toast.LENGTH_SHORT).show();
             img1.setImageResource(R.drawable.g);
             img2.setImageResource(R.drawable.gs);
             img3.setImageResource(R.drawable.gfor);
             nameplate.setText("G for Goat");
             break;
         case 8:
             Toast.makeText(getApplicationContext(), "You picked H", Toast.LENGTH_SHORT).show();
             img1.setImageResource(R.drawable.h);
             img2.setImageResource(R.drawable.hs);
             img3.setImageResource(R.drawable.hfor);
             nameplate.setText("H for Hat");
             break;
         case 9:
             Toast.makeText(getApplicationContext(), "You picked I", Toast.LENGTH_SHORT).show();
             img1.setImageResource(R.drawable.i);
             img2.setImageResource(R.drawable.is);
             img3.setImageResource(R.drawable.ifor);
             nameplate.setText("I for Ice-cream");
             break;
         case 10:
             Toast.makeText(getApplicationContext(), "You picked J", Toast.LENGTH_SHORT).show();
             img1.setImageResource(R.drawable.j);
             img2.setImageResource(R.drawable.js);
             img3.setImageResource(R.drawable.jfor);
             nameplate.setText("J for Joker");
             break;
         case 11:
             Toast.makeText(getApplicationContext(), "You picked K", Toast.LENGTH_SHORT).show();
             img1.setImageResource(R.drawable.k);
             img2.setImageResource(R.drawable.ks);
             img3.setImageResource(R.drawable.kfor);
             nameplate.setText("K for Kite");
             break;
         case 12:
             Toast.makeText(getApplicationContext(), "You picked L", Toast.LENGTH_SHORT).show();
             img1.setImageResource(R.drawable.l);
             img2.setImageResource(R.drawable.ls);
             img3.setImageResource(R.drawable.lfor);
             nameplate.setText("L for Lion");
             break;
         case 13:
             Toast.makeText(getApplicationContext(), "You picked M", Toast.LENGTH_SHORT).show();
             img1.setImageResource(R.drawable.m);
             img2.setImageResource(R.drawable.ms);
             img3.setImageResource(R.drawable.mfor);
             nameplate.setText("M for Monkey");
             break;
         case 14:
             Toast.makeText(getApplicationContext(), "You picked N", Toast.LENGTH_SHORT).show();
             img1.setImageResource(R.drawable.n);
             img2.setImageResource(R.drawable.ns);
             img3.setImageResource(R.drawable.nfor);
             nameplate.setText("N for Nest");
             break;
         case 15:
             Toast.makeText(getApplicationContext(), "You picked O", Toast.LENGTH_SHORT).show();
             img1.setImageResource(R.drawable.o);
             img2.setImageResource(R.drawable.os);
             img3.setImageResource(R.drawable.ofor);
             nameplate.setText("O for Orange");
             break;
         case 16:
             Toast.makeText(getApplicationContext(), "You picked P", Toast.LENGTH_SHORT).show();
             img1.setImageResource(R.drawable.p);
             img2.setImageResource(R.drawable.ps);
             img3.setImageResource(R.drawable.pfor);
             nameplate.setText("P for Parrot");
             break;
         case 17:
             Toast.makeText(getApplicationContext(), "You picked Q", Toast.LENGTH_SHORT).show();
             img1.setImageResource(R.drawable.q);
             img2.setImageResource(R.drawable.qs);
             img3.setImageResource(R.drawable.qfor);
             nameplate.setText("Q for Queen");
             break;
         case 18:
             Toast.makeText(getApplicationContext(), "You picked R", Toast.LENGTH_SHORT).show();
             img1.setImageResource(R.drawable.r);
             img2.setImageResource(R.drawable.rs);
             img3.setImageResource(R.drawable.rfor);
             nameplate.setText("R for Rabbit");
             break;
         case 19:
             Toast.makeText(getApplicationContext(), "You picked S", Toast.LENGTH_SHORT).show();
             img1.setImageResource(R.drawable.s);
             img2.setImageResource(R.drawable.ss);
             img3.setImageResource(R.drawable.sfor);
             nameplate.setText("S for Snake");
             break;
         case 20:
             Toast.makeText(getApplicationContext(), "You picked T", Toast.LENGTH_SHORT).show();
             img1.setImageResource(R.drawable.t);
             img2.setImageResource(R.drawable.ts);
             img3.setImageResource(R.drawable.tfor);
             nameplate.setText("T for Tiger");
             break;
         case 21:
             Toast.makeText(getApplicationContext(), "You picked U", Toast.LENGTH_SHORT).show();
             img1.setImageResource(R.drawable.u);
             img2.setImageResource(R.drawable.us);
             img3.setImageResource(R.drawable.ufor);
             nameplate.setText("U for Umbrella");
             break;
         case 22:
             Toast.makeText(getApplicationContext(), "You picked V", Toast.LENGTH_SHORT).show();
             img1.setImageResource(R.drawable.v);
             img2.setImageResource(R.drawable.vs);
             img3.setImageResource(R.drawable.vfor);
             nameplate.setText("V for Van");
             break;
         case 23:
             Toast.makeText(getApplicationContext(), "You picked W", Toast.LENGTH_SHORT).show();
             img1.setImageResource(R.drawable.w);
             img2.setImageResource(R.drawable.ws);
             img3.setImageResource(R.drawable.wfor);
             nameplate.setText("W for Watch");
             break;
         case 24:
             Toast.makeText(getApplicationContext(), "You picked X", Toast.LENGTH_SHORT).show();
             img1.setImageResource(R.drawable.x);
             img2.setImageResource(R.drawable.xs);
             img3.setImageResource(R.drawable.xfor);
             nameplate.setText("X for Xylophone");
             break;
         case 25:
             Toast.makeText(getApplicationContext(), "You picked Y", Toast.LENGTH_SHORT).show();
             img1.setImageResource(R.drawable.y);
             img2.setImageResource(R.drawable.ys);
             img3.setImageResource(R.drawable.yfor);
             nameplate.setText("Y for Yacht");
             break;
         case 26:
             Toast.makeText(getApplicationContext(), "You picked Z", Toast.LENGTH_SHORT).show();
             img1.setImageResource(R.drawable.z);
             img2.setImageResource(R.drawable.zs);
             img3.setImageResource(R.drawable.zfor);
             nameplate.setText("Z for Zebra");
             break;
         }


     }}
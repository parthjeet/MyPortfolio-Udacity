package com.example.warlord.myportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button Declarations
        Button buttonSpotify = (Button) findViewById(R.id.btnSpotify);
        Button buttonScores = (Button) findViewById(R.id.btnScores);
        Button buttonLibrary = (Button) findViewById(R.id.btnLibrary);
        Button buttonBuild = (Button) findViewById(R.id.btnBuild);
        Button buttonXYZ = (Button) findViewById(R.id.btnXYZ);
        Button buttonCapstone = (Button) findViewById(R.id.btnCapstone);


        buttonSpotify.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(), "This Button will launch my Spotify App!", Toast.LENGTH_SHORT).show();
            }
        });
        buttonScores.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(), "This Button will launch my Scores App!", Toast.LENGTH_SHORT).show();
            }
        });
        buttonLibrary.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(), "This Button will launch my Library App!", Toast.LENGTH_SHORT).show();
            }
        });
        buttonBuild.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(), "This Button will launch my Build it Bigger App!", Toast.LENGTH_SHORT).show();
            }
        });
        buttonXYZ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(), "This Button will launch my XYZ Reader App!", Toast.LENGTH_SHORT).show();
            }
        });
        buttonCapstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(), "This Button will launch my Capstone Project App!", Toast.LENGTH_SHORT).show();
            }
        });



    }



}

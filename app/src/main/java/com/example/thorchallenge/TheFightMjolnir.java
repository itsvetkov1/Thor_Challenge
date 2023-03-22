package com.example.thorchallenge;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TheFightMjolnir extends AppCompatActivity {

    private Button buttonday1;
    private Button buttonday2;
    private Button buttonday3;
    // ... add more jump jacks buttons as needed

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_fight_mjolnir);

        // Get the jump jacks buttons
        buttonday1 = findViewById(R.id.button_day1);
        buttonday2 = findViewById(R.id.button_day2);
        buttonday3 = findViewById(R.id.button_day3);
        // ... get the remaining jump jacks buttons

        // Set click listeners on the jump jacks buttons
        buttonday1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirectTo("jump_jacks_1.html");
            }
        });

        buttonday2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirectTo("jump_jacks_2.html");
            }
        });

        buttonday3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirectTo("jump_jacks_3.html");
            }
        });

        // ... set click listeners on the remaining jump jacks buttons
    }

    private void redirectTo(String filename) {
        // Redirect to the specified HTML file
        Intent intent = new Intent(TheFightMjolnir.this, WebViewActivity.class);
        intent.putExtra("fileUrl", "file:///android_asset/" + filename);
        startActivity(intent);
    }

    }


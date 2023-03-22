package com.example.thorchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MjolnirPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mjolnir_page);

        Button theFightButton = findViewById(R.id.theFightButton);
        theFightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MjolnirPage.this, TheFightMjolnir.class);
                startActivity(intent);
            }
        });
    }
}


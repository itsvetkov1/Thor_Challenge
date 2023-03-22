package com.example.thorchallenge;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton mjolnirButton = findViewById(R.id.mjolnirButton);
        mjolnirButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MjolnirPage.class);
                startActivity(intent);
            }
        });


    }

    public void openmjolnir_page(View view) {
        Intent intent = new Intent(this, MjolnirPage.class);
        startActivity(intent);
    }
}



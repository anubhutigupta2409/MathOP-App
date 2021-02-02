package com.example.mathop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //our buttons
    private Button easy;
    private Button medium;
    private Button difficult;

    //on launching of the app
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        easy = (Button) findViewById(R.id.easy);

        //opens a new activity on clicking the easy button
        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEasy();
            }
        });

        //opens a new activity on clicking the medium button
        medium = (Button) findViewById(R.id.medium);
        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMedium();
            }
        });

        //opens a new activity on clicking the difficult button
        difficult = (Button) findViewById(R.id.difficult);
        difficult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDifficult();
            }
        });

    }

    //required methods
    public void openEasy() {
        Intent intentEasy = new Intent(this, easy.class);
        startActivity(intentEasy);
    }

    public void openMedium() {
        Intent intentMedium = new Intent(this, medium.class);
        startActivity(intentMedium);
    }
    public void openDifficult() {
        Intent intentDifficult = new Intent(this, difficult.class);
        startActivity(intentDifficult);
    }
}
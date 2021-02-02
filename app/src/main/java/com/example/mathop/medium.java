package com.example.mathop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class medium extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium);

        final Random myRandom = new Random();

        //generates the number
        Button buttonGenerate1 = (Button)findViewById(R.id.generateNumber);
        final TextView textGenerateNumber1 = (TextView)findViewById(R.id.generateNumber);

        //generates the task for the user
        Button buttonGenerate2 = (Button)findViewById(R.id.generateTask);
        final TextView textGenerateNumber2 = (TextView)findViewById(R.id.generateTask);

        //generates the value of N
        Button buttonGenerate3 = (Button)findViewById(R.id.generateN);
        final TextView textGenerateNumber3 = (TextView)findViewById(R.id.generateN);

        //generates the result
        Button buttonGenerate4 = (Button)findViewById(R.id.generateResult);
        final TextView textGenerateNumber4 = (TextView)findViewById(R.id.generateResult);


        int x=myRandom.nextInt(100)+1;

        int y=myRandom.nextInt(2);

        int z=myRandom.nextInt(3)+1;

        double r = (double)(1/(double)z);

        //required methods

        buttonGenerate1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                textGenerateNumber1.setText(String.valueOf(x));
            }
        });

        buttonGenerate2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                switch (y)
                {
                    case 0:
                        textGenerateNumber2.setText("Calculate N'th ROOT of the number");
                        break;
                    case 1:
                        textGenerateNumber2.setText("Calculate N'th POWER of the number");
                        break;
                }
            }
        });

        buttonGenerate3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                textGenerateNumber3.setText(String.valueOf(z));
            }
        });

        buttonGenerate4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                switch (y)
                {
                    case 0:
                        textGenerateNumber4.setText(String.valueOf(Math.pow(x,r)));
                        break;
                    case 1:
                        textGenerateNumber4.setText(String.valueOf(Math.pow(x,z)));
                        break;
                }

            }
        });

    }
}
package com.example.mathop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class easy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);

        final Random myRandom = new Random();

        //this button generates the first number
        Button buttonGenerate1 = (Button)findViewById(R.id.generateFirst);
        final TextView textGenerateNumber1 = (TextView)findViewById(R.id.generateFirst);

        //this button generates the second number
        Button buttonGenerate2 = (Button)findViewById(R.id.generateSecond);
        final TextView textGenerateNumber2 = (TextView)findViewById(R.id.generateSecond);

        //this button generates the operation
        Button buttonGenerate4 = (Button)findViewById(R.id.generateOperation);
        final TextView textGenerateNumber4 = (TextView)findViewById(R.id.generateOperation);

        //this button generates the result
        Button buttonGenerate3 = (Button)findViewById(R.id.generateResult);
        final TextView textGenerateNumber3 = (TextView)findViewById(R.id.generateResult);

        int x=myRandom.nextInt(100)+1;
        int y=myRandom.nextInt(100)+1;

        int z=myRandom.nextInt(5);

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
                textGenerateNumber2.setText(String.valueOf(y));
            }
        });

        buttonGenerate4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                switch (z)
                {
                    case 0 :
                        textGenerateNumber4.setText("+");
                        break;
                    case 1 :
                        textGenerateNumber4.setText("-");
                        break;
                    case 2:
                        textGenerateNumber4.setText("*");
                        break;
                    case 3 :
                        textGenerateNumber4.setText("%");
                        break;
                    case 4 :
                        textGenerateNumber4.setText("/");
                        break;
                }
            }
        });

        buttonGenerate3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                switch (z)
                {
                    case 0 :
                        textGenerateNumber3.setText(String.valueOf(x+y));
                        break;
                    case 1 :
                        textGenerateNumber3.setText(String.valueOf(x-y));
                        break;
                    case 2:
                        textGenerateNumber3.setText(String.valueOf(x*y));
                        break;
                    case 3 :
                        textGenerateNumber3.setText(String.valueOf(x%y));
                        break;
                    case 4 :
                        textGenerateNumber3.setText(String.valueOf(x/y));
                        break;
                }
            }
        });
    }
}
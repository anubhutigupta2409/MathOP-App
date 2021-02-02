package com.example.mathop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class difficult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficult);

        final Random myRandom = new Random();

        //generates the first number
        Button buttonGenerate1 = (Button)findViewById(R.id.generateFirst);
        final TextView textGenerateNumber1 = (TextView)findViewById(R.id.generateFirst);

        //generates the second number
        Button buttonGenerate2 = (Button)findViewById(R.id.generateSecond);
        final TextView textGenerateNumber2 = (TextView)findViewById(R.id.generateSecond);

        //generates the task
        Button buttonGenerate3 = (Button)findViewById(R.id.generateTask);
        final TextView textGenerateNumber3 = (TextView)findViewById(R.id.generateTask);

        //generates the result
        Button buttonGenerate4 = (Button)findViewById(R.id.generateResult);
        final TextView textGenerateNumber4 = (TextView)findViewById(R.id.generateResult);

        int x=myRandom.nextInt(100)+1;
        int y=myRandom.nextInt(100)+1;
        int z=myRandom.nextInt(2);

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

        buttonGenerate3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                switch (z)
                {
                    case 0:
                        textGenerateNumber3.setText("Calculate HCF of the two numbers");
                        break;
                    case 1:
                        textGenerateNumber3.setText("Calculate LCM of the two numbers");
                        break;
                }
            }
        });


        buttonGenerate4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                switch (z)
                {
                    case 0:
                        textGenerateNumber4.setText(String.valueOf(hcf(x,y)));
                        break;
                    case 1:
                        textGenerateNumber4.setText(String.valueOf(lcm(x,y)));
                        break;
                }
            }
        });


    }
    public int hcf(int x, int y)
    {


        // base case
        if (x == y)
            return x;

        // a is greater
        if (x > y)
            return hcf(x-y, y);
        return hcf(x, y-x);
    }
    public int lcm(int x, int y)
    {
        return (x / hcf(x, y)) * y;
    }
}
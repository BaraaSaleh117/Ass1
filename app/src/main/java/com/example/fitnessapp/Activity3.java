package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }

    public void Calculate(View view) {//Thread

        EditText Y = (EditText) findViewById(R.id.textView2);
        EditText A = (EditText) findViewById(R.id.textView4);
        EditText C = (EditText) findViewById(R.id.textView7);


                int YearOfBearth = Integer.parseInt(Y.getText().toString());
                int age = 2021 - YearOfBearth;
                //Toast.makeText(this,"Welcome "+age,Toast.LENGTH_LONG).show();
                A.setText("your Age is :" + age);

                if (age > 2 && age < 10) {
                    C.setText("-Walking");
                } else if (age > 10 && age < 40) {
                    C.setText( "\n" + " -jogging\n" +
                            "-swimming\n" +
                            "-horse riding\n" +
                            "-tennis");
                } else if (age > 40 && age < 60) {
                    C.setText("-Walking and jogging ");
                } else
                    C.setText("-Sleeping at home ☺") ;

            }


    public void Get(View view) {
        TextView res = (TextView) findViewById(R.id.textView12);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =0 ; i<100000000;i++){
                    res.setText("\n"+"activity "+i );

                }

            }
        });
        t1.start();
    }

    public void next(View view) {
        Intent myintent =new Intent(this,Activity4.class);
        startActivity(myintent);
    }
}
package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        final EditText text;
//        text =findViewById(R.id.txt3);
//        final EditText text2;
//        text2 =findViewById(R.id.email);

    }

    public void loginP(View view) {
        EditText textuser =(EditText) findViewById(R.id.txt2);
        Intent myintent =new Intent(this,Activity2.class);
        Bundle b =new Bundle();
        b.putString("User Name", textuser.getText().toString());
        myintent.putExtras(b);
        startActivity(myintent);
    }

}
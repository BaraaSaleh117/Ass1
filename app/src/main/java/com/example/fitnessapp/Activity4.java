package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Activity4 extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private Button applyButton;
    private Button SaveButton;
    private Switch switch1;
    public static final String SHARD_PREFS = "shardPrefs";
    public static final String TEXT = "text";
    public static final String SWITCH1 = "switch1";
    private String text;
    private boolean switchOnOf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        textView = (TextView) findViewById(R.id.textView13);
        editText = (EditText) findViewById(R.id.edittextid);
        applyButton = (Button) findViewById(R.id.applybutton);
        SaveButton = (Button) findViewById(R.id.saveid);
        switch1 = (Switch) findViewById(R.id.swichid);
        LoadData();
        UpdateData();

    }

    public void Apply(View view) {
        textView.setText(editText.getText().toString());

    }

    public void save(View view) {
        saveData();
    }

    public void saveData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARD_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString(TEXT ,textView.getText().toString());
        editor.putBoolean(SWITCH1 ,switch1.isChecked());
        editor.apply();

        Toast.makeText(this, "DATA SAVED ",Toast.LENGTH_SHORT).show();

    }
    public void LoadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARD_PREFS, MODE_PRIVATE);
        text=sharedPreferences.getString(TEXT,"");
        switchOnOf =sharedPreferences.getBoolean(SWITCH1,false);


    }
    public void UpdateData() {
    textView.setText(text);
    switch1.setChecked(switchOnOf);
    }

}

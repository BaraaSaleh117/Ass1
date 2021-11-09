package com.example.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {
    private final  String KindsOfSports []= {" ","Volleyball","Tennis","Table Tennis","Swimming"
            ,"Aerobics","Football"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Spinner spinner =findViewById(R.id.spinner2);
        TextView textView = (TextView)findViewById(R.id.textView10) ;
        ArrayAdapter<String> adapter = new ArrayAdapter<>(Activity2.this, android.R.layout.simple_spinner_dropdown_item,KindsOfSports);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                textView.setText(parent.getItemAtPosition(position).toString());
                String t = textView.getText().toString();
                if(t=="Football") {

                    textView.setText("Improving heart health and blood pressure.\n" +
                            "Increasing muscle mass and bone strength in inactive individuals.\n" +
                            "Reducing body fat.\n" +
                            "Building strength, stamina and speed.\n" +
                            "Training your brain, improving concentration and coordination.");
                }
                else if (t=="Volleyball"){
                    textView.setText("Burning calories. ...\n" +
                            "Keep a Toned Body. ...\n" +
                            "Heighten the Body's Metabolic Rate. ...\n" +
                            "Rejuvenate Vital Organs in the Body. ...\n" +
                            "Improve the social attributes of an individual. ...\n" +
                            "Reduce the stress and anxiety levels. ...\n" +
                            "Escape the risk of obesity and gathering body fat. ...\n" +
                            "Improves muscle and nerve coordination.");
                }
                else if (t=="Tennis"){
                    textView.setText("increasing aerobic capacities.\n" +
                            "lowering resting heart rate and blood pressure.\n" +
                            "improving metabolic function.\n" +
                            "increasing bone density.\n" +
                            "lowering body fat.\n" +
                            "improving muscle tone, strength and flexibility.\n" +
                            "increasing reaction times.");
                }
                else if (t=="Table Tennis"){
                    textView.setText("Improving hand-eye coordination. ...\n" +
                            "Improving reflexes. ...\n" +
                            "It's easy on the joints. ...\n" +
                            "It burns calories. ...\n" +
                            "It's a social sport. ...\n" +
                            "It keeps your brain sharp. ...\n" +
                            "Table tennis is utilized a treatment for dementia. ...\n" +
                            "It improves balance.");
                }
                else if (t=="Swimming"){
                    textView.setText("keeps your heart rate up but takes some of the impact stress off your body.\n" +
                            "builds endurance, muscle strength and cardiovascular fitness.\n" +
                            "helps you maintain a healthy weight, healthy heart and lungs.\n" +
                            "tones muscles and builds strength.");
                }
                else if (t=="Aerobics"){
                    textView.setText("Decreases risk of heart disease.\n" +
                            "Lowers blood pressure.\n" +
                            "Increases HDL or \"good\" cholesterol.\n" +
                            "Helps to better control blood sugar.\n" +
                            "Assists in weight management and/or weight loss.\n" +
                            "Improves lung function.\n" +
                            "Decreases resting heart rate.");
                }



            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




      //  TextView textView =(TextView)findViewById(R.id.textView);
        Bundle b =getIntent().getExtras();
        String user = b.getString("User Name");
        Toast.makeText(this,"Welcome "+user,Toast.LENGTH_LONG).show();
    }
    public void button4(View view) {

        Intent myintent =new Intent(this,Activity3.class);
        startActivity(myintent);
    }


}
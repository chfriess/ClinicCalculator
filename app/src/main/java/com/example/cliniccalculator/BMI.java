package com.example.cliniccalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMI extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi);

        Button bmiButton = (Button) findViewById(R.id.buttonCalculateBMI);
        bmiButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText weightText = (EditText) findViewById(R.id.enterAge);
                EditText heightText = (EditText) findViewById(R.id.enterWeight);
                TextView resultBMIText = (TextView) findViewById(R.id.textViewBMI);
                double weight = 0;
                double height = 0;
                try {
                    weight = Double.parseDouble(weightText.getText().toString());
                    height = Double.parseDouble(heightText.getText().toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                double bmi = weight / (height * height);
                bmi = (Math.floor(bmi*10))/10;

                resultBMIText.setText("BMI = " + bmi);



                            }
        });

        FloatingActionButton fab = findViewById(R.id.fabBMI);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BMI.this,Pop_Bmi.class));
            }
        });

    }


}

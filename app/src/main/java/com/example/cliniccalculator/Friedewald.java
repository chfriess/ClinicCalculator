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

public class Friedewald extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friedewald);

        Button ldlButton = (Button) findViewById(R.id.buttonCalculateLDL);
        ldlButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText cholesterolText = (EditText) findViewById(R.id.enterCholesterol);
                EditText tagText = (EditText) findViewById(R.id.enterTriglycerides);
                EditText hdlText = (EditText) findViewById(R.id.enterHDL_friedewald);
                TextView resultLDLText = (TextView) findViewById(R.id.resultFriedwald);

                double cholesterol = 0;
                double tag = 0;
                double hdl = 0;

                try {
                    cholesterol = Double.parseDouble(cholesterolText.getText().toString());
                    tag = Double.parseDouble(tagText.getText().toString());
                    hdl = Double.parseDouble(hdlText.getText().toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                double ldl = cholesterol - hdl - (tag/3);
                ldl = (Math.floor(ldl*10))/10;

                resultLDLText.setText("LDL = " + ldl + "[mg/dl]");




            }
        });

        FloatingActionButton fab = findViewById(R.id.fabFriedwald);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Friedewald.this,Pop_Friedwald.class));
            }
        });

    }

}

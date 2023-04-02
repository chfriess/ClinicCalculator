package com.example.cliniccalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class GFRIV extends AppCompatActivity {
    boolean gender4 = false;
    RadioGroup radioGroup_genderGFR4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gfriv);

        Button gfrButton = (Button) findViewById(R.id.buttonCalculateGFRIV);
        gfrButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){


                radioGroup_genderGFR4 = (RadioGroup) findViewById(R.id.RadioGroupAgeGFR4);

                radioGroup_genderGFR4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
                {
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch(checkedId){
                            case R.id.radioButtonGFRMale4:
                                gender4 = true;
                                break;
                            case R.id.radioButtonGFRFemale4:
                                gender4 = false;
                                break;
                            default:
                                gender4 = false;
                                break;
                        }
                    }
                });


                EditText ageText = (EditText) findViewById(R.id.enterAge4);
                EditText cystatinText = (EditText) findViewById(R.id.enterCystatin);
                EditText creatininText = (EditText) findViewById(R.id.enterCreatinin4);




                double age = 0;
                double cystatin = 0;
                double creatinin = 0;




                double gfr = 0;



                try {
                    age = Double.parseDouble(ageText.getText().toString());
                    cystatin = Double.parseDouble(cystatinText.getText().toString());
                    creatinin = Double.parseDouble(creatininText.getText().toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }

                gfr = 767*cystatin-0.61*creatinin-0.4*age-0.57;
                if(gender4 == false){
                    gfr *= 0.87;
                }

                gfr = Math.round(gfr*1000)/1000;

                TextView resultGFRText = (TextView) findViewById(R.id.textViewGFRIVResult);
                resultGFRText.setText("GFR = " + gfr + "ml/min/1,73m²");



            }
        });

        FloatingActionButton fab = findViewById(R.id.fabGFRIV);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GFRIV.this,Pop_GfrIV.class));
            }
        });

    }
}

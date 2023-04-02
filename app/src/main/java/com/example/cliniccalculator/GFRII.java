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

public class GFRII extends AppCompatActivity {
    boolean gender2 = false;
    boolean coloured = false;
    RadioGroup radioGroup_genderGFR2;
    RadioGroup radioGroup_coloured;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gfrii);

        Button gfr2Button = (Button) findViewById(R.id.buttonCalculateGFRII);
        gfr2Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){


                radioGroup_genderGFR2 = (RadioGroup) findViewById(R.id.RadioGroupAgeGFR2);

                radioGroup_genderGFR2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
                {
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch(checkedId){
                            case R.id.radioButtonGFRMale2:
                                gender2 = true;
                                break;
                            case R.id.radioButtonGFRFemale2:
                                gender2 = false;
                                break;
                            default:
                                gender2 = false;
                                break;
                        }
                    }
                });

                radioGroup_coloured = (RadioGroup) findViewById(R.id.RadioGroupColoured);

                radioGroup_coloured.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
                {
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch(checkedId){
                            case R.id.radioButtonnotcoloured:
                                coloured = true;
                                break;
                            case R.id.radioButtonGFRcoloured:
                                coloured = false;
                                break;
                            default:
                                coloured = false;
                                break;
                        }
                    }
                });


                EditText age2Text = (EditText) findViewById(R.id.enterAge2);
                EditText creatinin2Text = (EditText) findViewById(R.id.enterCreatinin2);




                double age = 0;
                double creatinin = 0;




                double gfr = 0;



                try {
                    age = Double.parseDouble(age2Text.getText().toString());
                    creatinin = Double.parseDouble(creatinin2Text.getText().toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }

                gfr = 186.3*creatinin*age*(Math.pow(Math.E,-0.203));
                if(gender2 == false){
                    gfr *= 0.742;
                }
                if(coloured == true){
                    gfr *= 1.21;
                }

                gfr = Math.round(gfr*1000)/1000;

                TextView resultGFRText = (TextView) findViewById(R.id.textViewGFRIIResult);
                resultGFRText.setText("GFR = " + gfr + "ml/min per 1,73 m²");



            }
        });

        FloatingActionButton fab = findViewById(R.id.fabGFRII);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GFRII.this,Pop_GfrII.class));
            }
        });

    }
}

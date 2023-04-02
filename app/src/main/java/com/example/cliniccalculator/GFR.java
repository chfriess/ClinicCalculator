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
import android.widget.Switch;
import android.widget.TextView;

public class GFR extends AppCompatActivity {

    boolean gender = false;
    RadioGroup radioGroup_genderGFR;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gfr);

        Button gfrButton = (Button) findViewById(R.id.buttonCalculateGFR);
        gfrButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){


                radioGroup_genderGFR = (RadioGroup) findViewById(R.id.RadioGroupAgeGFR);

                radioGroup_genderGFR.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
                {
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch(checkedId){
                            case R.id.radioButtonGFRMale:
                                gender = true;
                                break;
                            case R.id.radioButtonGFRFemale:
                                gender = false;
                                break;
                            default:
                                gender = false;
                                break;
                        }
                    }
                });


                EditText ageText = (EditText) findViewById(R.id.enterAge);
                EditText weightText = (EditText) findViewById(R.id.enterWeight);
                EditText creatininText = (EditText) findViewById(R.id.enterCreatinin);




                double age = 0;
                double weight = 0;
                double creatinin = 0;




                double gfr = 0;



                try {
                    age = Double.parseDouble(ageText.getText().toString());
                    weight = Double.parseDouble(weightText.getText().toString());
                    creatinin = Double.parseDouble(creatininText.getText().toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }

                gfr = ((140-age)*weight)/72*creatinin;
                if(gender == false){
                    gfr *= 0.85;
                }

                gfr = Math.round(gfr*1000)/1000;

                TextView resultGFRText = (TextView) findViewById(R.id.textViewGFRResult);
                resultGFRText.setText("GFR = " + gfr + "ml/min");



            }
        });

        FloatingActionButton fab = findViewById(R.id.fabGFR);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GFR.this,Pop_Gfr.class));
            }
        });

    }

}

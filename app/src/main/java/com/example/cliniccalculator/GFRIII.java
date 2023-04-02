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

public class GFRIII extends AppCompatActivity {
    boolean gender3 = false;
    boolean coloured2 = false;
    RadioGroup radioGroup_genderGFR3;
    RadioGroup radioGroup_coloured2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gfriii);

        Button gfr3Button = (Button) findViewById(R.id.buttonCalculateGFRIII);
        gfr3Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){


                radioGroup_genderGFR3 = (RadioGroup) findViewById(R.id.RadioGroupAgeGFR3);

                radioGroup_genderGFR3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
                {
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch(checkedId){
                            case R.id.radioButtonGFRMale3:
                                gender3 = true;
                                break;
                            case R.id.radioButtonGFRFemale3:
                                gender3 = false;
                                break;
                            default:
                                gender3 = false;
                                break;
                        }
                    }
                });

                radioGroup_coloured2 = (RadioGroup) findViewById(R.id.RadioGroupColoured2);

                radioGroup_coloured2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
                {
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch(checkedId){
                            case R.id.radioButtonGFRnotcolouredii:
                                coloured2 = true;
                                break;
                            case R.id.radioButtonGFRcolouredii:
                                coloured2 = false;
                                break;
                            default:
                                coloured2 = false;
                                break;
                        }
                    }
                });


                EditText age3Text = (EditText) findViewById(R.id.enterAge3);
                EditText creatinin3Text = (EditText) findViewById(R.id.enterCreatinin3);




                double age = 0;
                double creatinin = 0;
                double a = 1;
                double k = 1;

                if (gender3== false)
                    a = -0.329;
                else
                    a = -0.411;

                if (gender3== false)
                    k = 0.7;
                else
                    k = 0.9;




                double gfr = 0;



                try {
                    age = Double.parseDouble(age3Text.getText().toString());
                    creatinin = Double.parseDouble(creatinin3Text.getText().toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }

                gfr = 141*Math.pow(Math.min(creatinin/k,1),a)*Math.pow(Math.max((creatinin/k),1),-1.209)*Math.pow(0.993,age);

                if(gender3 == false){
                    gfr *= 1.018;
                }
                if(coloured2 == true){
                    gfr *= 1.159;
                }

                gfr = Math.round(gfr*1000)/1000;

                TextView resultGFRText = (TextView) findViewById(R.id.textViewGFRIIIResult);
                resultGFRText.setText("GFR = " + gfr + "ml/min per 1,73 m²");



            }
        });

        FloatingActionButton fab = findViewById(R.id.fabGFRIII);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GFRIII.this,Pop_GfrIII.class));
            }
        });

    }
}

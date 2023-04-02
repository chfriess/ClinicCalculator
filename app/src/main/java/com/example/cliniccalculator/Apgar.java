package com.example.cliniccalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Apgar extends AppCompatActivity {

    int appearance, pulse, grimace, activity, respiration, apgar = 0;
    RadioGroup radioGroup_appearance,radioGroup_pulse,radioGroup_grimace,radioGroup_activity, radioGroup_respiration;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apgar);

        radioGroup_appearance = (RadioGroup) findViewById(R.id.RG_appearance);

        radioGroup_appearance.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButtonAppearance1:
                        appearance = 0;
                        break;
                    case R.id.radioButtonAppearance2:
                        appearance = 1;
                        break;
                    case R.id.radioButtonAppearance3:
                        appearance = 2;
                        break;
                    default:
                        appearance = 0;
                }
            }
        });

        radioGroup_pulse = (RadioGroup) findViewById(R.id.RG_pulse);

        radioGroup_pulse.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButtonPulse1:
                        pulse = 0;
                        break;
                    case R.id.radioButtonPulse2:
                        pulse = 1;
                        break;
                    case R.id.radioButtonPulse3:
                        pulse = 2;
                        break;
                    default:
                        pulse = 0;
                }
            }
        });

        radioGroup_grimace = (RadioGroup) findViewById(R.id.RG_grimace);

        radioGroup_grimace.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButtonGrimace1:
                        grimace = 0;
                        break;
                    case R.id.radioButtonGrimace2:
                        grimace= 1;
                        break;
                    case R.id.radioButtonGrimace3:
                        grimace= 2;
                        break;
                    default:
                        grimace = 0;
                }
            }
        });

        radioGroup_activity = (RadioGroup) findViewById(R.id.RG_activity);

        radioGroup_activity.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButtonActivity1:
                        activity = 0;
                        break;
                    case R.id.radioButtonActivity2:
                        activity = 1;
                        break;
                    case R.id.radioButtonActivity3:
                        activity = 2;
                        break;
                    default:
                        activity = 0;
                }
            }
        });

        radioGroup_respiration = (RadioGroup) findViewById(R.id.RG_respiration);

        radioGroup_respiration.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButtonRespiration1:
                        respiration = 0;
                        break;
                    case R.id.radioButtonRespiration2:
                        respiration = 1;
                        break;
                    case R.id.radioButtonRespiration3:
                        respiration = 2;
                        break;
                    default:
                        respiration = 0;
                }
            }
        });

        Button apgarButton = (Button) findViewById(R.id.buttonCalculateAPGAR);
        apgarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                apgar = appearance+pulse+grimace+activity+respiration;
                TextView resultAPGARText = (TextView) findViewById(R.id.textViewResultApgar);
                resultAPGARText.setText("APGAR-Score = "+apgar);
            }

        });

        FloatingActionButton fab = findViewById(R.id.fabAPGAR);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Apgar.this,Pop_Apgar.class));
            }
        });

    }

}




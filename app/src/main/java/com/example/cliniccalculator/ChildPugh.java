package com.example.cliniccalculator;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ChildPugh extends AppCompatActivity {

    int bilirubin,ascites,albumin,encephalopathy,inr, child_pugh = 1;
    RadioGroup radioGroup_bilirubin,radioGroup_ascites,radioGroup_albumin,radioGroup_encephalopathy,radioGroup_inr;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.child_pugh);

        radioGroup_bilirubin = (RadioGroup) findViewById(R.id.RG_bili);

        radioGroup_bilirubin.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButtonBili1:
                        bilirubin = 1;
                        break;
                    case R.id.radioButtonBili2:
                        bilirubin = 2;
                        break;
                    case R.id.radioButtonBili3:
                        bilirubin = 3;
                        break;
                }
            }
        });

        radioGroup_ascites = (RadioGroup) findViewById(R.id.RG_ascites);

        radioGroup_ascites.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButtonAscites1:
                        ascites = 1;
                        break;
                    case R.id.radioButtonAscites2:
                        ascites = 2;
                        break;
                    case R.id.radioButtonAscites3:
                        ascites = 3;
                        break;
                }
            }
        });

        radioGroup_albumin = (RadioGroup) findViewById(R.id.RG_albumin);

        radioGroup_albumin.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButtonAlbumin1:
                        albumin = 1;
                        break;
                    case R.id.radioButtonAlbumin2:
                        albumin = 2;
                        break;
                    case R.id.radioButtonAlbumin3:
                        albumin = 3;
                        break;
                }
            }
        });

        radioGroup_encephalopathy = (RadioGroup) findViewById(R.id.RG_encephalopathy);

        radioGroup_encephalopathy.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButtonEncephalopathy1:
                        encephalopathy = 1;
                        break;
                    case R.id.radioButtonEncephalopathy2:
                        encephalopathy = 2;
                        break;
                    case R.id.radioButtonEncephalopathy3:
                        encephalopathy = 3;
                        break;
                }
            }
        });

        radioGroup_inr = (RadioGroup) findViewById(R.id.RG_inr);

        radioGroup_inr.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButtonINR1:
                        inr = 1;
                        break;
                    case R.id.radioButtonINR2:
                        inr = 2;
                        break;
                    case R.id.radioButtonINR3:
                        inr = 3;
                        break;
                }
            }
        });

        Button cpButton = (Button) findViewById(R.id.buttonCalculateCP);
        cpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                child_pugh = bilirubin+ascites+albumin+encephalopathy+inr;
                TextView resultCPText = (TextView) findViewById(R.id.textViewResultCP);
                resultCPText.setText("Child Pugh = "+child_pugh);
            }

        });

        FloatingActionButton fab = findViewById(R.id.fabCP);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChildPugh.this,Pop_ChildPugh.class));
            }
        });

    }
}

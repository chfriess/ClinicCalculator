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

public class DIG extends AppCompatActivity {
    int thrombocytes,ddimers,fibrinogen,quick, dig = 0;
    RadioGroup radioGroup_thrombocytes,radioGroup_ddimers,radioGroup_fibrinogen,radioGroup_quick;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dig);

        radioGroup_thrombocytes = (RadioGroup) findViewById(R.id.radioGroup_thrombocytes);

        radioGroup_thrombocytes.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButtonThrombocytes1:
                        thrombocytes = 1;
                        break;
                    case R.id.radioButtonThrombocytes2:
                        thrombocytes = 2;
                        break;
                    case R.id.radioButtonThrombocytes3:
                        thrombocytes = 3;
                        break;
                    default:
                        thrombocytes = 0;
                }
            }
        });

        radioGroup_ddimers = (RadioGroup) findViewById(R.id.radioGroup_ddimers);

        radioGroup_ddimers.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButtonDDimers1:
                        ddimers = 1;
                        break;
                    case R.id.radioButtonDDimers2:
                        ddimers = 2;
                        break;
                    case R.id.radioButtonDDimers3:
                        ddimers = 3;
                        break;
                    default:
                        ddimers = 0;
                }
            }
        });

        radioGroup_fibrinogen = (RadioGroup) findViewById(R.id.radioGroup_fibrinogen);

        radioGroup_fibrinogen.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButtonFibrinogen1:
                        fibrinogen = 1;
                        break;
                    case R.id.radioButtonFibrinogen2:
                        fibrinogen= 2;
                        break;
                    default:
                        fibrinogen = 0;
                }
            }
        });

        radioGroup_quick = (RadioGroup) findViewById(R.id.radioGroup_quick);

        radioGroup_quick.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButtonQuick1:
                        quick = 1;
                        break;
                    case R.id.radioButtonQuick2:
                        quick = 2;
                        break;
                    case R.id.radioButtonQuick3:
                        quick = 3;
                        break;
                    default:
                        quick = 0;
                }
            }
        });

        Button digButton = (Button) findViewById(R.id.buttonCalculateDIG);
        digButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                dig = thrombocytes+ddimers+fibrinogen+quick;
                TextView resultDIGText = (TextView) findViewById(R.id.textViewResultDIG);
                resultDIGText.setText("DIC-Score = "+dig);
            }

        });

        FloatingActionButton fab = findViewById(R.id.fabDIG);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DIG.this,Pop_DIG.class));
            }
        });

    }
}

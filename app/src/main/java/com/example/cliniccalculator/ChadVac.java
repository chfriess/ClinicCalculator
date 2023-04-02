package com.example.cliniccalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ChadVac extends AppCompatActivity {
    boolean heart_insufficient = false;
    boolean diabetes_mellitus = false;
    boolean hypertonus_chadvac = false;
    boolean stroke_chadvac = false;
    boolean vascular_precondition = false;

    int age = 0;
    boolean sex = false;



    RadioGroup radioGroup;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chadvac);


        RadioGroup rg_gender = (RadioGroup) findViewById(R.id.radioGroupGender);

        rg_gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButtonMale:
                        sex = true;
                        break;
                    case R.id.radioButtonFemale:
                        sex = false;
                        break;
                }
            }
        });

        RadioGroup rg_age = (RadioGroup) findViewById(R.id.radioGroupAge);

        rg_age.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButtonSixty:
                        age = 1;
                        break;
                    case R.id.radioButtonSeventy:
                        age = 2;
                        break;
                }
            }
        });


        Button chadVacButton = (Button) findViewById(R.id.buttonCalculateChadVac);
        chadVacButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int chadvac = 0;
                if (heart_insufficient == true)
                    chadvac++;
                if (diabetes_mellitus == true)
                    chadvac++;
                if (hypertonus_chadvac == true)
                    chadvac++;
                if (stroke_chadvac == true)
                    chadvac++;
                if (vascular_precondition == true)
                    chadvac++;
                if (sex == true)
                    chadvac++;

                chadvac += age;

                TextView resultChadVacText = (TextView) findViewById(R.id.textViewChadVacResult);
                resultChadVacText.setText("CHAD2DS2VASc = "+chadvac);
            }

        });

        FloatingActionButton fab = findViewById(R.id.fabChadVac);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChadVac.this,Pop_ChadVac.class));
            }
        });

    }

    public void onHeartInsufficientClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.heart_insufficient = true;
        else
            this.heart_insufficient = false;
    }

    public void onDMClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.diabetes_mellitus = true;
        else
            this.diabetes_mellitus = false;
    }

    public void onhypertonusChadVacClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.hypertonus_chadvac = true;
        else
            this.hypertonus_chadvac = false;
    }

    public void onStrokeChadVacClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.stroke_chadvac = true;
        else
            this.stroke_chadvac = false;
    }

    public void onVascularPreconditionClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.vascular_precondition = true;
        else
            this.vascular_precondition = false;
    }


}

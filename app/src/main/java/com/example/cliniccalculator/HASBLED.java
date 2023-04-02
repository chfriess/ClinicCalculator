package com.example.cliniccalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class HASBLED extends AppCompatActivity {
    boolean hypertonus = false;
    boolean stroke = false;
    boolean age_hasbled = false;
    boolean kidney = false;
    boolean bleeder = false;
    boolean drugs = false;
    boolean SIRS_hasbled = false;
    boolean labile_INR = false;
    boolean alcohol = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasbled);

        Button bisapButton = (Button) findViewById(R.id.buttonCalculateHASBLED);
        bisapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int hasbled = 0;
                if (hypertonus == true)
                    hasbled++;
                if (stroke == true)
                    hasbled++;
                if (age_hasbled == true)
                    hasbled++;
                if (kidney == true)
                    hasbled++;
                if (bleeder == true)
                    hasbled++;
                if (drugs == true)
                    hasbled++;
                if (SIRS_hasbled == true)
                    hasbled++;
                if (labile_INR == true)
                    hasbled++;
                if (alcohol == true)
                    hasbled++;


                TextView resultBISAPText = (TextView) findViewById(R.id.textViewHasbledResult);
                resultBISAPText.setText("HASBLED = "+hasbled);
            }

        });

        FloatingActionButton fab = findViewById(R.id.fabHASBLED);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HASBLED.this,Pop_HASBLED.class));
            }
        });

    }

    public void onHypertonusClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.hypertonus = true;
        else
            this.hypertonus = false;
    }

    public void onStrokeClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.stroke = true;
        else
            this.stroke = false;
    }

    public void onAgeHASBLEDClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.age_hasbled = true;
        else
            this.age_hasbled = false;
    }

    public void onKidneyClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.kidney = true;
        else
            this.kidney = false;
    }

    public void onBleederClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.bleeder = true;
        else
            this.bleeder = false;
    }

    public void onDrugsClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.drugs = true;
        else
            this.drugs = false;
    }

    public void onSIRSHASBLEDClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.SIRS_hasbled = true;
        else
            this.SIRS_hasbled = false;
    }

    public void onINRClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.labile_INR = true;
        else
            this.labile_INR = false;
    }

    public void onAlcoholClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.alcohol = true;
        else
            this.alcohol = false;
    }


}

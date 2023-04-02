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

public class Curb65 extends AppCompatActivity {
    boolean confusion_curb = false;
    boolean age_curb = false;
    boolean respiratory_frequency = false;
    boolean BP_curb = false;
    boolean urea = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.curb);

        Button curb65Button = (Button) findViewById(R.id.buttonCalculateCURB65);
        curb65Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int curb65 = 0;
                if (confusion_curb == true)
                    curb65++;
                if (age_curb == true)
                    curb65++;
                if (respiratory_frequency == true)
                    curb65++;
                if (BP_curb == true)
                    curb65++;
                if (urea == true)
                    curb65++;


                TextView resultCURB65Text = (TextView) findViewById(R.id.textViewCurb65);
                resultCURB65Text.setText("CURB65 = "+curb65);
            }

        });

        FloatingActionButton fab = findViewById(R.id.fabCurb65);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Curb65.this,Pop_Curb.class));
            }
        });

    }

    public void onConfusionCurbClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.confusion_curb = true;
        else
            this.confusion_curb = false;
    }

    public void onAgeCurbClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.age_curb = true;
        else
            this.age_curb = false;
    }

    public void onRespiratoryFrequencyClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.respiratory_frequency = true;
        else
            this.respiratory_frequency = false;
    }

    public void onBPCurbClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.BP_curb = true;
        else
            this.BP_curb = false;
    }

    public void onUreaClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.urea = true;
        else
            this.urea = false;
    }




}

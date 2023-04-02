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

public class BISAP extends AppCompatActivity {
    boolean BUN = false;
    boolean age = false;
    boolean mental = false;
    boolean pleura = false;
    boolean SIRS = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bisap);

        Button bisapButton = (Button) findViewById(R.id.buttonCalculateBISAP);
        bisapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int bisap = 0;
                if (BUN == true)
                    bisap++;
                if (age == true)
                    bisap++;
                if (mental == true)
                    bisap++;
                if (pleura == true)
                    bisap++;
                if (SIRS == true)
                    bisap++;


                TextView resultBISAPText = (TextView) findViewById(R.id.textViewBISAPResult);
                resultBISAPText.setText("BISAP = "+bisap);
            }

        });

        FloatingActionButton fab = findViewById(R.id.fabBISAP);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BISAP.this, Pop_Bisap.class));
            }
        });

    }

    public void onBUNClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.BUN = true;
        else
            this.BUN = false;
    }

    public void onAgeBISAPClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.age = true;
        else
            this.age = false;
    }

    public void onMentalClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.mental = true;
        else
            this.mental = false;
    }

    public void onSIRSClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.SIRS = true;
        else
            this.SIRS = false;
    }

    public void onPleuraClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.pleura = true;
        else
            this.pleura = false;
    }
}

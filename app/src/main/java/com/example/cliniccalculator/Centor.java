package com.example.cliniccalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Centor extends AppCompatActivity {
    boolean body_temperature, tonsiles, coughing, lymphnodes_centor;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.centor);

        Button centorButton = (Button) findViewById(R.id.buttonCalculateCENTOR);
        centorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int centor = 0;
                if (body_temperature == true)
                    centor++;
                if (tonsiles == true)
                    centor++;
                if (coughing == true)
                    centor++;
                if (lymphnodes_centor == true)
                    centor++;


                TextView resultCENTORText = (TextView) findViewById(R.id.textViewCENTORResult);
                resultCENTORText.setText("CENTOR = "+centor);
            }

        });

        FloatingActionButton fab = findViewById(R.id.fabCENTOR);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Centor.this,Pop_Centor.class));
            }
        });

    }

    public void onTemperatureClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.body_temperature = true;
        else
            this.body_temperature = false;
    }

    public void onTonsilesClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.tonsiles = true;
        else
            this.tonsiles = false;
    }

    public void onCoughClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.coughing = false;
        else
            this.coughing = true;
    }

    public void onLNCentorClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.lymphnodes_centor = true;
        else
            this.lymphnodes_centor = false;
    }



}

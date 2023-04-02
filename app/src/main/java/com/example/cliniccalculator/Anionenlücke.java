package com.example.cliniccalculator;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Anionenlücke extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anionenluecke);



        Button bmiButton = (Button) findViewById(R.id.buttonCalculateBMI);
        bmiButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText cNaText = (EditText) findViewById(R.id.enterAge);
                EditText cKText = (EditText) findViewById(R.id.enterWeight);
                EditText cClText = (EditText) findViewById(R.id.enterCreatinin);
                EditText cCO3Text = (EditText) findViewById(R.id.entercCO3);

                double cNa = 0;
                double cK = -1;
                double cCl = 0;
                double cCO3 = 0;
                double anionenluecke = 0;



                try {
                    cNa = Double.parseDouble(cNaText.getText().toString());
                    cK = Double.parseDouble(cKText.getText().toString());
                    cCl = Double.parseDouble(cClText.getText().toString());
                    cCO3 = Double.parseDouble(cCO3Text.getText().toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                if (cK == -1){
                    anionenluecke = cNa - (cCl+cCO3);
                } else {
                    anionenluecke = cNa+cK - (cCl+cCO3);
                }

                TextView resultAnionenlueckeText = (TextView) findViewById(R.id.textViewAnionenluecke);
                resultAnionenlueckeText.setText("anion gap = " + anionenluecke + "mmol/l");



            }
        });

        FloatingActionButton fab = findViewById(R.id.fabAnionenluecke);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Anionenlücke.this,Pop_Anionenlücke.class));
            }
        });

    }

}

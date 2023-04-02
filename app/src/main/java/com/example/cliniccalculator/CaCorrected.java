package com.example.cliniccalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CaCorrected extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ca_corrected);

        Button caButton = (Button) findViewById(R.id.buttonCalculateCa);
        caButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText caText = (EditText) findViewById(R.id.enterCaSerum);
                EditText albText = (EditText) findViewById(R.id.enterAlbuminSerum);
                TextView resultCaText = (TextView) findViewById(R.id.textViewResultCa);

                double ca = 0;
                double albumin = 0;
                try {
                    ca = Double.parseDouble(caText.getText().toString());
                    albumin = Double.parseDouble(albText.getText().toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                double ca_corr = ca - (00.25 * albumin) + 1;

                resultCaText.setText("Ca corrected = " + ca_corr + "[mmol/l]");



            }
        });

        FloatingActionButton fab = findViewById(R.id.fabCaCorr);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CaCorrected.this,Pop_CaCorr.class));
            }
        });

    }

}

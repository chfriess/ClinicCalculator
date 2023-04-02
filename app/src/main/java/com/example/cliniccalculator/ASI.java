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

public class ASI extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asi);

        Button asiButton = (Button) findViewById(R.id.buttonCalculateASI);
        asiButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText CSFspezText = (EditText) findViewById(R.id.enterCSFspez);
                EditText CSFges = (EditText) findViewById(R.id.enterCSFges);
                EditText Plasmaspez = (EditText) findViewById(R.id.enterPlasmaSpez);
                EditText Plasmages = (EditText) findViewById(R.id.enterPlasmaGes);


                TextView resultASIText = (TextView) findViewById(R.id.textViewResultASI);

                double csf_spez = 0;
                double csf_ges = 0;
                double plasma_spez = 0;
                double plasma_ges = 0;


                try {
                    csf_spez = Double.parseDouble(CSFspezText.getText().toString());
                    csf_ges = Double.parseDouble(CSFges.getText().toString());
                    plasma_spez = Double.parseDouble(Plasmaspez.getText().toString());
                    plasma_ges = Double.parseDouble(Plasmages.getText().toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                double asi = (csf_spez/plasma_spez)/(csf_ges/plasma_ges);
                asi = (Math.floor(asi*10))/10;

                resultASIText.setText("ASI = " + asi);



            }
        });

        FloatingActionButton fab = findViewById(R.id.fabASI);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ASI.this,Pop_Asi.class));
            }
        });

    }
}

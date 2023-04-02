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

public class Wells extends AppCompatActivity {
    boolean tvt = false;
    boolean immobilization = false;
    boolean malignom = false;
    boolean lung_emboly = false;
    boolean heart_rate = false;
    boolean hemoptysis = false;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wells);

        Button wellsButton = (Button) findViewById(R.id.buttonCalculateWells);
        wellsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wells = 0;
                if (tvt == true)
                    wells++;
                if (immobilization == true)
                    wells++;
                if (malignom == true)
                    wells++;
                if (lung_emboly == true)
                    wells++;
                if (heart_rate == true)
                    wells++;
                if (hemoptysis == true)
                    wells++;



                TextView resultWellsText = (TextView) findViewById(R.id.textViewWellsResult);
                resultWellsText.setText("Wells-Score = "+wells);
            }

        });

        FloatingActionButton fab = findViewById(R.id.fabWells);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Wells.this,Pop_Wells.class));
            }
        });

    }

    public void onTVTClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.tvt = true;
        else
            this.tvt = false;
    }

    public void onImmobilizationClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.immobilization = true;
        else
            this.immobilization = false;
    }

    public void onMalignomClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.malignom = true;
        else
            this.malignom = false;
    }

    public void onLungEmbolyClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.lung_emboly = true;
        else
            this.lung_emboly = false;
    }

    public void onHRClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.heart_rate = true;
        else
            this.heart_rate = false;
    }

    public void onHemoptysisClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.hemoptysis = true;
        else
            this.hemoptysis = false;
    }


}

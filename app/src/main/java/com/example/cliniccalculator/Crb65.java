package com.example.cliniccalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Crb65 extends AppCompatActivity {
    boolean confusion = false;
    boolean age = false;
    boolean LN = false;
    boolean BP = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crb65);

        Button crb65Button = (Button) findViewById(R.id.buttonCalculateCRB65);
        crb65Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int crb65 = 0;
                if (confusion == true)
                    crb65++;
                if (age == true)
                    crb65++;
                if (LN == true)
                    crb65++;
                if (BP == true)
                    crb65++;


            TextView resultCRB65Text = (TextView) findViewById(R.id.textViewCRB65);
            resultCRB65Text.setText("CRB65 = "+crb65);



            }

        });

        FloatingActionButton fab = findViewById(R.id.fabCrb65);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Crb65.this,Pop_Crb65.class));
            }
        });

    }

    public void onConfusionClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

            if (checked)
                this.confusion = true;
            else
                this.confusion = false;
    }

    public void onAgeClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.age = true;
        else
            this.age = false;
    }

    public void onLNClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.LN = true;
        else
            this.LN = false;
    }

    public void onBPClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.BP = true;
        else
            this.BP = false;
    }


}

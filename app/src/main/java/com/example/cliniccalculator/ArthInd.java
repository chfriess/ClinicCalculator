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

public class ArthInd extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arthind);

        Button aiButton = (Button) findViewById(R.id.buttonCalculateAI);
        aiButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText ldlText = (EditText) findViewById(R.id.enterLDL);
                EditText hdlText = (EditText) findViewById(R.id.enterHDL);
                TextView resultAIText = (TextView) findViewById(R.id.resultAIText);

                double ldl = 0;
                double hdl = 0;
                try {
                    ldl = Double.parseDouble(ldlText.getText().toString());
                    hdl = Double.parseDouble(hdlText.getText().toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                double ai = Math.log(ldl/hdl);
                ai = (Math.floor(ai*10))/10;

                resultAIText.setText("Artherogenic Index = " + ai);



            }
        });

        FloatingActionButton fab = findViewById(R.id.fabArthInd);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ArthInd.this,Pop_ArthInd.class));
            }
        });

    }

}

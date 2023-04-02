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

public class QTtime extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qt_time);

        Button qtButton = (Button) findViewById(R.id.buttonCalculateQT);
        qtButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText qtText = (EditText) findViewById(R.id.enterQT);
                EditText hrText = (EditText) findViewById(R.id.enterHR);
                TextView resultQTText = (TextView) findViewById(R.id.resultQTText);

                double qt = 0;
                double hr = 0;
                try {
                    qt = Double.parseDouble(qtText.getText().toString());
                    hr = Double.parseDouble(hrText.getText().toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                double qt_corr = qt/Math.sqrt(60/hr);
                qt_corr = Math.round(qt_corr*10)/10;

                resultQTText.setText("QT corrected = " + qt_corr + " ms");

            }
        });

        FloatingActionButton fab = findViewById(R.id.fabQT);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QTtime.this,Pop_QT.class));
            }
        });

    }
}

package com.example.cliniccalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.security.KeyRep;

public class APACHEII extends AppCompatActivity {

    Spinner spinner_temperature, spinner_arterial, spinner_heart_rate, spinner_respiratory_frequency, spinner_oxygenation, spinner_pH, spinner_Na,
            spinner_K, spinner_Kreatinin, spinner_Hematocrit, spinner_Leucocytes, spinner_GCS, spinner_Age, spinner_Aufnahmegrund;
    RadioGroup radioGroup_surgery, radioGroup_health;
    int surgery,temperature, arterial_pressure, heart_rate_apache, respiratory_frequency_apache, oxygenation, pH, Na, K, creatinin,
            hematocrit_apache, leucocytes, gcs, age_apache, emergency, chronic_health_score, apache_score =0;
    double pValue = 1.0;
    boolean health_checkbox;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apacheii);

        spinner_temperature = (Spinner)findViewById(R.id.spinnerRectalTemperature);
        ArrayAdapter<CharSequence> adapter_temperature = ArrayAdapter.createFromResource(this,
                R.array.temperature_rectal,
                android.R.layout.simple_spinner_item);
        adapter_temperature.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_temperature.setAdapter(adapter_temperature);
        spinner_temperature.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        temperature = 4;
                        break;
                    case 1:
                        temperature = 3;
                        break;
                    case 2:
                        temperature = 1;
                        break;
                    case 3:
                        temperature = 0;
                        break;
                    case 4:
                        temperature = 1;
                        break;
                    case 5:
                        temperature = 2;
                        break;
                    case 6:
                        temperature = 3;
                        break;
                    case 7:
                        temperature = 4;
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner_heart_rate = (Spinner)findViewById(R.id.spinnerHeartRate);
        ArrayAdapter<CharSequence> adapter_heart_rate = ArrayAdapter.createFromResource(this,
                R.array.heart_rate,
                android.R.layout.simple_spinner_item);
        adapter_temperature.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_heart_rate.setAdapter(adapter_heart_rate);
        spinner_heart_rate.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        heart_rate_apache = 4;
                        break;
                    case 1:
                        heart_rate_apache = 3;
                        break;
                    case 2:
                        heart_rate_apache = 2;
                        break;
                    case 3:
                        heart_rate_apache = 0;
                        break;
                    case 4:
                        heart_rate_apache = 2;
                        break;
                    case 5:
                        heart_rate_apache = 3;
                        break;
                    case 6:
                        heart_rate_apache = 4;
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner_arterial = (Spinner)findViewById(R.id.spinnerArterial);
        ArrayAdapter<CharSequence> adapter_arterial = ArrayAdapter.createFromResource(this,
                R.array.arterial_mp,
                android.R.layout.simple_spinner_item);
        adapter_arterial.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_arterial.setAdapter(adapter_arterial);
        spinner_arterial.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        arterial_pressure = 4;
                        break;
                    case 1:
                        arterial_pressure = 3;
                        break;
                    case 2:
                        arterial_pressure = 2;
                        break;
                    case 3:
                        arterial_pressure = 0;
                        break;
                    case 4:
                        arterial_pressure = 2;
                        break;
                    case 5:
                        arterial_pressure = 4;
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner_respiratory_frequency = (Spinner)findViewById(R.id.spinnerRespiratoryFrequency);
        ArrayAdapter<CharSequence> adapter_respiratory_frequency = ArrayAdapter.createFromResource(this,
                R.array.respiratory_frequency_apache,
                android.R.layout.simple_spinner_item);
        adapter_respiratory_frequency.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_respiratory_frequency.setAdapter(adapter_respiratory_frequency);
        spinner_respiratory_frequency.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        respiratory_frequency_apache = 4;
                        break;
                    case 1:
                        respiratory_frequency_apache = 3;
                        break;
                    case 2:
                        respiratory_frequency_apache = 1;
                        break;
                    case 3:
                        respiratory_frequency_apache = 0;
                        break;
                    case 4:
                        respiratory_frequency_apache = 1;
                        break;
                    case 5:
                        respiratory_frequency_apache = 2;
                        break;
                    case 6:
                        respiratory_frequency_apache = 4;
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner_oxygenation = (Spinner)findViewById(R.id.spinnerOxygenation);
        ArrayAdapter<CharSequence> adapter_oxygenation = ArrayAdapter.createFromResource(this,
                R.array.oxygenation,
                android.R.layout.simple_spinner_item);
        adapter_oxygenation.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_oxygenation.setAdapter(adapter_oxygenation);
        spinner_oxygenation.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        oxygenation = 4;
                        break;
                    case 1:
                        oxygenation = 3;
                        break;
                    case 2:
                        oxygenation  = 2;
                        break;
                    case 3:
                        oxygenation = 0;
                        break;
                    case 4:
                        oxygenation = 1;
                        break;
                    case 5:
                        oxygenation  = 3;
                        break;
                    case 6:
                        oxygenation  = 4;
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner_pH = (Spinner)findViewById(R.id.spinnerPH);
        ArrayAdapter<CharSequence> adapter_pH = ArrayAdapter.createFromResource(this,
                R.array.pH,
                android.R.layout.simple_spinner_item);
        adapter_pH.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_pH.setAdapter(adapter_pH);
        spinner_pH.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        pH = 4;
                        break;
                    case 1:
                        pH = 3;
                        break;
                    case 2:
                        pH = 1;
                        break;
                    case 3:
                        pH = 0;
                        break;
                    case 4:
                        pH = 2;
                        break;
                    case 5:
                        pH = 3;
                        break;
                    case 6:
                        pH = 4;
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner_Na = (Spinner)findViewById(R.id.spinnerNa);
        ArrayAdapter<CharSequence> adapter_Na = ArrayAdapter.createFromResource(this,
                R.array.Na,
                android.R.layout.simple_spinner_item);
        adapter_Na.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_Na.setAdapter(adapter_Na);
        spinner_Na.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Na = 4;
                        break;
                    case 1:
                        Na = 3;
                        break;
                    case 2:
                        Na = 2;
                        break;
                    case 3:
                        Na = 1;
                        break;
                    case 4:
                        Na = 0;
                        break;
                    case 5:
                        Na = 2;
                        break;
                    case 6:
                        Na = 3;
                        break;
                    case 7:
                        Na = 4;
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner_K = (Spinner)findViewById(R.id.spinnerK);
        ArrayAdapter<CharSequence> adapter_K = ArrayAdapter.createFromResource(this,
                R.array.K,
                android.R.layout.simple_spinner_item);
        adapter_K.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_K.setAdapter(adapter_K);
        spinner_K.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        K = 4;
                        break;
                    case 1:
                        K = 3;
                        break;
                    case 2:
                        K = 1;
                        break;
                    case 3:
                        K = 0;
                        break;
                    case 4:
                        K = 1;
                        break;
                    case 5:
                        K = 2;
                        break;
                    case 6:
                        K = 4;
                        break;

                }
            }



            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner_Kreatinin = (Spinner)findViewById(R.id.spinnerKreatinin);
        ArrayAdapter<CharSequence> adapter_Kreatinin = ArrayAdapter.createFromResource(this,
                R.array.Kreatinin,
                android.R.layout.simple_spinner_item);
        adapter_Kreatinin.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_Kreatinin.setAdapter(adapter_Kreatinin);
        spinner_Kreatinin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        creatinin = 4;
                        break;
                    case 1:
                        creatinin = 3;
                        break;
                    case 2:
                        creatinin = 2;
                        break;
                    case 3:
                        creatinin = 0;
                        break;
                    case 4:
                        creatinin = 2;
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner_Hematocrit = (Spinner)findViewById(R.id.spinnerHematokrit);
        ArrayAdapter<CharSequence> adapter_Hematocrit = ArrayAdapter.createFromResource(this,
                R.array.Hematocrit,
                android.R.layout.simple_spinner_item);
        adapter_Hematocrit.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_Hematocrit.setAdapter(adapter_Hematocrit);
        spinner_Hematocrit.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        hematocrit_apache = 4;
                        break;
                    case 1:
                        hematocrit_apache = 2;
                        break;
                    case 2:
                        hematocrit_apache = 1;
                        break;
                    case 3:
                        hematocrit_apache = 0;
                        break;
                    case 4:
                        hematocrit_apache = 2;
                        break;
                    case 5:
                        hematocrit_apache = 4;
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner_Leucocytes = (Spinner)findViewById(R.id.spinnerLeucocytes);
        ArrayAdapter<CharSequence> adapter_Leucocytes = ArrayAdapter.createFromResource(this,
                R.array.Leucocytes,
                android.R.layout.simple_spinner_item);
        adapter_Leucocytes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_Leucocytes.setAdapter(adapter_Leucocytes);
        spinner_Leucocytes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        leucocytes = 4;
                        break;
                    case 1:
                        leucocytes = 2;
                        break;
                    case 2:
                        leucocytes = 1;
                        break;
                    case 3:
                        leucocytes = 0;
                        break;
                    case 4:
                        leucocytes = 2;
                        break;
                    case 5:
                        leucocytes = 4;
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner_GCS = (Spinner)findViewById(R.id.spinnerGCS);
        ArrayAdapter<CharSequence> adapter_GCS = ArrayAdapter.createFromResource(this,
                R.array.GCS,
                android.R.layout.simple_spinner_item);
        adapter_GCS.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_GCS.setAdapter(adapter_GCS);
        spinner_GCS.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gcs = 15 - position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner_Age = (Spinner)findViewById(R.id.spinnerLeucocytes);
        ArrayAdapter<CharSequence> adapter_Age = ArrayAdapter.createFromResource(this,
                R.array.Age,
                android.R.layout.simple_spinner_item);
        adapter_Age.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_Age.setAdapter(adapter_Age);
        spinner_Age.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        age_apache = 6;
                        break;
                    case 1:
                        age_apache = 5;
                        break;
                    case 2:
                        age_apache = 3;
                        break;
                    case 3:
                        age_apache = 2;
                        break;
                    case 4:
                        age_apache = 0;
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        radioGroup_surgery = (RadioGroup) findViewById(R.id.RG_surgery);

        radioGroup_surgery.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButtonAppearance1:
                        surgery = 0;
                        break;
                    case R.id.radioButtonAppearance2:
                        surgery = 1;
                        break;
                    case R.id.radioButtonAppearance3:
                        surgery = 2;
                        break;
                    default:
                        surgery = 0;
                }
            }
        });




        final Button apacheButton = (Button) findViewById(R.id.buttonCalculateAPACHEII);
        apacheButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                TextView resultAPACHEIIText = (TextView) findViewById(R.id.textViewResultAPACHEII);
                TextView resultAPACHEIIText_pValue = (TextView) findViewById(R.id.textViewResultAPACHEII2_pvalue);

                if (health_checkbox){
                    if(surgery == 0 || surgery == 1)
                        chronic_health_score = 5;
                    else
                        chronic_health_score = 2;
                } else {
                    chronic_health_score = 0;
                }

                if (surgery ==1)
                    emergency = 1;
                else
                    emergency = 0;

                apache_score = surgery + temperature + arterial_pressure + heart_rate_apache + respiratory_frequency_apache + oxygenation + pH + Na + K + creatinin +
                        hematocrit_apache + leucocytes +  gcs + age_apache + chronic_health_score;

                pValue = 1/(1+Math.pow(Math.E,-3.517) + (apache_score*0.146)+(emergency*0.603));
                pValue = (Math.floor(pValue*1000))/1000;


                resultAPACHEIIText.setText("APACHEII = "+apache_score);
                resultAPACHEIIText_pValue.setText("p-Value = "+pValue);
            }
        });

        FloatingActionButton fab = findViewById(R.id.fabAPACHEII);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(APACHEII.this,Pop_Apacheii.class));
            }
        });

    }



    public void onHealthApacheClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            this.health_checkbox = true;
        else
            this.health_checkbox = false;
    }





}

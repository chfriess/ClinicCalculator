package com.example.cliniccalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        Button apacheII = (Button) findViewById(R.id.goToAPACHE);
        apacheII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAPACHEII();
            }
        });

        Button anionGap = (Button) findViewById(R.id.goToAnionGap);
        anionGap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnionGap();
            }
        });

        Button apgar = (Button) findViewById(R.id.goToApgar);
        apgar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openApgar();
            }
        });

        Button arthInd = (Button) findViewById(R.id.goToAI);
        arthInd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAI();
            }
        });

        Button asiInd = (Button) findViewById(R.id.goToASI);
        asiInd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openASI();
            }
        });

        Button bisap = (Button) findViewById(R.id.goToBISAP);
        bisap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBISAP();
            }
        });

        Button bmi = (Button) findViewById(R.id.goToBMI);
        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBMI();
            }
        });

        Button ca_corrected = (Button) findViewById(R.id.goToCaCorrected);
        ca_corrected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCaCorrected();
            }
        });

        Button centor = (Button) findViewById(R.id.goToCENTOR);
        centor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCentor();
            }
        });

        Button chadvac = (Button) findViewById(R.id.goToChadVac);
        chadvac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChadVac();
            }
        });

        Button child_pugh = (Button) findViewById(R.id.goToCP);
        child_pugh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChildPugh();
            }
        });

        Button crb65 = (Button) findViewById(R.id.goToCRB65);
        crb65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCRB65();
            }
        });

        Button curb65 = (Button) findViewById(R.id.goToCURB65);
        curb65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCURB65();
            }
        });

        Button dig = (Button) findViewById(R.id.goToDIG);
        dig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDIG();
            }
        });

        Button friedewald = (Button) findViewById(R.id.goToFriedewald);
        friedewald.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFriedwald();
            }
        });

        Button gfr = (Button) findViewById(R.id.goToGFR);
        gfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGFR();
            }
        });

        Button gfr2 = (Button) findViewById(R.id.goToGFR2);
        gfr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGFRII();
            }
        });

        Button gfr3 = (Button) findViewById(R.id.goToGFR3);
        gfr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGFRIII();
            }
        });

        Button gfr4 = (Button) findViewById(R.id.goToGFR4);
        gfr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGFRIV();
            }
        });

        Button hasbled = (Button) findViewById(R.id.goToHASBLED);
        hasbled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHASBLED();
            }
        });

        Button qt = (Button) findViewById(R.id.goToQT);
        qt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQT();
            }
        });

        Button wells = (Button) findViewById(R.id.goToWells);
        wells.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWells();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void openAPACHEII(){
        Intent intent = new Intent(this, APACHEII.class);
        startActivity(intent);
    }

    public void openAnionGap(){
        Intent intent = new Intent(this, Anionenlücke.class);
        startActivity(intent);
    }

    public void openApgar(){
        Intent intent = new Intent(this, Apgar.class);
        startActivity(intent);
    }

    public void openAI(){
        Intent intent = new Intent(this, ArthInd.class);
        startActivity(intent);
    }

    public void openASI(){
        Intent intent = new Intent(this, ASI.class);
        startActivity(intent);
    }

    public void openBISAP(){
        Intent intent = new Intent(this, BISAP.class);
        startActivity(intent);
    }

    public void openBMI(){
        Intent intent = new Intent(this, BMI.class);
        startActivity(intent);
    }

    public void openCaCorrected(){
        Intent intent = new Intent(this, CaCorrected.class);
        startActivity(intent);
    }

    public void openCentor(){
        Intent intent = new Intent(this, Centor.class);
        startActivity(intent);
    }

    public void openChadVac(){
        Intent intent = new Intent(this, ChadVac.class);
        startActivity(intent);
    }

    public void openChildPugh(){
        Intent intent = new Intent(this, ChildPugh.class);
        startActivity(intent);
    }

    public void openCRB65(){
        Intent intent = new Intent(this, Crb65.class);
        startActivity(intent);
    }

    public void openCURB65(){
        Intent intent = new Intent(this, Curb65.class);
        startActivity(intent);
    }

    public void openDIG(){
        Intent intent = new Intent(this, DIG.class);
        startActivity(intent);
    }


    public void openFriedwald(){
        Intent intent = new Intent(this, Friedewald.class);
        startActivity(intent);
    }

    public void openGFR(){
        Intent intent = new Intent(this, GFR.class);
        startActivity(intent);
    }

    public void openGFRII(){
        Intent intent = new Intent(this, GFRII.class);
        startActivity(intent);
    }

    public void openGFRIII(){
        Intent intent = new Intent(this, GFRIII.class);
        startActivity(intent);
    }

    public void openGFRIV(){
        Intent intent = new Intent(this, GFRIV.class);
        startActivity(intent);
    }

    public void openHASBLED(){
        Intent intent = new Intent(this, HASBLED.class);
        startActivity(intent);
    }

    public void openQT(){
        Intent intent = new Intent(this, QTtime.class);
        startActivity(intent);
    }

    public void openWells(){
        Intent intent = new Intent(this, Wells.class);
        startActivity(intent);
    }

}

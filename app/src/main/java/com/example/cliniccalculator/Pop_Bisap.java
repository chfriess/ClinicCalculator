package com.example.cliniccalculator;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class Pop_Bisap extends Activity {

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pop_bisap);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;
        width *= 0.8;
        height *= 0.5;

        getWindow().setLayout(width ,height);


    }

}

package com.example.alex.androidproject;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Alex on 12/11/2014.
 */
public class Chicken extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chicken);

        getActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

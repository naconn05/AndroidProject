package com.example.alex.androidproject;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Alex on 12/2/2014.
 */
public class Sheep extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sheep);

        getActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

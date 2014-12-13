package com.example.alex.notoldmcdonaldsfarm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Alex on 11/28/2014.
 */
public class AnimalDetail extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animal_info);
        Intent intent = getIntent();
    }
}

package com.example.alex.notoldmcdonaldsfarm;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Alex on 11/24/2014.
 */
public class AnimalInfo extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.animal_info, container, false);
    }
}

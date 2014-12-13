package com.example.alex.inclass;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Alex on 12/8/2014.
 */
public class AnimalInfo extends Activity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.animalinfo);
        /*textView = (TextView)findViewById(textView.getId());
        Intent iin= getIntent();
        Bundle b = iin.getExtras();

        if(b!=null)
        {
            String j =(String) b.get("name");
            textView.setText(j);
        }
    }*/
    }
}
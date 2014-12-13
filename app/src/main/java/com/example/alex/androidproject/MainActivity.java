package com.example.alex.androidproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;


public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(MainActivity.this, Cow.class));
                    Intent intent = new Intent(MainActivity.this, Cow.class);
                    startActivity(intent);
                }else if(position == 1){
                    startActivity(new Intent(MainActivity.this, Chicken.class));
                    Intent intent = new Intent(MainActivity.this, Chicken.class);
                    startActivity(intent);
                }   if (position == 2) {
                    startActivity(new Intent(MainActivity.this, Horse.class));
                    Intent intent = new Intent(MainActivity.this, Horse.class);
                    startActivity(intent);
                }else if(position == 3){
                    startActivity(new Intent(MainActivity.this, Goat.class));
                    Intent intent = new Intent(MainActivity.this, Goat.class);
                    startActivity(intent);
                }   if (position == 4) {
                    startActivity(new Intent(MainActivity.this, Dog.class));
                    Intent intent = new Intent(MainActivity.this, Dog.class);
                    startActivity(intent);
                }else if(position == 5){
                    startActivity(new Intent(MainActivity.this, Duck.class));
                    Intent intent = new Intent(MainActivity.this, Duck.class);
                    startActivity(intent);
                }   if (position == 6) {
                    startActivity(new Intent(MainActivity.this, Sheep.class));
                    Intent intent = new Intent(MainActivity.this, Sheep.class);
                    startActivity(intent);
                }else if(position == 7){
                    startActivity(new Intent(MainActivity.this, Turkey.class));
                    Intent intent = new Intent(MainActivity.this, Turkey.class);
                    startActivity(intent);
                }
                //Toast.makeText(MainActivity.this, "" + position, Toast.LENGTH_SHORT).show();
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
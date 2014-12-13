package com.example.alex.inclass;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;


public class MyActivity extends Activity {

    public static final String ID = "ANIMAL_ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
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

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment implements View.OnClickListener {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_my, container, false);

            ImageView imageViewDuck = (ImageView) rootView.findViewById(R.id.DuckImage);
            imageViewDuck.setOnClickListener(this);

            ImageView imageViewChicken = (ImageView) rootView.findViewById(R.id.ChickenImage);
            imageViewChicken.setOnClickListener(this);

            ImageView imageViewCow = (ImageView) rootView.findViewById(R.id.CowImage);
            imageViewCow.setOnClickListener(this);

            ImageView imageViewDog = (ImageView) rootView.findViewById(R.id.DogImage);
            imageViewDog.setOnClickListener(this);

            return rootView;
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getActivity(), AnimalInfo.class);
            intent.putExtra(ID,v.getId());
            startActivity(intent);

            Toast toast = Toast.makeText(getActivity(), "You Clicked" + v.getId(), Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}

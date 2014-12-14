package com.example.alex.androidproject;

import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Alex on 12/11/2014.
 */
public class Goat extends Activity {
    private SoundPool soundPool;
    private int soundID;
    private int soundPro;
    boolean plays = false, loaded = false;
    float actVolume, maxVolume, volume;
    AudioManager audioManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goat);
        audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
        actVolume = (float) audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        maxVolume = (float) audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        volume = actVolume / maxVolume;

        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);



        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
        soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
                loaded = true;
            }
        });
        soundID = soundPool.load(this, R.raw.goat, 1);
        soundPro = soundPool.load(this, R.raw.goat01,1);


        getActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void playSound(View v) {
        // Is the sound loaded does it already play?
        if (loaded) {
            soundPool.play(soundID, volume, volume, 1, 0, 1f);

        }
    }
    public void playPro(View v) {
        // Is the sound loaded does it already play?
        if (loaded) {
            soundPool.play(soundPro, volume, volume, 1, 0, 1f);

        }
    }
}


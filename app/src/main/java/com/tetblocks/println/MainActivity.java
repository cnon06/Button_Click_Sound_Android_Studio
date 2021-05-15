package com.tetblocks.println;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity   extends Activity

{

    MediaPlayer mp;

    public void print(View v)
    {
        mp = MediaPlayer.create(this, R.raw.beep);
        mp.start();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // MediaPlayer mp = MediaPlayer.create(this, R.raw.beep);




    }
}
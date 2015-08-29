package com.example.android.HandCricket;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;


public class PlayTossActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playtossactivity);

        new Handler().postDelayed(new Runnable(){

            @Override
            public void run(){

                Intent i=new Intent(PlayTossActivity.this,TossActivity.class);
                startActivity(i);
                finish();
            }
        },7*100);
    }
}


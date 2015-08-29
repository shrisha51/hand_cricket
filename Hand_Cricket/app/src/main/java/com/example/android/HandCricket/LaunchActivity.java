package com.example.android.HandCricket;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;


public class LaunchActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launchactivity);
        new Handler().postDelayed(new Runnable(){

            @Override
            public void run(){

                Intent i=new Intent(LaunchActivity.this,LaunchNextActivity.class);
                startActivity(i);
                finish();
            }
        },15*100);
    }
}


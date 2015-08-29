package com.example.android.HandCricket;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;


public class LaunchNextActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launchnextactivity);


        new Handler().postDelayed(new Runnable(){

            @Override
            public void run(){

                Intent i=new Intent(LaunchNextActivity.this,MenuActivity.class);
                startActivity(i);
                finish();
            }
        },15*100);
    }
}



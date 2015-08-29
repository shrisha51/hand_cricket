package com.example.android.HandCricket;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class HelpNextActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpnextactivity);
    }


    public void helpnext(View v){

        startActivity(new Intent(HelpNextActivity.this,MenuActivity.class));
    }
}

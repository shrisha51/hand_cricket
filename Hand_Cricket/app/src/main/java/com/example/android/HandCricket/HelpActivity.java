package com.example.android.HandCricket;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class HelpActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpactivity);
    }


    public void help1(View v){

        startActivity(new Intent(HelpActivity.this,HelpNextActivity.class));
    }
}

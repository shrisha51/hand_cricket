package com.example.android.HandCricket;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;


public class ResultActivity extends ActionBarActivity {
int gameResult;
    ImageView won;
    ImageView lost;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultactivity);
        won= (ImageView) findViewById(R.id.wwon);
        lost= (ImageView) findViewById(R.id.llost);
        Bundle bundle = getIntent().getExtras();
        gameResult = bundle.getInt("result");

        if(gameResult ==1)
        {
            won.setVisibility(View.VISIBLE);

            lost.setVisibility(View.INVISIBLE);
        }
        else if(gameResult ==0)
        {
            won.setVisibility(View.INVISIBLE);

            lost.setVisibility(View.VISIBLE);
        }

    }





}

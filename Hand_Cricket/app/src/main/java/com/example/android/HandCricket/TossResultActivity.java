package com.example.android.HandCricket;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;


public class TossResultActivity extends ActionBarActivity {
    int tossRes;
    ImageView twon;
    ImageView tloss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tossresultactivity);
        twon = (ImageView) findViewById(R.id.twon);
        tloss = (ImageView) findViewById(R.id.tloss);


        Bundle bundle = getIntent().getExtras();
         tossRes = bundle.getInt("res_t");



        if(tossRes ==1)
        {
            //image win
            twon.setVisibility(View.VISIBLE);
            Thread delayThread = new Thread() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    Intent i = new Intent(TossResultActivity.this, PlayerWinActivity.class);
                    startActivity(i);
                    finish();
                }
            };
            delayThread.start();

        }
        else if(tossRes ==0)
        {
        //image loss
            tloss.setVisibility(View.VISIBLE);

            Thread delayThread = new Thread() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    Intent i = new Intent(TossResultActivity.this, CompWinActivity.class);
                    startActivity(i);
                    finish();
                }
            };
            delayThread.start();

        }


        else{
            Thread delayThread = new Thread() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    Intent i = new Intent(TossResultActivity.this, MainPlayActivity.class);
                    startActivity(i);
                    finish();
                }
            };
            delayThread.start();
        }
    }
}





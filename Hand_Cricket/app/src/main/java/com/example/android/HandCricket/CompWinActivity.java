package com.example.android.HandCricket;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;


public class CompWinActivity extends ActionBarActivity {
    ImageView batm;
    ImageView bowlm;
    Random r;
    int rn;
    int uBat;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compwinactivity);
        batm = (ImageView) findViewById(R.id.batm);
        bowlm = (ImageView) findViewById(R.id.bowlm);
        r=new Random();
        rn=r.nextInt(5-1);
        if(rn%2==0)
        {
            //mob chooses to bat
            uBat = 0;
            batm.setVisibility(View.VISIBLE);

            bowlm.setVisibility(View.INVISIBLE);
            Thread delayThread = new Thread() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    Intent i = new Intent(CompWinActivity.this, MainPlayActivity.class);
                    Bundle b = new Bundle();

                    b.putInt("choice", uBat);
                    i.putExtras(b);
                    startActivity(i);
                    finish();
                }
            };
            delayThread.start();

        }
        else
        {
            //mob chooses to bowl
            uBat = 1;
            batm.setVisibility(View.INVISIBLE);

            bowlm.setVisibility(View.VISIBLE);
            Thread delayThread = new Thread() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    Intent i = new Intent(CompWinActivity.this, MainPlayActivity.class);
                    Bundle b = new Bundle();

                    b.putInt("choice", uBat);
                    i.putExtras(b);
                    startActivity(i);
                    finish();
                }
            };
            delayThread.start();
        }
    }





}

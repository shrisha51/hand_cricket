package com.example.android.HandCricket;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;


public class PlayerWinActivity extends ActionBarActivity {
    int uBat;
    ImageView batm;
    ImageView bowlm;
    ImageView img;
    ImageView choto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playerwinactivity);
        batm = (ImageView) findViewById(R.id.batm);
        choto = (ImageView) findViewById(R.id.choto);
        bowlm = (ImageView) findViewById(R.id.bowlm);
        img = (ImageView) findViewById(R.id.imageView5);

    }

public void bat_mtd(View v){

    uBat =1;

    batm.setVisibility(View.VISIBLE);

    bowlm.setVisibility(View.INVISIBLE);
    img.setVisibility(View.INVISIBLE);
    choto.setVisibility(View.VISIBLE);

    Thread delayThread = new Thread() {
        @Override
        public void run() {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Intent i = new Intent(PlayerWinActivity.this, MainPlayActivity.class);
            Bundle b = new Bundle();

            b.putInt("choice", uBat);
            i.putExtras(b);
            startActivity(i);
            finish();
        }
    };
    delayThread.start();
}

    public void bowl_mtd(View v){
        uBat =0;

        batm.setVisibility(View.INVISIBLE);

        bowlm.setVisibility(View.VISIBLE);
        img.setVisibility(View.INVISIBLE);
        choto.setVisibility(View.VISIBLE);
        Thread delayThread = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Intent i = new Intent(PlayerWinActivity.this, MainPlayActivity.class);
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

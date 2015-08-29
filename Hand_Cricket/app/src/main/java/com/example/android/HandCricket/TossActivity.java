package com.example.android.HandCricket;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;


public class TossActivity extends ActionBarActivity {



    ImageView tossm;
    ImageView tossh;
    ImageView tosst;
    ImageView res;
    ImageView headt;
    ImageView tailt;
Random r;
    int rn;
    int uCh;
    int cCh;
    int tWin;

     public void tossfn() {
         if (rn % 2 == 0)
         {
            cCh =2;//tails
             Thread delayThread = new Thread() {
                 @Override
             public void run()
                 {
                     try {
                         Thread.sleep(1000);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 }

             };
             delayThread.start();
             res.setVisibility(View.VISIBLE);

             tossm.setVisibility(View.INVISIBLE);

             tossh.setVisibility(View.INVISIBLE);

             tosst.setVisibility(View.VISIBLE);

         }
         else{
             cCh =1;//heads
             Thread delayThread = new Thread() {
                 @Override
             public void run()
                 {
                     try {
                         Thread.sleep(1000);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 }
             };
             delayThread.start();
             res.setVisibility(View.VISIBLE);

             tossm.setVisibility(View.INVISIBLE);

             tossh.setVisibility(View.VISIBLE);

             tosst.setVisibility(View.INVISIBLE);

         }
        if(cCh == uCh) {
            tWin =1;
            Thread delayThread = new Thread() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                    } catch(InterruptedException e) {
                        e.printStackTrace();
                    }

                    Intent i=new Intent(TossActivity.this,TossResultActivity.class);
                    Bundle b = new Bundle();

                    b.putInt("res_t", tWin);
                    i.putExtras(b);
                    startActivity(i);
                    finish();
                }
            };
            delayThread.start();
        }
         else
        {
            tWin =0;

            Thread delayThread = new Thread() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                    } catch(InterruptedException e) {
                        e.printStackTrace();
                    }

                    Intent i=new Intent(TossActivity.this,TossResultActivity.class);

                    Bundle b = new Bundle();

                    b.putInt("res_t", tWin);
                    i.putExtras(b);
                    startActivity(i);
                    finish();
                }
            };
            delayThread.start();
        }

     }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tossactivity);
        tossm = (ImageView) findViewById(R.id.tossm);
        tossh = (ImageView) findViewById(R.id.tossh);
        tosst = (ImageView) findViewById(R.id.tosst);
        headt = (ImageView) findViewById(R.id.headt);
        tailt = (ImageView) findViewById(R.id.tailt);
        res = (ImageView) findViewById(R.id.res);
        r=new Random();
        rn=r.nextInt(5-1);
    }










public void chooseHead(View v){
uCh =1;

    tailt.setVisibility(View.INVISIBLE);
    headt.setVisibility(View.INVISIBLE);
    tossfn();
}

public void chooseTail(View v)
{
    uCh =2;
    tailt.setVisibility(View.INVISIBLE);
    headt.setVisibility(View.INVISIBLE);
    tossfn();
}




}

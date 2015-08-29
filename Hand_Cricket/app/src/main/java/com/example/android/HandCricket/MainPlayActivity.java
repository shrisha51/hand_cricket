package com.example.android.HandCricket;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class MainPlayActivity extends ActionBarActivity {
    int pBat;
    int scoreeU;
    int scoreeC;
    boolean second;
    TextView yscore;
    TextView cscore;
    ImageView uone;
    ImageView utwo;
    ImageView uthree;
    ImageView ufour;
    ImageView ufive;
    ImageView usix;
    ImageView cone;
    ImageView ctwo;
    ImageView cthree;
    ImageView cfour;
    ImageView cfive;
    ImageView csix;
    ImageView u;
    ImageView c;
    ImageView out;
    ImageView ttbat;
    ImageView ttbowl;
    ImageView yabt;
    ImageView yabl;
    Button but1;
    Button but2;
    Button but3;
    Button but4;
    Button but5;
    Button but6;

    Random r;

    int chU;
    int chC;
    int win;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainplayactivity);
        Bundle bundle = getIntent().getExtras();
        pBat = bundle.getInt("choice");
        second=false;
        scoreeC =0;
        scoreeU =0;
        win=0;
        yscore = (TextView) findViewById(R.id.yscore);
        cscore = (TextView) findViewById(R.id.cscore);
        yscore.setText(String.valueOf(scoreeU));
        cscore.setText(String.valueOf(scoreeC));
        uone = (ImageView) findViewById(R.id.uone);
        utwo = (ImageView) findViewById(R.id.utwo);
        uthree = (ImageView) findViewById(R.id.uthree);
        ufour = (ImageView) findViewById(R.id.ufour);
        ufive= (ImageView) findViewById(R.id.ufive);
        usix = (ImageView) findViewById(R.id.usix);
        cone = (ImageView) findViewById(R.id.cone);
        ctwo = (ImageView) findViewById(R.id.ctwo);
        cthree = (ImageView) findViewById(R.id.cthree);
        cfour = (ImageView) findViewById(R.id.cfour);
        cfive = (ImageView) findViewById(R.id.cfive);
        csix = (ImageView) findViewById(R.id.csix);
        u = (ImageView) findViewById(R.id.u);
        c = (ImageView) findViewById(R.id.c);
        out = (ImageView) findViewById(R.id.out);
        ttbat = (ImageView) findViewById(R.id.ttbat);
        ttbowl = (ImageView) findViewById(R.id.ttbowl);
        yabt = (ImageView) findViewById(R.id.yabt);
        yabl = (ImageView) findViewById(R.id.yabl);
        but1 = (Button) findViewById(R.id.but1);
        but2 = (Button) findViewById(R.id.but2);
        but3 = (Button) findViewById(R.id.but3);
        but4 = (Button) findViewById(R.id.but4);
        but5 = (Button) findViewById(R.id.but5);
        but6 = (Button) findViewById(R.id.but6);

        chU =0;
        chC =0;
         if(pBat ==1){
             yabt.setVisibility(View.VISIBLE);
             yabl.setVisibility(View.INVISIBLE);
         }
        else if(pBat ==0)
         {
             yabt.setVisibility(View.INVISIBLE);
             yabl.setVisibility(View.VISIBLE);
         }




    }

public void dispu1(View v)
 {
     chU =1;
     uone.setVisibility(View.VISIBLE);
     utwo.setVisibility(View.INVISIBLE);
     uthree.setVisibility(View.INVISIBLE);
     ufour.setVisibility(View.INVISIBLE);
     ufive.setVisibility(View.INVISIBLE);
     usix.setVisibility(View.INVISIBLE);
     u.setVisibility(View.INVISIBLE);
     //dispc6();
    // batm.setVisibility(View.INVISIBLE);
     selectm();
}
    public void dispu2(View v)
    {
        chU =2;
        uone.setVisibility(View.INVISIBLE);
        utwo.setVisibility(View.VISIBLE);
        uthree.setVisibility(View.INVISIBLE);
        ufour.setVisibility(View.INVISIBLE);
        ufive.setVisibility(View.INVISIBLE);
        usix.setVisibility(View.INVISIBLE);
        u.setVisibility(View.INVISIBLE);
        //dispc5();
        // batm.setVisibility(View.INVISIBLE);
        selectm();
    }
    public void dispu3(View v)
    {
        chU =3;
        uone.setVisibility(View.INVISIBLE);
        utwo.setVisibility(View.INVISIBLE);
        uthree.setVisibility(View.VISIBLE);
        ufour.setVisibility(View.INVISIBLE);
        ufive.setVisibility(View.INVISIBLE);
        usix.setVisibility(View.INVISIBLE);
        u.setVisibility(View.INVISIBLE);
        //dispc4();
        // batm.setVisibility(View.INVISIBLE);
        selectm();
    }
    public void dispu4(View v)
    {
        chU =4;
        uone.setVisibility(View.INVISIBLE);
        utwo.setVisibility(View.INVISIBLE);
        uthree.setVisibility(View.INVISIBLE);
        ufour.setVisibility(View.VISIBLE);
        ufive.setVisibility(View.INVISIBLE);
        usix.setVisibility(View.INVISIBLE);
        u.setVisibility(View.INVISIBLE);
        //dispc3();
        // batm.setVisibility(View.INVISIBLE);
        selectm();
    }
    public void dispu5(View v)
    {
        chU =5;
        uone.setVisibility(View.INVISIBLE);
        utwo.setVisibility(View.INVISIBLE);
        uthree.setVisibility(View.INVISIBLE);
        ufour.setVisibility(View.INVISIBLE);
        ufive.setVisibility(View.VISIBLE);
        usix.setVisibility(View.INVISIBLE);
        u.setVisibility(View.INVISIBLE);
        //dispc2();
        // batm.setVisibility(View.INVISIBLE);
        selectm();
    }
    public void dispu6(View v)
    {
        chU =6;
        uone.setVisibility(View.INVISIBLE);
        utwo.setVisibility(View.INVISIBLE);
        uthree.setVisibility(View.INVISIBLE);
        ufour.setVisibility(View.INVISIBLE);
        ufive.setVisibility(View.INVISIBLE);
        usix.setVisibility(View.VISIBLE);
        u.setVisibility(View.INVISIBLE);
        // batm.setVisibility(View.INVISIBLE);
        selectm();

    }

    public void dispc1()
    {
        //chC=1;
        cone.setVisibility(View.VISIBLE);
        ctwo.setVisibility(View.INVISIBLE);
        cthree.setVisibility(View.INVISIBLE);
        cfour.setVisibility(View.INVISIBLE);
        cfive.setVisibility(View.INVISIBLE);
        csix.setVisibility(View.INVISIBLE);
        c.setVisibility(View.INVISIBLE);
        // batm.setVisibility(View.INVISIBLE);
        //selectm();
    }
    public void dispc2()
    {
       // chC=2;
        cone.setVisibility(View.INVISIBLE);
        ctwo.setVisibility(View.VISIBLE);
        cthree.setVisibility(View.INVISIBLE);
        cfour.setVisibility(View.INVISIBLE);
        cfive.setVisibility(View.INVISIBLE);
        csix.setVisibility(View.INVISIBLE);
        c.setVisibility(View.INVISIBLE);
        // batm.setVisibility(View.INVISIBLE);
        //selectm();
    }
    public void dispc3()
    {
        //chC=3;
        cone.setVisibility(View.INVISIBLE);
        ctwo.setVisibility(View.INVISIBLE);
        cthree.setVisibility(View.VISIBLE);
        cfour.setVisibility(View.INVISIBLE);
        cfive.setVisibility(View.INVISIBLE);
        csix.setVisibility(View.INVISIBLE);
        c.setVisibility(View.INVISIBLE);
        // batm.setVisibility(View.INVISIBLE);
        //selectm();
    }
    public void dispc4()
    {
        //chC=4;
        cone.setVisibility(View.INVISIBLE);
        ctwo.setVisibility(View.INVISIBLE);
        cthree.setVisibility(View.INVISIBLE);
        cfour.setVisibility(View.VISIBLE);
        cfive.setVisibility(View.INVISIBLE);
        csix.setVisibility(View.INVISIBLE);
        c.setVisibility(View.INVISIBLE);
        // batm.setVisibility(View.INVISIBLE);
        //selectm();
    }
    public void dispc5()
    {
        //chC=5;
        cone.setVisibility(View.INVISIBLE);
        ctwo.setVisibility(View.INVISIBLE);
        cthree.setVisibility(View.INVISIBLE);
        cfour.setVisibility(View.INVISIBLE);
        cfive.setVisibility(View.VISIBLE);
        csix.setVisibility(View.INVISIBLE);
        c.setVisibility(View.INVISIBLE);
        // batm.setVisibility(View.INVISIBLE);
        //selectm();
    }
    public void dispc6()
    {
        //chC=6;
        cone.setVisibility(View.INVISIBLE);
        ctwo.setVisibility(View.INVISIBLE);
        cthree.setVisibility(View.INVISIBLE);
        cfour.setVisibility(View.INVISIBLE);
        cfive.setVisibility(View.INVISIBLE);
        csix.setVisibility(View.VISIBLE);
        c.setVisibility(View.INVISIBLE);
        // batm.setVisibility(View.INVISIBLE);
        //selectm();
    }
    public void selectm()
    {
        if(pBat ==1)
        batm();
        else if(pBat ==0)
        bowlm();
    }
    public void batm()
    {
        if(pBat ==1){
            yabt.setVisibility(View.VISIBLE);
            yabl.setVisibility(View.INVISIBLE);
        }
        else if(pBat ==0)
        {
            yabt.setVisibility(View.INVISIBLE);
            yabl.setVisibility(View.VISIBLE);
        }
        inputc();
        if(chU != chC)
        {
            scoreeU = scoreeU + chU;
            yscore.setText(String.valueOf(scoreeU));


        }
        else if(chU == chC)
        {
            if (second == true)
            {
                win = 0;
                //next screen
                Thread delayThread = new Thread() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        Intent i = new Intent(MainPlayActivity.this, ResultActivity.class);
                        Bundle b = new Bundle();

                        b.putInt("result", win);
                        i.putExtras(b);

                        startActivity(i);
                        finish();


                    }
                };
                delayThread.start();
            }
            else
            {
                pBat = 0;
                second = true;
                dispout();
                Thread delayThread = new Thread() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }


                    }
                };
                delayThread.start();

                dispttbl();



            }
        }

            if(second==true && pBat ==1)
            {
                if(scoreeU > scoreeC)
                {
                    win=1;
                    Thread delayThread = new Thread() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            Intent i = new Intent(MainPlayActivity.this, ResultActivity.class);
                            Bundle b = new Bundle();

                            b.putInt("result",win);

                            i.putExtras(b);
                            startActivity(i);
                            finish();


                        }
                    };
                    delayThread.start();

                }
            }




    }
    public void bowlm()
    {
        if(pBat ==1){
            yabt.setVisibility(View.VISIBLE);
            yabl.setVisibility(View.INVISIBLE);
        }
        else if(pBat ==0)
        {
            yabt.setVisibility(View.INVISIBLE);
            yabl.setVisibility(View.VISIBLE);
        }
        inputc();
        if(chU != chC)
        {
            scoreeC = scoreeC + chC;
            cscore.setText(String.valueOf(scoreeC));

        }
        else if(chC == chU)
        {
            if (second == true) {
                win = 1;
                Thread delayThread = new Thread() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        Intent i = new Intent(MainPlayActivity.this, ResultActivity.class);
                        Bundle b = new Bundle();

                        b.putInt("result", win);
                        i.putExtras(b);

                        startActivity(i);
                        finish();

                    }
                };
                delayThread.start();
            } else {
                dispout();
                Thread delayThread = new Thread() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }


                    }
                };
                delayThread.start();
                pBat = 1;
                second = true;
                dispttbt();



            }
        }
            if(second==true && pBat ==0)
            {
                if(scoreeC > scoreeU)
                {
                    win=0;
                    Thread delayThread = new Thread() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            Intent i = new Intent(MainPlayActivity.this, ResultActivity.class);
                            Bundle b = new Bundle();

                            b.putInt("result",win);

                            i.putExtras(b);
                            startActivity(i);
                            finish();

                        }
                    };
                    delayThread.start();

                }
            }

    }

   public void dispout()
    {
        cone.setVisibility(View.INVISIBLE);
        ctwo.setVisibility(View.INVISIBLE);
        cthree.setVisibility(View.INVISIBLE);
        cfour.setVisibility(View.INVISIBLE);
        cfive.setVisibility(View.INVISIBLE);
        csix.setVisibility(View.INVISIBLE);
        c.setVisibility(View.INVISIBLE);
        uone.setVisibility(View.INVISIBLE);
        utwo.setVisibility(View.INVISIBLE);
        uthree.setVisibility(View.INVISIBLE);
        ufour.setVisibility(View.INVISIBLE);
        ufive.setVisibility(View.INVISIBLE);
        usix.setVisibility(View.INVISIBLE);
        u.setVisibility(View.INVISIBLE);
        yabt.setVisibility(View.INVISIBLE);
        yabl.setVisibility(View.INVISIBLE);
        out.setVisibility(View.VISIBLE);
        ttbat.setVisibility(View.INVISIBLE);
        ttbowl.setVisibility(View.INVISIBLE);
        but1.setVisibility(View.INVISIBLE);
        but2.setVisibility(View.INVISIBLE);
        but3.setVisibility(View.INVISIBLE);
        but4.setVisibility(View.INVISIBLE);
        but5.setVisibility(View.INVISIBLE);
        but6.setVisibility(View.INVISIBLE);
    }
    public void dispttbt()
    {
        cone.setVisibility(View.INVISIBLE);
        ctwo.setVisibility(View.INVISIBLE);
        cthree.setVisibility(View.INVISIBLE);
        cfour.setVisibility(View.INVISIBLE);
        cfive.setVisibility(View.INVISIBLE);
        csix.setVisibility(View.INVISIBLE);
        c.setVisibility(View.INVISIBLE);
        uone.setVisibility(View.INVISIBLE);
        utwo.setVisibility(View.INVISIBLE);
        uthree.setVisibility(View.INVISIBLE);
        ufour.setVisibility(View.INVISIBLE);
        ufive.setVisibility(View.INVISIBLE);
        usix.setVisibility(View.INVISIBLE);
        u.setVisibility(View.INVISIBLE);
        yabt.setVisibility(View.INVISIBLE);
        yabl.setVisibility(View.INVISIBLE);
        out.setVisibility(View.INVISIBLE);
        ttbat.setVisibility(View.VISIBLE);
        ttbowl.setVisibility(View.INVISIBLE);
        but1.setVisibility(View.INVISIBLE);
        but2.setVisibility(View.INVISIBLE);
        but3.setVisibility(View.INVISIBLE);
        but4.setVisibility(View.INVISIBLE);
        but5.setVisibility(View.INVISIBLE);
        but6.setVisibility(View.INVISIBLE);
        Thread delayThread = new Thread() {
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    };
       delayThread.start();


        cone.setVisibility(View.INVISIBLE);
        ctwo.setVisibility(View.INVISIBLE);
        cthree.setVisibility(View.INVISIBLE);
        cfour.setVisibility(View.INVISIBLE);
        cfive.setVisibility(View.INVISIBLE);
        csix.setVisibility(View.INVISIBLE);
        c.setVisibility(View.VISIBLE);
        uone.setVisibility(View.INVISIBLE);
        utwo.setVisibility(View.INVISIBLE);
        uthree.setVisibility(View.INVISIBLE);
        ufour.setVisibility(View.INVISIBLE);
        ufive.setVisibility(View.INVISIBLE);
        usix.setVisibility(View.INVISIBLE);
        u.setVisibility(View.VISIBLE);
        yabt.setVisibility(View.VISIBLE);
        yabl.setVisibility(View.INVISIBLE);
        out.setVisibility(View.INVISIBLE);
        ttbat.setVisibility(View.INVISIBLE);
        ttbowl.setVisibility(View.INVISIBLE);
        but1.setVisibility(View.VISIBLE);
        but2.setVisibility(View.VISIBLE);
        but3.setVisibility(View.VISIBLE);
        but4.setVisibility(View.VISIBLE);
        but5.setVisibility(View.VISIBLE);
        but6.setVisibility(View.VISIBLE);


    }
    public void dispttbl()
    {
        cone.setVisibility(View.INVISIBLE);
        ctwo.setVisibility(View.INVISIBLE);
        cthree.setVisibility(View.INVISIBLE);
        cfour.setVisibility(View.INVISIBLE);
        cfive.setVisibility(View.INVISIBLE);
        csix.setVisibility(View.INVISIBLE);
        c.setVisibility(View.INVISIBLE);
        uone.setVisibility(View.INVISIBLE);
        utwo.setVisibility(View.INVISIBLE);
        uthree.setVisibility(View.INVISIBLE);
        ufour.setVisibility(View.INVISIBLE);
        ufive.setVisibility(View.INVISIBLE);
        usix.setVisibility(View.INVISIBLE);
        u.setVisibility(View.INVISIBLE);
        yabt.setVisibility(View.INVISIBLE);
        yabl.setVisibility(View.INVISIBLE);
        out.setVisibility(View.INVISIBLE);
        ttbat.setVisibility(View.INVISIBLE);
        ttbowl.setVisibility(View.VISIBLE);
        but1.setVisibility(View.INVISIBLE);
        but2.setVisibility(View.INVISIBLE);
        but3.setVisibility(View.INVISIBLE);
        but4.setVisibility(View.INVISIBLE);
        but5.setVisibility(View.INVISIBLE);
        but6.setVisibility(View.INVISIBLE);
        Thread delayThread = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        };
        delayThread.start();


        cone.setVisibility(View.INVISIBLE);
        ctwo.setVisibility(View.INVISIBLE);
        cthree.setVisibility(View.INVISIBLE);
        cfour.setVisibility(View.INVISIBLE);
        cfive.setVisibility(View.INVISIBLE);
        csix.setVisibility(View.INVISIBLE);
        c.setVisibility(View.VISIBLE);
        uone.setVisibility(View.INVISIBLE);
        utwo.setVisibility(View.INVISIBLE);
        uthree.setVisibility(View.INVISIBLE);
        ufour.setVisibility(View.INVISIBLE);
        ufive.setVisibility(View.INVISIBLE);
        usix.setVisibility(View.INVISIBLE);
        u.setVisibility(View.VISIBLE);
        yabt.setVisibility(View.INVISIBLE);
        yabl.setVisibility(View.VISIBLE);
        out.setVisibility(View.INVISIBLE);
        ttbat.setVisibility(View.INVISIBLE);
        ttbowl.setVisibility(View.INVISIBLE);
        but1.setVisibility(View.VISIBLE);
        but2.setVisibility(View.VISIBLE);
        but3.setVisibility(View.VISIBLE);
        but4.setVisibility(View.VISIBLE);
        but5.setVisibility(View.VISIBLE);
        but6.setVisibility(View.VISIBLE);



    }


    void inputc()
    {
        r=new Random();
        chC =r.nextInt(7-1)+1;
        switch(chC)
        {

            case 1:
                dispc1();
                break;
            case 2:
                dispc2();
                break;
            case 3:
                dispc3();
                break;
            case 4:
                dispc4();
                break;
            case 5:
                dispc5();
                break;
            case 6:
                dispc6();
                break;
            default:
                dispc6();
                break;


        }
    }
}

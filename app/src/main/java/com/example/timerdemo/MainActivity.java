package com.example.timerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  CountDownTimer is used for temporary timer
        /*
        new CountDownTimer(10000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Log.d("Count" , " " + millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                Log.d("Finished" , "It's over");
            }
        }.start();
        */

        //  CountDownTimer for permanent
        /**/
        final Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Log.d("Timer" , "Timer ");

                handler.postDelayed(this , 1000);
            }
        };
        handler.post(runnable);
         /**/
    }
}

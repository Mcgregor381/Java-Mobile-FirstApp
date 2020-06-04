package uk.co.mycoffeeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash_ScreenActivaty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen_activaty);

        //Call the Logo Screen
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_ScreenActivaty.this, UserLoginScreenActivity.class);
                startActivity(intent);
                finish();
            }
        };
        //a 5 second timer
        Timer timer = new Timer();
        timer.schedule(task, 5000);

    }
}
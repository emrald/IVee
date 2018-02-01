package com.androidtutorialpoint.horizontallistview;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_DISPLAY_TIME = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                //  Intent mainIntent;
                        Intent mainIntent = new Intent(SplashActivity.this,
                                MainActivity.class);
                        mainIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                        startActivity(mainIntent);

                        finish();

                overridePendingTransition(R.anim.mainfadein,
                        R.anim.splashfadeout);
            }
        }, SPLASH_DISPLAY_TIME);
    }
}

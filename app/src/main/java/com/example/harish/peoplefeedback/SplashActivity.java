package com.example.harish.peoplefeedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    private TextView textsplash;
    private ImageView imagesplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        textsplash = findViewById(R.id.txt_splash);
        imagesplash = findViewById(R.id.img_splash);

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.splashanimation);
        textsplash.startAnimation(myanim);
        imagesplash.startAnimation(myanim);

        final Intent intent = new Intent(SplashActivity.this, LoginActivity.class);

        Thread timer = new Thread() {

            public void run() {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(intent);
                    finish();

                }
            }
        };
        timer.start();

    }
}

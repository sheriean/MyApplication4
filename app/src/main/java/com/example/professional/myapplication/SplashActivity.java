package com.example.professional.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity{

    private final int splash_duration =3000;
    ImageView splash_image ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        splash_image=(ImageView)findViewById(R.id.splash_img);
   final   Animation splash_anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
   final  Animation anti_rotat_anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.antirotat);
        splash_image.startAnimation(splash_anim);


    splash_anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
            splash_image.startAnimation(anti_rotat_anim);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    anti_rotat_anim.setAnimationListener(new Animation.AnimationListener() {
        @Override
        public void onAnimationStart(Animation animation) {

        }

        @Override
        public void onAnimationEnd(Animation animation) {
            Intent intent=new Intent(SplashActivity.this,loginActivity.class);
            startActivity(intent);
        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }
    });

        //////////////////////////////////////////////////////////////////


     /* new Handler().postDelayed(new Runnable() {
          @Override
          public void run() {

          }
      },splash_duration);*/


    }
}

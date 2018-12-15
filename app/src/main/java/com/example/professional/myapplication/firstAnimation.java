package com.example.professional.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

public class firstAnimation extends AwesomeSplash {



    @Override
    public void initSplash(ConfigSplash configSplash) {
     configSplash.setBackgroundColor(R.color.back);
     configSplash.getAnimCircularRevealDuration();
    }

    @Override
    public void animationsFinished() {

    }
}

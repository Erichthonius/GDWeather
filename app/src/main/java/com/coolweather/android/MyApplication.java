package com.coolweather.android;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePalApplication;

/**
 * Created by lenovo on 2017/2/10 0010.
 */

public class MyApplication extends Application {

    private static Context sContext;

    @Override
    public void onCreate() {
        sContext=getApplicationContext();
        LitePalApplication.initialize(sContext);
    }
    public static Context getContext(){
        return sContext;
    }
}

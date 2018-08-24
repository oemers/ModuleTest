package com.ryy.ncb_common;

import android.app.Application;

/**
 * Created by renyangyang on 2018/8/22.
 */
public class BaseApplication extends Application{

    private static BaseApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;
    }

    public static BaseApplication getInstance(){
        return instance;
    }
}

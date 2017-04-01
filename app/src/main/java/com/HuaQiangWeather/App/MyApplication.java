package com.HuaQiangWeather.App;

import android.app.Application;
import android.content.Context;

import org.xutils.x;

/**
 * Created by Administrator on 2017/4/1/001.
 */

public class MyApplication extends Application {
    private static  Context mContext ;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        x.Ext.init(this);
    }
    public  static Context getContext(){
        return mContext;
    }
}

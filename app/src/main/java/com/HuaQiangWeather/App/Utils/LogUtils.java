package com.HuaQiangWeather.App.Utils;

import android.util.Log;

/**
 * Created by Administrator on 2017/4/1/001.
 */

public class LogUtils {

    private static int inf =1;
    private static int deb =2;
    private static int wra =3;
    private static int err =4;

    private static int now = inf;

    public static void v(String tag,String msg){
        if (now<=inf){
            Log.i(tag, msg);
        }
    }

    public static void d(String tag,String msg){
        if (now<=deb){
            Log.d(tag, msg);
        }
    }

    public static void w(String tag,String msg){
        if (now<=wra){
            Log.w(tag, msg);
        }
    }

    public static void e(String tag,String msg){
        if (now<=err){
            Log.e(tag, msg);
        }
    }

}

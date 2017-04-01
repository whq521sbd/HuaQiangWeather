package com.HuaQiangWeather.App;

import android.app.Application;
import android.content.Context;

import org.xutils.DbManager;
import org.xutils.x;

/**
 * Created by Administrator on 2017/4/1/001.
 */

public class MyApplication extends Application {
    private static  Context mContext ;
    private DbManager.DaoConfig daoConfig;
    private DbManager db;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        x.Ext.init(this);
        x.Ext.setDebug(true); // 是否输出debug日志
        getdaoConfig();

    }





    public  static Context getContext(){
        return mContext;
    }


    public static DbManager.DaoConfig getdaoConfig() {

        DbManager.DaoConfig daoConfig=new DbManager.DaoConfig()
                .setDbName("Arae.db")
                .setDbVersion(1)
                .setDbOpenListener(new DbManager.DbOpenListener() {
                    @Override
                    public void onDbOpened(DbManager db) {
                        db.getDatabase().enableWriteAheadLogging();
                    }
                });

        return daoConfig;
    }
}

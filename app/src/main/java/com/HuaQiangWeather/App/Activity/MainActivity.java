package com.HuaQiangWeather.App.Activity;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.HuaQiangWeather.App.MyApplication;
import com.HuaQiangWeather.App.R;

import org.xutils.DbManager;
import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

public class MainActivity extends AppCompatActivity {

    private Toolbar tb_toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DbManager dbManager =  x.getDb(MyApplication.getdaoConfig());
        initView();
        ActionBar bar = getSupportActionBar();
        if (bar!=null){
            bar.setDisplayHomeAsUpEnabled(true);
            bar.setHomeAsUpIndicator(R.mipmap.menu);
        }

    }

    private void initView() {
        tb_toolbar = (Toolbar) findViewById(R.id.tb_toolbar);
        setSupportActionBar(tb_toolbar);
    }


}

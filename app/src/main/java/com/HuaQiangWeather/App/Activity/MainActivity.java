package com.HuaQiangWeather.App.Activity;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.widget.Toast;

import com.HuaQiangWeather.App.R;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequestParams params = new RequestParams("https://api.douban.com/v2/book/1220562");
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {

                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();

            }


            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

                Toast.makeText(MainActivity.this,  ""+isOnCallback, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "111111111111111", Toast.LENGTH_SHORT).show();
    }
}

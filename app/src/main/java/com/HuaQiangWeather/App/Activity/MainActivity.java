package com.HuaQiangWeather.App.Activity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.HuaQiangWeather.App.Adapter.RecyAdapter;
import com.HuaQiangWeather.App.Entity.WeatherBean;
import com.HuaQiangWeather.App.Entity.WxapiBean;
import com.HuaQiangWeather.App.R;
import com.HuaQiangWeather.App.Utils.FinalConnication;
import com.HuaQiangWeather.App.Utils.LogUtils;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.JsonArray;


import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;

import me.leefeng.citypicker.CityPicker;
import me.leefeng.citypicker.CityPickerListener;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener ,CityPickerListener {
    private static final String TAG = "MainActivity";
    private TextView tv_citytile,tv_upTime,tv_degree,tv_weatherInfo,tv_wind,tv_windOrientation;
    private TextView tv_comfort,tv_car,tv_sport;
    private RecyclerView rv_RecyclerView;
    private WxapiBean wxapiBean;
    private RecyAdapter recyAdapter;
    private String city;

    private CityPicker cityPicker;
    protected NavigationView   nv_Naviview;
    private TextView tv_nowLoacation,tv_changeCity,tv_menu,address;
    private ImageView iv_background;
    private DrawerLayout dl_DrawerLayout;
    //声明AMapLocationClient类对象
    public AMapLocationClient mLocationClient = null;
    //声明AMapLocationClientOption对象
    public AMapLocationClientOption mLocationOption = null;
    //声明定位回调监听器
    public AMapLocationListener mLocationListener = new AMapLocationListener() {
        @Override
        public void onLocationChanged(final AMapLocation aMapLocation) {
           if (aMapLocation!=null){
               if (aMapLocation.getErrorCode()==0){
                   runOnUiThread(new Runnable() {
                       @Override
                       public void run() {
                           city  = aMapLocation.getCity(); //获得city对象
                           tv_nowLoacation.setText(aMapLocation.getCity()+aMapLocation.getDistrict());
                           address.setText(aMapLocation.getAddress());
                           if (!TextUtils.isEmpty(city)){
                                   qryWeather(city);
                               if (wxapiBean==null){
                                   qryWxapi();

                               }else {
                                   recyAdapter.notifyDataSetChanged();
                               }
                           }else Toast.makeText(MainActivity.this, "高德SDk未获得城市位置，请手动查询天气！", Toast.LENGTH_SHORT).show();
                       }
                   });
               }else {
                   Toast.makeText(MainActivity.this, ""+aMapLocation.getErrorInfo()+aMapLocation.getErrorCode(), Toast.LENGTH_SHORT).show();
                   //定位失败时，可通过ErrCode（错误码）信息来确定失败的原因，errInfo是错误信息，详见错误码表。
                   LogUtils.e("AmapError","location Error, ErrCode:"
                           + aMapLocation.getErrorCode() + ", errInfo:"
                           + aMapLocation.getErrorInfo());
               }
           }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView(); //初始化控件
    }


    @Override
    protected void onResume() {
        super.onResume();
        JudgeerPmission();//判断权限
    }

    private void JudgeerPmission() {
        ArrayList<String> list = new ArrayList<>();

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED){
            list.add(Manifest.permission.ACCESS_COARSE_LOCATION);
        }

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){
            list.add(Manifest.permission.WRITE_EXTERNAL_STORAGE);
        }

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED){
            list.add(Manifest.permission.READ_PHONE_STATE);
        }

        if (!list.isEmpty()){
            String [] permission = list.toArray(new String[list.size()]);
            ActivityCompat.requestPermissions(this,permission,1);
        }else {
            initAmap();
        }


    }

    private void initView() {
        cityPicker = new CityPicker(MainActivity.this, this);
        iv_background = (ImageView) findViewById(R.id.iv_background);//背景
        getBingPic();//获取图片，并设置图层
        nv_Naviview = (NavigationView) findViewById(R.id.nv_Naviview);
        nv_Naviview.setItemIconTintList(null);
        View headview = nv_Naviview.getHeaderView(0);
        tv_nowLoacation = (TextView) headview.findViewById(R.id.tv_nowLoacation);// 显示当前位置
        address = (TextView) headview.findViewById(R.id.address);
        tv_changeCity = (TextView) headview.findViewById(R.id.tv_changeCity);
        tv_changeCity.setOnClickListener(this);
        tv_menu = (TextView) findViewById(R.id.tv_menu);
        tv_menu.setOnClickListener(this);
        dl_DrawerLayout = (DrawerLayout) findViewById(R.id.dl_DrawerLayout);
//        **********************************
        tv_citytile = (TextView) findViewById(R.id.tv_citytile);
        tv_upTime = (TextView) findViewById(R.id.tv_upTime);
        tv_degree = (TextView) findViewById(R.id.tv_degree);
        tv_weatherInfo = (TextView) findViewById(R.id.tv_weatherInfo);
        tv_windOrientation = (TextView) findViewById(R.id.tv_windOrientation);
        tv_wind = (TextView) findViewById(R.id.tv_wind);
        tv_comfort = (TextView) findViewById(R.id.tv_comfort);
        tv_car = (TextView) findViewById(R.id.tv_car);
        tv_sport = (TextView) findViewById(R.id.tv_sport);
        rv_RecyclerView = (RecyclerView) findViewById(R.id.rv_RecyclerView);

    }

    private void viewLoadData(WeatherBean weatherBean) {
        tv_citytile.setText(weatherBean.getResult().getToday().getCity());
        tv_upTime.setText(weatherBean.getResult().getSk().getTime());
        tv_degree.setText(weatherBean.getResult().getSk().getTemp()+"℃");
        tv_weatherInfo.setText(weatherBean.getResult().getToday().getWeather());
        tv_windOrientation.setText(weatherBean.getResult().getSk().getWind_direction());
        tv_wind.setText(weatherBean.getResult().getSk().getWind_strength());
        tv_comfort.setText("穿衣建议："+weatherBean.getResult().getToday().getDressing_advice());
        tv_car.setText("洗车建议："+weatherBean.getResult().getToday().getWash_index());
        tv_sport.setText("晨练建议："+weatherBean.getResult().getToday().getExercise_index());

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode==1){
            if (grantResults.length>0){
                for (int result:grantResults){
                    if (result!=PackageManager.PERMISSION_GRANTED){
                        Toast.makeText(this, "不开启权限，无法使用app！", Toast.LENGTH_SHORT).show();
                        finish();
                    }else {
                        initAmap();
                    }
                }
            }
        }
    }

    private void initAmap() { //初始化Amap定位

        mLocationClient = new AMapLocationClient(getApplicationContext());//初始化定位

        mLocationClient.setLocationListener(mLocationListener);//设置定位回调监听

        mLocationOption = new AMapLocationClientOption();//初始化AMapLocationClientOption对象

        //设置定位模式为AMapLocationMode.Hight_Accuracy，高精度模式。
        mLocationOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);

        //设置定位间隔,单位毫秒,默认为2000ms，最低1000ms。
        //mLocationOption.setInterval(1000*10*6);

        mLocationOption.setOnceLocation(true);

//获取最近3s内精度最高的一次定位结果：
//设置setOnceLocationLatest(boolean b)接口为true，启动定位时SDK会返回最近3s内精度最高的一次定位结果。如果设置其为true，setOnceLocation(boolean b)接口也会被设置为true，反之不会，默认为false。
        mLocationOption.setOnceLocationLatest(true);

        //设置是否返回地址信息（默认返回地址信息）
        mLocationOption.setNeedAddress(true);

        //给定位客户端对象设置定位参数
        mLocationClient.setLocationOption(mLocationOption);

        //启动定位
        mLocationClient.startLocation();

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_menu:
                dl_DrawerLayout.openDrawer(GravityCompat.START);
                break;
            case R.id.tv_changeCity:
                cityPicker.show();
                dl_DrawerLayout.closeDrawer(GravityCompat.START);
                break;
        }

    }

    public void getBingPic() {
       RequestParams params = new RequestParams(FinalConnication.BingPic);
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {

                if (!TextUtils.isEmpty(result)){
                    Glide.with(MainActivity.this).load(result).into(iv_background); //加载Bing图片
                    Snackbar.make(iv_background,"获得Bing图片成功！",Snackbar.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                ex.printStackTrace();
                LogUtils.e(TAG,ex.toString());
                Toast.makeText(MainActivity.this, "获取Bing图片错误！", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    public void qryWeather(String cityname ){

        RequestParams params = new RequestParams(FinalConnication.WeathetApi);
        params.addBodyParameter("cityname",cityname);
        params.addBodyParameter("key",FinalConnication.Key);

        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                if (!TextUtils.isEmpty(result)){
                    Gson gson = new Gson();
                  WeatherBean weatherBean =  gson.fromJson(result, WeatherBean.class);
                    if (weatherBean.getResultcode().equals("200")){
                        viewLoadData(weatherBean);

                    }else Toast.makeText(MainActivity.this, weatherBean.getReason(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                Toast.makeText(MainActivity.this, ex.toString(), Toast.LENGTH_SHORT).show();
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
    public void getCity(String s) {
            String [] adress = s.split(" ");
            if (adress.length>0){
                String city = adress[1];
                qryWeather(city);
                qryWxapi();
            }
        }

    private void qryWxapi() {
        RequestParams params = new RequestParams(FinalConnication.WeChatApi);
        params.addBodyParameter("key",FinalConnication.wxKey);
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                if (!TextUtils.isEmpty(result)){
                    Gson gson = new Gson();
                    wxapiBean  =   gson.fromJson(result, WxapiBean.class);
                    if (wxapiBean.getError_code()==0){
                       ArrayList<WxapiBean.ResultBean.ListBean> beandatas = (ArrayList<WxapiBean.ResultBean.ListBean>) wxapiBean.getResult().getList();
                        recyAdapter  = new RecyAdapter(beandatas);
                        GridLayoutManager manager = new GridLayoutManager(MainActivity.this,2);
                        rv_RecyclerView.setLayoutManager(manager);
                        rv_RecyclerView.setAdapter(recyAdapter);
                    }else Toast.makeText(MainActivity.this, wxapiBean.getReason(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

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
    public void onBackPressed() {
        if (cityPicker.isShow()){
            cityPicker.close();
            return;
        }
        super.onBackPressed();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mLocationClient.stopLocation();//停止定位后，本地定位服务并不会被销毁
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mLocationClient.onDestroy();//销毁定位客户端，同时销毁本地定位服务。
    }


    }


package com.HuaQiangWeather.App.Activity;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.HuaQiangWeather.App.R;
import com.bumptech.glide.Glide;

public class WxWeb extends AppCompatActivity {

    private AppBarLayout ab_appbar;
    private CollapsingToolbarLayout ctb_CollapsingToolbarLayout;
    private ImageView iv_newsImg;
    private TextView tv_newsTitle,tv_newsSource;
    private WebView wv_webview;
    private Toolbar tb_toolbar;
    private FloatingActionButton fab_collect;

    private String newstitle;
    private String newsSource;
    private String newsUrl;
    private String newsImg;


    public static void startAction(Context context,String newtitle,String newsSource,String newsUrl,String newsImg){
        Intent intent = new Intent(context,WxWeb.class);
        intent.putExtra("newstitle",newtitle);
        intent.putExtra("newsSource",newsSource);
        intent.putExtra("newsUrl",newsUrl);
        intent.putExtra("newsImg",newsImg);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wx_web);
        initView();

        if (getIntent()!=null){
            Intent newsData = getIntent();
             newstitle   =  newsData.getStringExtra("newstitle");
             newsSource  = newsData.getStringExtra("newsSource");
             newsUrl  = newsData.getStringExtra("newsUrl");
             newsImg   = newsData.getStringExtra("newsImg");
        }else Toast.makeText(this, "未获得上一页面数据", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        ViewBindData();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return true;
    }

    private void ViewBindData() {
        Glide.with(WxWeb.this).load(newsImg).into(iv_newsImg);
        tv_newsTitle.setText(newstitle);
        tv_newsSource.setText("来自："+newsSource);
        wv_webview.loadUrl(newsUrl);
        fab_collect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"已收藏！",Snackbar.LENGTH_LONG)
                        .setAction("返回", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                finish();
                            }
                        }).show();
            }
        });
    }

    private void initView() {
        ab_appbar = (AppBarLayout) findViewById(R.id.ab_appbar);
        ctb_CollapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.ctb_CollapsingToolbarLayout);
        iv_newsImg = (ImageView) findViewById(R.id.iv_newsImg);
        tv_newsTitle = (TextView) findViewById(R.id.tv_newsTitle);
        tv_newsSource = (TextView) findViewById(R.id.tv_newsSource);
        wv_webview = (WebView) findViewById(R.id.wv_webview);
        wv_webview.setWebViewClient(new WebViewClient());
        wv_webview.getSettings().setJavaScriptEnabled(true);
        tb_toolbar = (Toolbar) findViewById(R.id.tb_toolbar);
        setSupportActionBar(tb_toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        ctb_CollapsingToolbarLayout.setTitle("微信精选");
        fab_collect = (FloatingActionButton) findViewById(R.id.fab_collect);
    }
}

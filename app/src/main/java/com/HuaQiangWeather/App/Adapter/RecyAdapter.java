package com.HuaQiangWeather.App.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.HuaQiangWeather.App.Activity.WxWeb;
import com.HuaQiangWeather.App.Entity.WxapiBean;
import com.HuaQiangWeather.App.R;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/4/3/003.
 */

public class RecyAdapter extends RecyclerView.Adapter<RecyAdapter.MyHolder> {

    private ArrayList<WxapiBean.ResultBean.ListBean> mlists= new ArrayList<>();
    private Context mContext;
    public RecyAdapter(ArrayList<WxapiBean.ResultBean.ListBean> lists) {
        mlists = lists;
    }

    @Override
    public int getItemCount() {
        return mlists.size();
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View itemview =   LayoutInflater.from(mContext).inflate(R.layout.forecast_item,parent,false);
        MyHolder myHolder = new MyHolder(itemview);
        return myHolder;
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        TextView tv_tile;
        View item;

        public MyHolder(View itemView) {
            super(itemView);
            item = itemView;
            tv_tile = (TextView) itemView.findViewById(R.id.tv_tile);
        }

    }

    @Override
    public void onBindViewHolder(final MyHolder holder, int position) {
        holder.tv_tile.setText(mlists.get(position).getTitle());
        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos =holder.getAdapterPosition();
                WxWeb.startAction(mContext,mlists.get(pos).getTitle(),mlists.get(pos).getSource(),mlists.get(pos).getUrl(),mlists.get(pos).getFirstImg());
            }
        });
    }
}

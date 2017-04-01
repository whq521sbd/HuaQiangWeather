package com.HuaQiangWeather.App.DB;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

/**
 * Created by Administrator on 2017/4/1/001.
 */

@Table(name = "CityTable")
public class CityTable {

    @Column(name = "id",isId = true, autoGen = true)
    private int id;

    @Column(name = "cityCode")
    private int cityCode;

    @Column(name = "cityNanme")
    private String cityNanme;

    @Column(name = "provinceId")
    private int  provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityNanme() {
        return cityNanme;
    }

    public void setCityNanme(String cityNanme) {
        this.cityNanme = cityNanme;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}

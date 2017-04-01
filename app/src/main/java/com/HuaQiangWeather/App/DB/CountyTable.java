package com.HuaQiangWeather.App.DB;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

/**
 * Created by Administrator on 2017/4/1/001.
 */
@Table(name = "CountyTable")
public class CountyTable {

    @Column(name = "id",isId = true,autoGen = true)
    private int id;

    @Column(name = "countyCode")
    private int countyCode;

    @Column(name = "countyName")
    private String countyName ;

    @Column(name = "weatherId")
    private String weatherId;

    @Column(name = "cityID")
    private int cityID;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(int countyCode) {
        this.countyCode = countyCode;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }
}

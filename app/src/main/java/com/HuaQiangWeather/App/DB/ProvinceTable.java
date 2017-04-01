package com.HuaQiangWeather.App.DB;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

/**
 * Created by Administrator on 2017/4/1/001.
 */
@Table(name = "ProvinceTable")
public class ProvinceTable {

    @Column(name = "id",isId = true,autoGen = true)
    private int id ;

    @Column(name = "provinceCode")
    private int provinceCode;

    @Column(name = "provinceName")
    private String provinceName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}

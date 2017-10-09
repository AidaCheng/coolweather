package com.aidacheng.coolweather.db;

/**
 * Created by Administrator on 2017/10/9.
 */

public class Country {

    private int id;
    private String countryName; //县的名字
    private String weatherId;   //对应天气的Id
    private String cityId;      //当前县所属的城市的Id

    public Country() {}

    public Country(int id, String countryName, String weatherId, String cityId) {
        this.id = id;
        this.countryName = countryName;
        this.weatherId = weatherId;
        this.cityId = cityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", countryName='" + countryName + '\'' +
                ", weatherId='" + weatherId + '\'' +
                ", cityId='" + cityId + '\'' +
                '}';
    }
}

package com.heweather.api.response.weather;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.heweather.api.common.jackson.ZonedDatetimeDeserializer;

import java.time.ZonedDateTime;

public class Hourly {

    @JsonDeserialize(using = ZonedDatetimeDeserializer.class)
    private ZonedDateTime fxTime; //逐小时预报时间; //2013-12-30T13:00+08:00
    private String temp; //逐小时预报温度; //2
    private String icon; //逐小时预报天气状况图标代码，图标可通过天气状况和图标下载; //101
    private String text; //逐小时预报天气状况文字描述，包括阴晴雨雪等天气状态的描述; //多云
    private String wind360; //逐小时预报风向360角度; //305
    private String windDir; //逐小时预报风向; //西北
    private String windScale; //逐小时预报风力等级; //3
    private String windSpeed; //逐小时预报风速，公里/小时; //15
    private String humidity; //逐小时预报相对湿度，百分比数值; //40
    private String precip; //逐小时预报降水量，默认单位：毫米; //1.2
    private String pop; //逐小时预报降水概率，百分比数值，可能为空; //5
    private String pressure; //逐小时预报大气压强，默认单位：百帕; //1020
    private String cloud; //逐小时预报云量，百分比数值; //23
    private String dew; //逐小时预报露点温度; //12

    public ZonedDateTime getFxTime() {
        return fxTime;
    }

    public void setFxTime(ZonedDateTime fxTime) {
        this.fxTime = fxTime;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getWind360() {
        return wind360;
    }

    public void setWind360(String wind360) {
        this.wind360 = wind360;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public String getWindScale() {
        return windScale;
    }

    public void setWindScale(String windScale) {
        this.windScale = windScale;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPrecip() {
        return precip;
    }

    public void setPrecip(String precip) {
        this.precip = precip;
    }

    public String getPop() {
        return pop;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getCloud() {
        return cloud;
    }

    public void setCloud(String cloud) {
        this.cloud = cloud;
    }

    public String getDew() {
        return dew;
    }

    public void setDew(String dew) {
        this.dew = dew;
    }
}

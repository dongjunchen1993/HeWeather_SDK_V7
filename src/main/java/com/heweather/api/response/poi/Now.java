package com.heweather.api.response.poi;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.heweather.api.common.jackson.ZonedDatetimeDeserializer;

import java.time.ZonedDateTime;

public class Now {
    @JsonDeserialize(using = ZonedDatetimeDeserializer.class)
    private ZonedDateTime obsTime; //实况观测时间; //2013-12-30T01:45+08:00
    private String temp; //实况温度，默认单位：摄氏度; //21
    private String feelsLike; //实况体感温度，默认单位：摄氏度; //23
    private String icon; //当前天气状况和图标的代码，图标可通过天气状况和图标下载; //100
    private String text; //实况天气状况的文字描述，包括阴晴雨雪等天气状态的描述; //晴
    private String windDir; //实况风向; //西北
    private String windScale; //实况风力等级; //3
    private String humidity; //实况相对湿度，百分比数值; //40
    private String precip; //实况降水量，默认单位：毫米; //1.2
    private String pressure; //实况大气压强，默认单位：百帕; //1020

    public ZonedDateTime getObsTime() {
        return obsTime;
    }

    public void setObsTime(ZonedDateTime obsTime) {
        this.obsTime = obsTime;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(String feelsLike) {
        this.feelsLike = feelsLike;
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

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }
}

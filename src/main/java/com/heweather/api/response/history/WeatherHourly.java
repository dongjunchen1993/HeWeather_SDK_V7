package com.heweather.api.response.history;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.heweather.api.common.jackson.ZonedDatetimeDeserializer;

import java.time.ZonedDateTime;

public class WeatherHourly {

    @JsonDeserialize(using = ZonedDatetimeDeserializer.class)
    private ZonedDateTime time;//	历史当天天气时间	2013-12-30T01:45+08:00
    private String temp;//	当天每小时温度	2
    private String icon;//	当天每小时天气状况图标的代码，图标可通过天气状况和图标下载	101
    private String text;//	当天每小时天气状况代码	多云
    private String precip;//	当天每小时累计降水量	1.2
    private String wind360;//	当天每小时风向360角度	305
    private String windDir;//	当天每小时风向	西北
    private String windScale;//	当天每小时风力	4
    private String windSpeed;//	当天每小时风速，公里/小时	15
    private String humidity;//	当天每小时相对湿度	30
    private String pressure;//	当天每小时大气压强	1030

    public ZonedDateTime getTime() {
        return time;
    }

    public void setTime(ZonedDateTime time) {
        this.time = time;
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

    public String getPrecip() {
        return precip;
    }

    public void setPrecip(String precip) {
        this.precip = precip;
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

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }
}

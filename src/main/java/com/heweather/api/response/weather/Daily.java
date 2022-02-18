package com.heweather.api.response.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Daily {
    private String fxDate; //预报日期; //2013-05-31
    private String sunrise; //日出时间; //07:34
    private String sunset; //日落时间; //17:21
    private String moonrise; //月升时间; //16:09
    private String moonset; //月落时间; //04:21
    private String moonPhase; //月相名称; //满月
    private String tempMax; //预报当天最高温度; //4
    private String tempMin; //预报当天最低温度; //-5
    private String iconDay; //预报白天天气状况的图标代码，图标可通过天气状况和图标下载; //100
    private String textDay; //预报白天天气状况文字描述，包括阴晴雨雪等天气状态的描述; //晴
    private String iconNight; //预报夜间天气状况的图标代码，图标可通过天气状况和图标下载; //100
    private String textNight; //预报晚间天气状况文字描述，包括阴晴雨雪等天气状态的描述; //晴
    private String wind360Day; //预报白天风向360角度; //305
    private String windDirDay; //预报白天风向; //西北
    private String windScaleDay; //预报白天风力等级; //3-4
    private String windSpeedDay; //预报白天风速，公里/小时; //15
    private String wind360Night; //预报夜间风向360角度; //305
    private String WindDirNight; //预报夜间当天风向; //西北
    private String windScaleNight; //预报夜间风力等级; //3-4
    private String windSpeedNight; //预报夜间风速，公里/小时; //15
    private String humidity; //预报当天相对湿度，百分比数值; //40
    private String precip; //预报当天降水量，默认单位：毫米; //1.2
    private String pressure; //预报当天大气压强，默认单位：百帕; //1020
    private String vis; //预报当天能见度，默认单位：公里; //10
    private String cloud; //预报当天云量，百分比数值; //23
    private String uvIndex; //预报当天紫外线强度指数; //3
    private String moonPhaseIcon;//月相图标代码，图标可通过天气状况和图标下载


    public String getFxDate() {
        return fxDate;
    }

    public void setFxDate(String fxDate) {
        this.fxDate = fxDate;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getMoonrise() {
        return moonrise;
    }

    public void setMoonrise(String moonrise) {
        this.moonrise = moonrise;
    }

    public String getMoonset() {
        return moonset;
    }

    public void setMoonset(String moonset) {
        this.moonset = moonset;
    }

    public String getMoonPhase() {
        return moonPhase;
    }

    public void setMoonPhase(String moonPhase) {
        this.moonPhase = moonPhase;
    }

    public String getTempMax() {
        return tempMax;
    }

    public void setTempMax(String tempMax) {
        this.tempMax = tempMax;
    }

    public String getTempMin() {
        return tempMin;
    }

    public void setTempMin(String tempMin) {
        this.tempMin = tempMin;
    }

    public String getIconDay() {
        return iconDay;
    }

    public void setIconDay(String iconDay) {
        this.iconDay = iconDay;
    }

    public String getTextDay() {
        return textDay;
    }

    public void setTextDay(String textDay) {
        this.textDay = textDay;
    }

    public String getIconNight() {
        return iconNight;
    }

    public void setIconNight(String iconNight) {
        this.iconNight = iconNight;
    }

    public String getTextNight() {
        return textNight;
    }

    public void setTextNight(String textNight) {
        this.textNight = textNight;
    }

    public String getWind360Day() {
        return wind360Day;
    }

    public void setWind360Day(String wind360Day) {
        this.wind360Day = wind360Day;
    }

    public String getWindDirDay() {
        return windDirDay;
    }

    public void setWindDirDay(String windDirDay) {
        this.windDirDay = windDirDay;
    }

    public String getWindScaleDay() {
        return windScaleDay;
    }

    public void setWindScaleDay(String windScaleDay) {
        this.windScaleDay = windScaleDay;
    }

    public String getWindSpeedDay() {
        return windSpeedDay;
    }

    public void setWindSpeedDay(String windSpeedDay) {
        this.windSpeedDay = windSpeedDay;
    }

    public String getWind360Night() {
        return wind360Night;
    }

    public void setWind360Night(String wind360Night) {
        this.wind360Night = wind360Night;
    }

    public String getWindDirNight() {
        return WindDirNight;
    }

    public void setWindDirNight(String windDirNight) {
        WindDirNight = windDirNight;
    }

    public String getWindScaleNight() {
        return windScaleNight;
    }

    public void setWindScaleNight(String windScaleNight) {
        this.windScaleNight = windScaleNight;
    }

    public String getWindSpeedNight() {
        return windSpeedNight;
    }

    public void setWindSpeedNight(String windSpeedNight) {
        this.windSpeedNight = windSpeedNight;
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

    public String getVis() {
        return vis;
    }

    public void setVis(String vis) {
        this.vis = vis;
    }

    public String getCloud() {
        return cloud;
    }

    public void setCloud(String cloud) {
        this.cloud = cloud;
    }

    public String getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(String uvIndex) {
        this.uvIndex = uvIndex;
    }

    public String getMoonPhaseIcon() {
        return moonPhaseIcon;
    }

    public void setMoonPhaseIcon(String moonPhaseIcon) {
        this.moonPhaseIcon = moonPhaseIcon;
    }
}

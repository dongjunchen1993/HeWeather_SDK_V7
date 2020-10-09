package com.heweather.api.response.poi;

public class Daily {
    private String fxDate; //预报日期; //2013-05-31
    private String tempMax; //预报当天最高温度; //4
    private String tempMin; //预报当天最低温度; //-5
    private String iconDay; //预报白天天气状况的图标代码，图标可通过天气状况和图标下载; //100
    private String textDay; //预报白天天气状况文字描述，包括阴晴雨雪等天气状态的描述; //晴
    private String iconNight; //预报夜间天气状况的图标代码，图标可通过天气状况和图标下载; //100
    private String textNight; //预报晚间天气状况文字描述，包括阴晴雨雪等天气状态的描述; //晴
    private String windDirDay; //预报白天风向; //西北
    private String windScaleDay; //预报白天风力等级; //3-4
    private String WindDirNight; //预报夜间当天风向; //西北
    private String windScaleNight; //预报夜间风力等级; //3-4

    public String getFxDate() {
        return fxDate;
    }

    public void setFxDate(String fxDate) {
        this.fxDate = fxDate;
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
}

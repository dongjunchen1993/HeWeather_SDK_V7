package com.heweather.api.response.history;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.heweather.api.common.jackson.ZonedDatetimeDeserializer;

import java.time.ZonedDateTime;

public class AirHourly {

    @JsonDeserialize(using = ZonedDatetimeDeserializer.class)
    private ZonedDateTime pubTime;//	历史当天空气质量数据发布时间,格式yyyy-MM-dd HH:mm	2013-12-30T01:45+08:00
    private String aqi;//	当天每小时空气质量指数	74
    private String level;//	当天每小时空气质量指数等级	2
    private String category;//	当天每小时空气质量指数级别	良
    private String primary;//	当天每小时主要污染物	pm2.5
    private String pm10;//	当天每小时pm10	78
    private String pm2p5;//	当天每小时pm2.5	66
    private String no2;//	当天每小时二氧化氮	40
    private String so2;//	当天每小时二氧化硫	30
    private String co;//	当天每小时一氧化碳	33
    private String o3;//	当天每小时臭氧	20

    public ZonedDateTime getPubTime() {
        return pubTime;
    }

    public void setPubTime(ZonedDateTime pubTime) {
        this.pubTime = pubTime;
    }

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }

    public String getPm10() {
        return pm10;
    }

    public void setPm10(String pm10) {
        this.pm10 = pm10;
    }

    public String getPm2p5() {
        return pm2p5;
    }

    public void setPm2p5(String pm2p5) {
        this.pm2p5 = pm2p5;
    }

    public String getNo2() {
        return no2;
    }

    public void setNo2(String no2) {
        this.no2 = no2;
    }

    public String getSo2() {
        return so2;
    }

    public void setSo2(String so2) {
        this.so2 = so2;
    }

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co;
    }

    public String getO3() {
        return o3;
    }

    public void setO3(String o3) {
        this.o3 = o3;
    }
}

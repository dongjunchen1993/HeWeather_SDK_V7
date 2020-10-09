package com.heweather.api.response.air;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.heweather.api.common.jackson.ZonedDatetimeDeserializer;

import java.time.ZonedDateTime;

public class Station {

    @JsonDeserialize(using = ZonedDatetimeDeserializer.class)
    private ZonedDateTime pubTime;//	监测站实时空气质量数据发布时间，仅在国控站点的城市中返回。	2013-12-30T01:45+08:00
    private String name;//	监测站名称，仅在国控站点的城市中返回	万寿西宫
    private String id;//	监测站ID，仅在国控站点的城市中返回	CNA110000
    private String aqi;//	监测站实时空气质量指数，仅在国控站点的城市中返回	74
    private String level;//	监测站实时空气质量指数等级，仅在国控站点的城市中返回	2
    private String category;//	监测站实时空气质量指数级别，仅在国控站点的城市中返回	良
    private String primary;//	监测站实时主要污染物，仅在国控站点的城市中返回。空气质量为优时，返回值为NA	pm25
    private String pm10;//	监测站实时 pm10，仅在国控站点的城市中返回	78
    private String pm2p5;//	监测站实时 pm2.5，仅在国控站点的城市中返回	66
    private String no2;//	监测站实时 二氧化氮，仅在国控站点的城市中返回	40
    private String so2;//	监测站实时 二氧化硫，仅在国控站点的城市中返回	30
    private String co;//	监测站实时 一氧化碳，仅在国控站点的城市中返回	33
    private String o3;//	监测站实时 臭氧，仅在国控站点的城市中返回	20

    public ZonedDateTime getPubTime() {
        return pubTime;
    }

    public void setPubTime(ZonedDateTime pubTime) {
        this.pubTime = pubTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

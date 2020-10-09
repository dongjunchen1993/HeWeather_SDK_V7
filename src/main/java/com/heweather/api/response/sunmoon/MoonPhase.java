package com.heweather.api.response.sunmoon;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.heweather.api.common.jackson.ZonedDatetimeDeserializer;

import java.time.ZonedDateTime;

public class MoonPhase {

    @JsonDeserialize(using = ZonedDatetimeDeserializer.class)
    private ZonedDateTime fxTime;//	月相逐小时预报时间	2013-12-31T23:31+08:00
    private String value;//	月相数值	0.25
    private String name;//	月相名字	上弦月
    private String illumination;//月亮照明度，百分比数值	30

    public ZonedDateTime getFxTime() {
        return fxTime;
    }

    public void setFxTime(ZonedDateTime fxTime) {
        this.fxTime = fxTime;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIllumination() {
        return illumination;
    }

    public void setIllumination(String illumination) {
        this.illumination = illumination;
    }
}

package com.heweather.api.response.minutely;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.heweather.api.common.jackson.ZonedDatetimeDeserializer;

import java.time.ZonedDateTime;

/**
 * @author djc
 * @date 2020/03/17 18:32
 */
public class Pcpn5m {

    @JsonDeserialize(using = ZonedDatetimeDeserializer.class)
    private ZonedDateTime fxTime;
    private String precip;
    private String type;

    public ZonedDateTime getFxTime() {
        return fxTime;
    }

    public void setFxTime(ZonedDateTime fxTime) {
        this.fxTime = fxTime;
    }

    public String getPrecip() {
        return precip;
    }

    public void setPrecip(String precip) {
        this.precip = precip;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

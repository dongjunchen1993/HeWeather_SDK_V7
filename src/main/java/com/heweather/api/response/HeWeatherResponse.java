package com.heweather.api.response;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.heweather.api.common.StatusEnum;
import com.heweather.api.common.jackson.StatusDeserializer;
import com.heweather.api.common.jackson.ZonedDatetimeDeserializer;

import java.time.ZonedDateTime;

/**
 * 返回实体类
 *
 * @author djc
 */
public class HeWeatherResponse {

    @JsonDeserialize(using = StatusDeserializer.class)
    private StatusEnum code;
    @JsonDeserialize(using = ZonedDatetimeDeserializer.class)
    private ZonedDateTime updateTime;
    private String fxLink;
    private Refer refer;

    public HeWeatherResponse() {
    }

    public HeWeatherResponse(StatusEnum statusEnum) {
        this.code = statusEnum;
    }


    public StatusEnum getCode() {
        return code;
    }

    public void setCode(StatusEnum code) {
        this.code = code;
    }

    public ZonedDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(ZonedDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getFxLink() {
        return fxLink;
    }

    public void setFxLink(String fxLink) {
        this.fxLink = fxLink;
    }

    public Refer getRefer() {
        return refer;
    }

    public void setRefer(Refer refer) {
        this.refer = refer;
    }
}

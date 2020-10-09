package com.heweather.api.response;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.heweather.api.common.StatusEnum;
import com.heweather.api.common.jackson.StatusDeserializer;

/**
 * 城市信息搜索
 */
public class HeWeatherGeoResponse {

    @JsonDeserialize(using = StatusDeserializer.class)
    private StatusEnum code;
    private Refer refer;

    public HeWeatherGeoResponse() {
    }

    public HeWeatherGeoResponse(StatusEnum statusEnum) {
        this.code = statusEnum;
    }

    public StatusEnum getCode() {
        return code;
    }

    public void setCode(StatusEnum code) {
        this.code = code;
    }

    public Refer getRefer() {
        return refer;
    }

    public void setRefer(Refer refer) {
        this.refer = refer;
    }
}

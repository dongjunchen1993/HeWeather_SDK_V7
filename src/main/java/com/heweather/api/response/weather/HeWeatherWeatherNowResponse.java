package com.heweather.api.response.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.heweather.api.common.StatusEnum;
import com.heweather.api.response.HeWeatherResponse;

/**
 * 返回实体类
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HeWeatherWeatherNowResponse extends HeWeatherResponse {

    private Now now;

    public HeWeatherWeatherNowResponse() {
    }

    public HeWeatherWeatherNowResponse(StatusEnum statusEnum) {
        super(statusEnum);
    }

    public Now getNow() {
        return now;
    }

    public void setNow(Now now) {
        this.now = now;
    }
}

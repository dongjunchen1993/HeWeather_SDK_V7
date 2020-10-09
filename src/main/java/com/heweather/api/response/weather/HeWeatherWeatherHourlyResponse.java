package com.heweather.api.response.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.heweather.api.common.StatusEnum;
import com.heweather.api.response.HeWeatherResponse;

import java.util.List;

/**
 * 返回实体类
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HeWeatherWeatherHourlyResponse extends HeWeatherResponse {

    private List<Hourly> hourly;

    public HeWeatherWeatherHourlyResponse() {
    }

    public HeWeatherWeatherHourlyResponse(StatusEnum statusEnum) {
        super(statusEnum);
    }

    public List<Hourly> getHourly() {
        return hourly;
    }

    public void setHourly(List<Hourly> hourly) {
        this.hourly = hourly;
    }
}

package com.heweather.api.response.history;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.heweather.api.common.StatusEnum;
import com.heweather.api.response.HeWeatherResponse;

import java.util.List;

/**
 * 返回实体类
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HeWeatherHistoricalAirResponse extends HeWeatherResponse {

    private List<AirHourly> airHourly;

    public HeWeatherHistoricalAirResponse() {
    }

    public HeWeatherHistoricalAirResponse(StatusEnum statusEnum) {
        super(statusEnum);
    }

    public List<AirHourly> getAirHourly() {
        return airHourly;
    }

    public void setAirHourly(List<AirHourly> airHourly) {
        this.airHourly = airHourly;
    }
}

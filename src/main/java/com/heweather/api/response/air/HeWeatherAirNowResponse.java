package com.heweather.api.response.air;

import com.heweather.api.common.StatusEnum;
import com.heweather.api.response.HeWeatherResponse;

import java.util.List;

/**
 * 返回实体类
 */
public class HeWeatherAirNowResponse extends HeWeatherResponse {

    private Now now;
    private List<Station> station;

    public HeWeatherAirNowResponse() {
    }

    public HeWeatherAirNowResponse(StatusEnum statusEnum) {
        super(statusEnum);
    }

    public Now getNow() {
        return now;
    }

    public void setNow(Now now) {
        this.now = now;
    }

    public List<Station> getStation() {
        return station;
    }

    public void setStation(List<Station> station) {
        this.station = station;
    }
}

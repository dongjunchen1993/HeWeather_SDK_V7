package com.heweather.api.response.air;

import com.heweather.api.common.StatusEnum;
import com.heweather.api.response.HeWeatherResponse;

import java.util.List;

/**
 * 返回实体类
 */
public class HeWeatherAirDailyResponse extends HeWeatherResponse {

    private List<Daily> daily;

    public HeWeatherAirDailyResponse() {
    }

    public HeWeatherAirDailyResponse(StatusEnum statusEnum) {
        super(statusEnum);
    }

    public List<Daily> getDaily() {
        return daily;
    }

    public void setDaily(List<Daily> daily) {
        this.daily = daily;
    }
}

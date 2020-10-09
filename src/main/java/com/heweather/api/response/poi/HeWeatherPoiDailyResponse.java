package com.heweather.api.response.poi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.heweather.api.common.StatusEnum;
import com.heweather.api.response.HeWeatherResponse;

import java.util.List;

/**
 * 返回实体类
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HeWeatherPoiDailyResponse extends HeWeatherResponse {

    private List<Daily> daily;

    public HeWeatherPoiDailyResponse() {
    }

    public HeWeatherPoiDailyResponse(StatusEnum statusEnum) {
        super(statusEnum);
    }

    public List<Daily> getDaily() {
        return daily;
    }

    public void setDaily(List<Daily> daily) {
        this.daily = daily;
    }
}

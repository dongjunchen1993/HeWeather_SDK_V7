package com.heweather.api.response.history;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.heweather.api.common.StatusEnum;
import com.heweather.api.response.HeWeatherResponse;

import java.util.List;

/**
 * 返回实体类
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HeWeatherHistoricalWeatherResponse extends HeWeatherResponse {

    private WeatherDaily weatherDaily;
    private List<WeatherHourly> weatherHourly;

    public HeWeatherHistoricalWeatherResponse() {
    }

    public HeWeatherHistoricalWeatherResponse(StatusEnum statusEnum) {
        super(statusEnum);
    }

    public WeatherDaily getWeatherDaily() {
        return weatherDaily;
    }

    public void setWeatherDaily(WeatherDaily weatherDaily) {
        this.weatherDaily = weatherDaily;
    }

    public List<WeatherHourly> getWeatherHourly() {
        return weatherHourly;
    }

    public void setWeatherHourly(List<WeatherHourly> weatherHourly) {
        this.weatherHourly = weatherHourly;
    }
}

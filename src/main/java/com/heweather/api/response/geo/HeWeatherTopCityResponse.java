package com.heweather.api.response.geo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.heweather.api.common.StatusEnum;
import com.heweather.api.response.HeWeatherGeoResponse;

import java.util.List;

/**
 * @author djc
 * @date 2020-09-06 16:05:47
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HeWeatherTopCityResponse extends HeWeatherGeoResponse {

    private List<City> topCityList;

    public HeWeatherTopCityResponse() {
    }

    public HeWeatherTopCityResponse(StatusEnum statusEnum) {
        super(statusEnum);
    }

    public List<City> getTopCityList() {
        return topCityList;
    }

    public void setTopCityList(List<City> topCityList) {
        this.topCityList = topCityList;
    }
}

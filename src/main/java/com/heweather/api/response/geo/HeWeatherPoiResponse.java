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
public class HeWeatherPoiResponse extends HeWeatherGeoResponse {

    private List<City> poi;

    public HeWeatherPoiResponse() {
    }

    public HeWeatherPoiResponse(StatusEnum statusEnum) {
        super(statusEnum);
    }

    public List<City> getPoi() {
        return poi;
    }

    public void setPoi(List<City> poi) {
        this.poi = poi;
    }
}

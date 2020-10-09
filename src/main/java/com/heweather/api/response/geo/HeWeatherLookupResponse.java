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
public class HeWeatherLookupResponse extends HeWeatherGeoResponse {

    private List<City> location;

    public HeWeatherLookupResponse() {
    }

    public HeWeatherLookupResponse(StatusEnum statusEnum) {
        super(statusEnum);
    }

    public List<City> getLocation() {
        return location;
    }

    public void setLocation(List<City> location) {
        this.location = location;
    }
}

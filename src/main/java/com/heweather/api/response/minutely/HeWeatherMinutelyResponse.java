package com.heweather.api.response.minutely;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.heweather.api.common.StatusEnum;
import com.heweather.api.response.HeWeatherResponse;

import java.util.List;

/**
 * 返回实体类
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HeWeatherMinutelyResponse extends HeWeatherResponse {

    private String summary;
    private List<Pcpn5m> minutely;

    public HeWeatherMinutelyResponse() {
    }

    public HeWeatherMinutelyResponse(StatusEnum statusEnum) {
        super(statusEnum);
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<Pcpn5m> getMinutely() {
        return minutely;
    }

    public void setMinutely(List<Pcpn5m> minutely) {
        this.minutely = minutely;
    }
}

package com.heweather.api.response.warning;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.heweather.api.common.StatusEnum;
import com.heweather.api.response.HeWeatherResponse;

import java.util.List;

/**
 * 返回实体类
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HeWeatherWarningResponse extends HeWeatherResponse {

    private List<Warning> warning;

    public HeWeatherWarningResponse() {
    }

    public HeWeatherWarningResponse(StatusEnum statusEnum) {
        super(statusEnum);
    }

    public List<Warning> getWarning() {
        return warning;
    }

    public void setWarning(List<Warning> warning) {
        this.warning = warning;
    }
}

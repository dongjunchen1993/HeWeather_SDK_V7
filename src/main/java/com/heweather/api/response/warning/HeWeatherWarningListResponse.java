package com.heweather.api.response.warning;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.heweather.api.common.StatusEnum;
import com.heweather.api.response.HeWeatherResponse;

import java.util.List;

/**
 * 返回实体类
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HeWeatherWarningListResponse extends HeWeatherResponse {

    private List<WarningLoc> warningLocList;

    public HeWeatherWarningListResponse() {
    }

    public HeWeatherWarningListResponse(StatusEnum statusEnum) {
        super(statusEnum);
    }

    public List<WarningLoc> getWarningLocList() {
        return warningLocList;
    }

    public void setWarningLocList(List<WarningLoc> warningLocList) {
        this.warningLocList = warningLocList;
    }
}

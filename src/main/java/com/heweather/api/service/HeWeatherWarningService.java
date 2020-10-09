package com.heweather.api.service;

import com.heweather.api.common.WarningCountryEnum;
import com.heweather.api.common.LangEnum;
import com.heweather.api.response.warning.HeWeatherWarningListResponse;
import com.heweather.api.response.warning.HeWeatherWarningResponse;

/**
 * 天气灾害预警
 */
public interface HeWeatherWarningService {

    /**
     * 灾害预警
     */
    HeWeatherWarningResponse getWeatherWarning(String location, LangEnum langEnum);

    HeWeatherWarningResponse getWeatherWarning(String location);

    /**
     * 灾害预警城市列表
     */
    HeWeatherWarningListResponse getWarningList(WarningCountryEnum range);
}

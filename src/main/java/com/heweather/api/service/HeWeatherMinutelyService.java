package com.heweather.api.service;

import com.heweather.api.common.LangEnum;
import com.heweather.api.response.minutely.HeWeatherMinutelyResponse;

/**
 * 分钟级降水
 * add by djc
 */
public interface HeWeatherMinutelyService {

    /**
     * 分钟级降水
     */
    HeWeatherMinutelyResponse getMinutely(double longitude, double latitude, LangEnum langEnum);

    HeWeatherMinutelyResponse getMinutely(double longitude, double latitude);
}

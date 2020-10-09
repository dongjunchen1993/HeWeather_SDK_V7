package com.heweather.api.service;

import com.heweather.api.common.LangEnum;
import com.heweather.api.response.air.HeWeatherAirDailyResponse;
import com.heweather.api.response.air.HeWeatherAirNowResponse;

/**
 * 空气质量请求
 * add by djc
 */
public interface HeWeatherAirService {

    /**
     * 空气质量实况
     */
    HeWeatherAirNowResponse getAirNow(String location, LangEnum langEnum);

    /**
     * 空气质量实况
     */
    HeWeatherAirNowResponse getAirNow(String location);

    HeWeatherAirDailyResponse getAir5d(String location, LangEnum langEnum);

    HeWeatherAirDailyResponse getAir5d(String location);
}

package com.heweather.api.service;

import com.heweather.api.common.LangEnum;
import com.heweather.api.response.weather.HeWeatherWeatherDailyResponse;
import com.heweather.api.response.weather.HeWeatherWeatherHourlyResponse;
import com.heweather.api.response.weather.HeWeatherWeatherNowResponse;

/**
 * 天气预报和实况
 * add by djc
 */
public interface HeWeatherWeatherService {

    /**
     * 实况天气
     */
    HeWeatherWeatherNowResponse getWeatherNow(String location, LangEnum langEnum);

    HeWeatherWeatherNowResponse getWeatherNow(String location);

    /**
     * 3天预报
     */
    HeWeatherWeatherDailyResponse getWeather3d(String location, LangEnum langEnum);

    HeWeatherWeatherDailyResponse getWeather3d(String location);

    /**
     * 7天预报
     */
    HeWeatherWeatherDailyResponse getWeather7d(String location, LangEnum langEnum);

    HeWeatherWeatherDailyResponse getWeather7d(String location);

    /**
     * 10天预报
     */
    HeWeatherWeatherDailyResponse getWeather10d(String location, LangEnum langEnum);

    HeWeatherWeatherDailyResponse getWeather10d(String location);

    /**
     * 15天预报
     */
    HeWeatherWeatherDailyResponse getWeather15d(String location, LangEnum langEnum);

    HeWeatherWeatherDailyResponse getWeather15d(String location);

    /**
     * 24小时预报
     */
    HeWeatherWeatherHourlyResponse getWeather24h(String location, LangEnum langEnum);

    HeWeatherWeatherHourlyResponse getWeather24h(String location);

    /**
     * 72小时预报
     */
    HeWeatherWeatherHourlyResponse getWeather72h(String location, LangEnum langEnum);

    HeWeatherWeatherHourlyResponse getWeather72h(String location);

    /**
     * 16小时预报
     */
    HeWeatherWeatherHourlyResponse getWeather168h(String location, LangEnum langEnum);

    HeWeatherWeatherHourlyResponse getWeather168h(String location);


}

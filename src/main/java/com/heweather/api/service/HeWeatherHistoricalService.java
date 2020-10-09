package com.heweather.api.service;

import com.heweather.api.common.LangEnum;
import com.heweather.api.common.UnitEnum;
import com.heweather.api.response.history.HeWeatherHistoricalAirResponse;
import com.heweather.api.response.history.HeWeatherHistoricalWeatherResponse;

import java.time.LocalDate;

/**
 * 历史天气和空气质量
 * add by djc
 */
public interface HeWeatherHistoricalService {

    HeWeatherHistoricalWeatherResponse getHistoricalWeather(String location, LocalDate date, LangEnum langEnum, UnitEnum unitEnum);

    HeWeatherHistoricalWeatherResponse getHistoricalWeather(String location, LocalDate date);

    HeWeatherHistoricalAirResponse getHistoricalAir(String location, LocalDate date, LangEnum langEnum, UnitEnum unitEnum);

    HeWeatherHistoricalAirResponse getHistoricalAir(String location, LocalDate date);
}

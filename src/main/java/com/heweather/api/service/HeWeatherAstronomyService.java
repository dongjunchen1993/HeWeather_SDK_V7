package com.heweather.api.service;

import com.heweather.api.common.LangEnum;
import com.heweather.api.response.sunmoon.HeWeatherSunMoonResponse;

import java.time.LocalDate;

/**
 * 太阳和月亮
 */
public interface HeWeatherAstronomyService {

    HeWeatherSunMoonResponse getSunmoon(String location, LocalDate date);

    HeWeatherSunMoonResponse getSunmoon(String location, LocalDate date, LangEnum langEnum);
}

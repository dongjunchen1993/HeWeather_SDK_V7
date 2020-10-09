package com.heweather.api.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import com.heweather.api.common.ApiEnum;
import com.heweather.api.common.LangEnum;
import com.heweather.api.common.StatusEnum;
import com.heweather.api.response.sunmoon.HeWeatherSunMoonResponse;
import com.heweather.api.service.HeWeatherAstronomyService;
import com.heweather.api.service.HeWeatherBaseService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

/**
 * 太阳和月亮请求处理
 */
public class HeWeatherAstronomyServiceImpl extends HeWeatherBaseService implements HeWeatherAstronomyService {

    private final ObjectMapper objectMapper;

    public HeWeatherAstronomyServiceImpl() {
        this.objectMapper = new ObjectMapper();
    }

    public HeWeatherAstronomyServiceImpl(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public HeWeatherSunMoonResponse getSunmoon(String location, LocalDate date) {
        return getSunmoon(location, date, LangEnum.ZH);
    }

    @Override
    public HeWeatherSunMoonResponse getSunmoon(String location, LocalDate date, LangEnum langEnum) {
        if (Strings.isNullOrEmpty(location) || date == null) {
            return new HeWeatherSunMoonResponse(StatusEnum.PARAMETER_INVALID);
        }
        if (keyInvalid()) {
            return new HeWeatherSunMoonResponse(StatusEnum.KEY_INVALID);
        }
        HashMap<String, String> paramMap = new HashMap<>(7);
        paramMap.put("location", location);
        paramMap.put("lang", langEnum.getLang());
        paramMap.put("date", date.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
        String response = getResponse(getPath(ApiEnum.SUN_MOON), getRequestParam(paramMap));
        try {
            return this.objectMapper.readValue(response, HeWeatherSunMoonResponse.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}

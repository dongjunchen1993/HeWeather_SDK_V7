package com.heweather.api.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import com.heweather.api.common.ApiEnum;
import com.heweather.api.common.LangEnum;
import com.heweather.api.common.StatusEnum;
import com.heweather.api.common.UnitEnum;
import com.heweather.api.response.history.HeWeatherHistoricalAirResponse;
import com.heweather.api.response.history.HeWeatherHistoricalWeatherResponse;
import com.heweather.api.service.HeWeatherBaseService;
import com.heweather.api.service.HeWeatherHistoricalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

/**
 * 历史天气空气请求处理
 */
public class HeWeatherHistoricalServiceImpl extends HeWeatherBaseService implements HeWeatherHistoricalService {

    private final ObjectMapper objectMapper;

    public HeWeatherHistoricalServiceImpl() {
        this.objectMapper = new ObjectMapper();
    }

    public HeWeatherHistoricalServiceImpl(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public HeWeatherHistoricalWeatherResponse getHistoricalWeather(String location, LocalDate date, LangEnum langEnum, UnitEnum unitEnum) {
        if (Strings.isNullOrEmpty(location) || date == null || langEnum == null || unitEnum == null) {
            return new HeWeatherHistoricalWeatherResponse(StatusEnum.PARAMETER_INVALID);
        }
        if (keyInvalid()) {
            return new HeWeatherHistoricalWeatherResponse(StatusEnum.KEY_INVALID);
        }
        HashMap<String, String> paramMap = new HashMap<>(7);
        paramMap.put("location", location);
        paramMap.put("date", date.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
        paramMap.put("lang", langEnum.getLang());
        paramMap.put("unit", unitEnum.getUnit());
        String response = getResponse(getPath(ApiEnum.HISTORICAL_WEATHER), getRequestParam(paramMap));
        try {
            return this.objectMapper.readValue(response, HeWeatherHistoricalWeatherResponse.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public HeWeatherHistoricalWeatherResponse getHistoricalWeather(String location, LocalDate date) {
        return getHistoricalWeather(location, date, LangEnum.ZH, UnitEnum.METRIC);
    }

    @Override
    public HeWeatherHistoricalAirResponse getHistoricalAir(String location, LocalDate date, LangEnum langEnum, UnitEnum unitEnum) {
        if (Strings.isNullOrEmpty(location) || date == null || langEnum == null || unitEnum == null) {
            return new HeWeatherHistoricalAirResponse(StatusEnum.PARAMETER_INVALID);
        }
        if (keyInvalid()) {
            return new HeWeatherHistoricalAirResponse(StatusEnum.KEY_INVALID);
        }
        HashMap<String, String> paramMap = new HashMap<>(7);
        paramMap.put("location", location);
        paramMap.put("date", date.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
        paramMap.put("lang", langEnum.getLang());
        paramMap.put("unit", unitEnum.getUnit());
        String response = getResponse(getPath(ApiEnum.HISTORICAL_AIR), getRequestParam(paramMap));
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(response, HeWeatherHistoricalAirResponse.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public HeWeatherHistoricalAirResponse getHistoricalAir(String location, LocalDate date) {
        return getHistoricalAir(location, date, LangEnum.ZH, UnitEnum.METRIC);
    }

}

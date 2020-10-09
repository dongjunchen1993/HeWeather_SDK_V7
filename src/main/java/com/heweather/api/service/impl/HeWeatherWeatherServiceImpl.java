package com.heweather.api.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import com.google.common.collect.Multimap;
import com.heweather.api.common.ApiEnum;
import com.heweather.api.common.LangEnum;
import com.heweather.api.common.StatusEnum;
import com.heweather.api.response.weather.HeWeatherWeatherDailyResponse;
import com.heweather.api.response.weather.HeWeatherWeatherHourlyResponse;
import com.heweather.api.response.weather.HeWeatherWeatherNowResponse;
import com.heweather.api.service.HeWeatherBaseService;
import com.heweather.api.service.HeWeatherWeatherService;
import com.heweather.util.HttpUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * 天气预报和实况
 */
public class HeWeatherWeatherServiceImpl extends HeWeatherBaseService implements HeWeatherWeatherService {

    private final ObjectMapper objectMapper;

    public HeWeatherWeatherServiceImpl() {
        this.objectMapper = new ObjectMapper();
    }

    public HeWeatherWeatherServiceImpl(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public HeWeatherWeatherNowResponse getWeatherNow(String location, LangEnum langEnum) {
        if (Strings.isNullOrEmpty(location)) {
            return new HeWeatherWeatherNowResponse(StatusEnum.PARAMETER_INVALID);
        }
        if (keyInvalid()) {
            return new HeWeatherWeatherNowResponse(StatusEnum.KEY_INVALID);
        }
        Map<String, String> paramMap = new HashMap<>(6);
        paramMap.put("location", location);
        paramMap.put("lang", langEnum.getLang());
        String response = getResponse(getPath(ApiEnum.WEATHER_NOW), getRequestParam(paramMap));
        try {
            return this.objectMapper.readValue(response, HeWeatherWeatherNowResponse.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public HeWeatherWeatherNowResponse getWeatherNow(String location) {
        return getWeatherNow(location, LangEnum.ZH);
    }

    public HeWeatherWeatherDailyResponse getWeatherDaily(String location, ApiEnum apiEnum, LangEnum langEnum) {
        if (Strings.isNullOrEmpty(location)) {
            return new HeWeatherWeatherDailyResponse(StatusEnum.PARAMETER_INVALID);
        }
        if (keyInvalid()) {
            return new HeWeatherWeatherDailyResponse(StatusEnum.KEY_INVALID);
        }
        String path = getPath(apiEnum);
        Map<String, String> paramMap = new HashMap<>(6);
        paramMap.put("location", location);
        paramMap.put("lang", langEnum.getLang());

        Multimap<String, String> requestParam = getRequestParam(paramMap);
        String response = HttpUtil.get(path, requestParam);
        try {
            return this.objectMapper.readValue(response, HeWeatherWeatherDailyResponse.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public HeWeatherWeatherDailyResponse getWeather3d(String location, LangEnum langEnum) {
        return getWeatherDaily(location, ApiEnum.WEATHER_3D, langEnum);
    }

    @Override
    public HeWeatherWeatherDailyResponse getWeather3d(String location) {
        return getWeatherDaily(location, ApiEnum.WEATHER_3D, LangEnum.ZH);
    }

    @Override
    public HeWeatherWeatherDailyResponse getWeather7d(String location, LangEnum langEnum) {
        return getWeatherDaily(location, ApiEnum.WEATHER_7D, langEnum);
    }

    @Override
    public HeWeatherWeatherDailyResponse getWeather7d(String location) {
        return getWeatherDaily(location, ApiEnum.WEATHER_7D, LangEnum.ZH);
    }

    @Override
    public HeWeatherWeatherDailyResponse getWeather10d(String location, LangEnum langEnum) {
        return getWeatherDaily(location, ApiEnum.WEATHER_10D, langEnum);
    }

    @Override
    public HeWeatherWeatherDailyResponse getWeather10d(String location) {
        return getWeatherDaily(location, ApiEnum.WEATHER_10D, LangEnum.ZH);
    }

    @Override
    public HeWeatherWeatherDailyResponse getWeather15d(String location, LangEnum langEnum) {
        return getWeatherDaily(location, ApiEnum.WEATHER_15D, langEnum);
    }

    @Override
    public HeWeatherWeatherDailyResponse getWeather15d(String location) {
        return getWeatherDaily(location, ApiEnum.WEATHER_15D, LangEnum.ZH);
    }

    public HeWeatherWeatherHourlyResponse getWeatherHourly(String location, ApiEnum apiEnum, LangEnum langEnum) {
        if (Strings.isNullOrEmpty(location)) {
            return new HeWeatherWeatherHourlyResponse(StatusEnum.PARAMETER_INVALID);
        }
        if (keyInvalid()) {
            return new HeWeatherWeatherHourlyResponse(StatusEnum.KEY_INVALID);
        }
        Map<String, String> paramMap = new HashMap<>(6);
        paramMap.put("location", location);
        paramMap.put("lang", langEnum.getLang());
        String response = getResponse(getPath(apiEnum), getRequestParam(paramMap));
        try {
            return this.objectMapper.readValue(response, HeWeatherWeatherHourlyResponse.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public HeWeatherWeatherHourlyResponse getWeather24h(String location, LangEnum langEnum) {
        return getWeatherHourly(location, ApiEnum.WEATHER_24H, langEnum);
    }

    @Override
    public HeWeatherWeatherHourlyResponse getWeather24h(String location) {
        return getWeatherHourly(location, ApiEnum.WEATHER_24H, LangEnum.ZH);
    }

    @Override
    public HeWeatherWeatherHourlyResponse getWeather72h(String location, LangEnum langEnum) {
        return getWeatherHourly(location, ApiEnum.WEATHER_72H, langEnum);
    }

    @Override
    public HeWeatherWeatherHourlyResponse getWeather72h(String location) {
        return getWeatherHourly(location, ApiEnum.WEATHER_72H, LangEnum.ZH);
    }

    @Override
    public HeWeatherWeatherHourlyResponse getWeather168h(String location, LangEnum langEnum) {
        return getWeatherHourly(location, ApiEnum.WEATHER_168H, langEnum);
    }

    @Override
    public HeWeatherWeatherHourlyResponse getWeather168h(String location) {
        return getWeatherHourly(location, ApiEnum.WEATHER_168H, LangEnum.ZH);
    }

}

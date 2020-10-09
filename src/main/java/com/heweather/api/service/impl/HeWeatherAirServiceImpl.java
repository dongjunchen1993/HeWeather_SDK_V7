package com.heweather.api.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import com.heweather.api.common.ApiEnum;
import com.heweather.api.common.LangEnum;
import com.heweather.api.common.StatusEnum;
import com.heweather.api.response.air.HeWeatherAirDailyResponse;
import com.heweather.api.response.air.HeWeatherAirNowResponse;
import com.heweather.api.service.HeWeatherAirService;
import com.heweather.api.service.HeWeatherBaseService;

import java.util.HashMap;
import java.util.Map;

/**
 * @author djc
 */
public class HeWeatherAirServiceImpl extends HeWeatherBaseService implements HeWeatherAirService {

    private final ObjectMapper objectMapper;

    public HeWeatherAirServiceImpl() {
        this.objectMapper = new ObjectMapper();
    }

    public HeWeatherAirServiceImpl(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public HeWeatherAirNowResponse getAirNow(String location, LangEnum langEnum) {
        if (Strings.isNullOrEmpty(location) && langEnum == null) {
            return new HeWeatherAirNowResponse(StatusEnum.PARAMETER_INVALID);
        }
        if (keyInvalid()) {
            return new HeWeatherAirNowResponse(StatusEnum.KEY_INVALID);
        }
        Map<String, String> map = new HashMap<>(6);
        map.put("location", location);
        map.put("lang", langEnum.getLang());
        String response = getResponse(getPath(ApiEnum.AIR_NOW), getRequestParam(map));
        try {
            return this.objectMapper.readValue(response, HeWeatherAirNowResponse.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public HeWeatherAirNowResponse getAirNow(String location) {
        return getAirNow(location, LangEnum.ZH);
    }

    @Override
    public HeWeatherAirDailyResponse getAir5d(String location, LangEnum langEnum) {
        if (Strings.isNullOrEmpty(location)) {
            return new HeWeatherAirDailyResponse(StatusEnum.PARAMETER_INVALID);
        }
        if (keyInvalid()) {
            return new HeWeatherAirDailyResponse(StatusEnum.KEY_INVALID);
        }
        Map<String, String> map = new HashMap<>(6);
        map.put("location", location);
        map.put("lang", langEnum.getLang());
        String response = getResponse(getPath(ApiEnum.AIR_DAILY_5D), getRequestParam(map));
        try {
            return this.objectMapper.readValue(response, HeWeatherAirDailyResponse.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public HeWeatherAirDailyResponse getAir5d(String location) {
        return getAir5d(location, LangEnum.ZH);
    }
}

package com.heweather.api.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import com.heweather.api.common.ApiEnum;
import com.heweather.api.common.LangEnum;
import com.heweather.api.common.StatusEnum;
import com.heweather.api.common.WarningCountryEnum;
import com.heweather.api.response.warning.HeWeatherWarningListResponse;
import com.heweather.api.response.warning.HeWeatherWarningResponse;
import com.heweather.api.service.HeWeatherBaseService;
import com.heweather.api.service.HeWeatherWarningService;

import java.util.HashMap;
import java.util.Map;

public class HeWeatherWarningServiceImpl extends HeWeatherBaseService implements HeWeatherWarningService {

    private final ObjectMapper objectMapper;

    public HeWeatherWarningServiceImpl() {
        this.objectMapper = new ObjectMapper();
    }

    public HeWeatherWarningServiceImpl(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public HeWeatherWarningResponse getWeatherWarning(String location, LangEnum langEnum) {
        if (Strings.isNullOrEmpty(location)) {
            return new HeWeatherWarningResponse(StatusEnum.PARAMETER_INVALID);
        }
        if (keyInvalid()) {
            return new HeWeatherWarningResponse(StatusEnum.KEY_INVALID);
        }
        Map<String, String> paramMap = new HashMap<>(6);
        paramMap.put("location", location);
        paramMap.put("lang", langEnum.getLang());
        String response = getResponse(getPath(ApiEnum.WANING), getRequestParam(paramMap));
        try {
            return this.objectMapper.readValue(response, HeWeatherWarningResponse.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public HeWeatherWarningResponse getWeatherWarning(String location) {
        return getWeatherWarning(location, LangEnum.ZH);
    }

    @Override
    public HeWeatherWarningListResponse getWarningList(WarningCountryEnum range) {
        if (range == null) {
            return new HeWeatherWarningListResponse(StatusEnum.PARAMETER_INVALID);
        }
        if (keyInvalid()) {
            return new HeWeatherWarningListResponse(StatusEnum.KEY_INVALID);
        }
        Map<String, String> paramMap = new HashMap<>(5);
        paramMap.put("range", range.getCountry());
        String response = getResponse(getPath(ApiEnum.WANING_LIST), getRequestParam(paramMap));
        try {
            return this.objectMapper.readValue(response, HeWeatherWarningListResponse.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}

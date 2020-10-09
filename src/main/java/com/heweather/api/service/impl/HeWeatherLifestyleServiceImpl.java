package com.heweather.api.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import com.heweather.api.common.ApiEnum;
import com.heweather.api.common.LangEnum;
import com.heweather.api.common.StatusEnum;
import com.heweather.api.response.indices.HeWeatherLifestyleResponse;
import com.heweather.api.service.HeWeatherBaseService;
import com.heweather.api.service.HeWeatherLifestyleService;

import java.util.HashMap;
import java.util.Map;

/**
 * 天气灾害预警请求处理
 */
public class HeWeatherLifestyleServiceImpl extends HeWeatherBaseService implements HeWeatherLifestyleService {

    private final ObjectMapper objectMapper;

    public HeWeatherLifestyleServiceImpl() {
        this.objectMapper = new ObjectMapper();
    }

    public HeWeatherLifestyleServiceImpl(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public HeWeatherLifestyleResponse getLifestyle(String location, String type, LangEnum langEnum) {
        if (Strings.isNullOrEmpty(location) || Strings.isNullOrEmpty(type)) {
            return new HeWeatherLifestyleResponse(StatusEnum.PARAMETER_INVALID);
        }
        if (keyInvalid()) {
            return new HeWeatherLifestyleResponse(StatusEnum.KEY_INVALID);
        }
        Map<String, String> paramMap = new HashMap<>(6);
        paramMap.put("location", location);
        paramMap.put("type", type);
        paramMap.put("lang", langEnum.getLang());
        String response = getResponse(getPath(ApiEnum.LIFESTYLE_1D), getRequestParam(paramMap));
        try {
            return this.objectMapper.readValue(response, HeWeatherLifestyleResponse.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public HeWeatherLifestyleResponse getLifestyle(String location, String type) {
        return getLifestyle(location, type, LangEnum.ZH);
    }

    @Override
    public HeWeatherLifestyleResponse getLifestyle3d(String location, String type, LangEnum langEnum) {
        if (Strings.isNullOrEmpty(location) || Strings.isNullOrEmpty(type)) {
            return new HeWeatherLifestyleResponse(StatusEnum.PARAMETER_INVALID);
        }
        if (keyInvalid()) {
            return new HeWeatherLifestyleResponse(StatusEnum.KEY_INVALID);
        }
        Map<String, String> paramMap = new HashMap<>(6);
        paramMap.put("location", location);
        paramMap.put("type", type);
        paramMap.put("lang", langEnum.getLang());
        String response = getResponse(getPath(ApiEnum.LIFESTYLE_3D), getRequestParam(paramMap));
        try {
            return this.objectMapper.readValue(response, HeWeatherLifestyleResponse.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public HeWeatherLifestyleResponse getLifestyle3d(String location, String type) {
        return getLifestyle3d(location, type, LangEnum.ZH);
    }
}

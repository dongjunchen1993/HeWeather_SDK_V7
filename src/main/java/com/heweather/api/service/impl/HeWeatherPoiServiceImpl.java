package com.heweather.api.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import com.heweather.api.common.ApiEnum;
import com.heweather.api.common.LangEnum;
import com.heweather.api.common.StatusEnum;
import com.heweather.api.common.UnitEnum;
import com.heweather.api.response.poi.HeWeatherPoiDailyResponse;
import com.heweather.api.response.poi.HeWeatherPoiNowResponse;
import com.heweather.api.service.HeWeatherBaseService;
import com.heweather.api.service.HeWeatherPoiService;

import java.util.HashMap;
import java.util.Map;

/**
 * 中国景点天气预报请求处理
 */
public class HeWeatherPoiServiceImpl extends HeWeatherBaseService implements HeWeatherPoiService {

    private final ObjectMapper objectMapper;

    public HeWeatherPoiServiceImpl() {
        this.objectMapper = new ObjectMapper();
    }

    public HeWeatherPoiServiceImpl(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public HeWeatherPoiNowResponse getPoiNow(String location, LangEnum langEnum, UnitEnum unitEnum) {
        if (Strings.isNullOrEmpty(location) || langEnum == null || unitEnum == null) {
            return new HeWeatherPoiNowResponse(StatusEnum.PARAMETER_INVALID);
        }
        if (keyInvalid()) {
            return new HeWeatherPoiNowResponse(StatusEnum.KEY_INVALID);
        }
        Map<String, String> map = new HashMap<>(6);
        map.put("location", location);
        map.put("lang", langEnum.getLang());
        map.put("unit", unitEnum.getUnit());
        String response = getResponse(getPath(ApiEnum.WEATHER_POI_NOW), getRequestParam(map));
        try {
            return this.objectMapper.readValue(response, HeWeatherPoiNowResponse.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public HeWeatherPoiNowResponse getPoiNow(String location) {
        return getPoiNow(location, LangEnum.ZH, UnitEnum.METRIC);
    }

    @Override
    public HeWeatherPoiDailyResponse getPoi7d(String location, LangEnum langEnum, UnitEnum unitEnum) {
        if (Strings.isNullOrEmpty(location) || langEnum == null || unitEnum == null) {
            return new HeWeatherPoiDailyResponse(StatusEnum.PARAMETER_INVALID);
        }
        if (keyInvalid()) {
            return new HeWeatherPoiDailyResponse(StatusEnum.KEY_INVALID);
        }
        Map<String, String> map = new HashMap<>(6);
        map.put("location", location);
        map.put("lang", langEnum.getLang());
        map.put("unit", unitEnum.getUnit());
        String response = getResponse(getPath(ApiEnum.WEATHER_POI_7D), getRequestParam(map));
        try {
            return this.objectMapper.readValue(response, HeWeatherPoiDailyResponse.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public HeWeatherPoiDailyResponse getPoi7d(String location) {
        return getPoi7d(location, LangEnum.ZH, UnitEnum.METRIC);
    }

}

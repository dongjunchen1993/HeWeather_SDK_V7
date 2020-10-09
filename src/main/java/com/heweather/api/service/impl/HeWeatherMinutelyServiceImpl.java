package com.heweather.api.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.heweather.api.common.ApiEnum;
import com.heweather.api.common.LangEnum;
import com.heweather.api.common.StatusEnum;
import com.heweather.api.response.minutely.HeWeatherMinutelyResponse;
import com.heweather.api.service.HeWeatherBaseService;
import com.heweather.api.service.HeWeatherMinutelyService;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * 分钟级降水
 */
public class HeWeatherMinutelyServiceImpl extends HeWeatherBaseService implements HeWeatherMinutelyService {

    private final ObjectMapper objectMapper;

    public HeWeatherMinutelyServiceImpl() {
        this.objectMapper = new ObjectMapper();
    }

    public HeWeatherMinutelyServiceImpl(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public HeWeatherMinutelyResponse getMinutely(double longitude, double latitude, LangEnum langEnum) {
        if (keyInvalid()) {
            return new HeWeatherMinutelyResponse(StatusEnum.KEY_INVALID);
        }
        Map<String, String> paramMap = new HashMap<>(6);
        paramMap.put("location", BigDecimal.valueOf(longitude).setScale(6, BigDecimal.ROUND_HALF_UP).toString() + "," + BigDecimal.valueOf(latitude).setScale(6, BigDecimal.ROUND_HALF_UP).toString());
        paramMap.put("lang", langEnum.getLang());
        String response = getResponse(getPath(ApiEnum.MINUTELY), getRequestParam(paramMap));
        try {
            return this.objectMapper.readValue(response, HeWeatherMinutelyResponse.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public HeWeatherMinutelyResponse getMinutely(double longitude, double latitude) {
        return getMinutely(longitude, latitude, LangEnum.ZH);
    }

}

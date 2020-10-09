package com.heweather.api.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import com.heweather.api.common.ApiEnum;
import com.heweather.api.common.LangEnum;
import com.heweather.api.common.PoiTypeEnum;
import com.heweather.api.common.StatusEnum;
import com.heweather.api.response.geo.HeWeatherLookupResponse;
import com.heweather.api.response.geo.HeWeatherPoiResponse;
import com.heweather.api.response.geo.HeWeatherTopCityResponse;
import com.heweather.api.service.HeWeatherBaseService;
import com.heweather.api.service.HeWeatherLocationService;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * 城市信息搜索请求处理
 */

public class HeWeatherLocationServiceImpl extends HeWeatherBaseService implements HeWeatherLocationService {

    private final ObjectMapper objectMapper;

    public HeWeatherLocationServiceImpl() {
        this.objectMapper = new ObjectMapper();
    }

    public HeWeatherLocationServiceImpl(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public HeWeatherLookupResponse getLocation(String location, String adm, String range, int number, LangEnum langEnum) {
        if (Strings.isNullOrEmpty(location) || Strings.isNullOrEmpty(range) || number < 1 || number > 20) {
            return new HeWeatherLookupResponse(StatusEnum.PARAMETER_INVALID);
        }
        if (keyInvalid()) {
            return new HeWeatherLookupResponse(StatusEnum.KEY_INVALID);
        }
        Map<String, String> paramMap = new HashMap<>(8);
        paramMap.put("location", location);
        if (!Strings.isNullOrEmpty(adm)) {
            paramMap.put("adm", adm);
        }
        paramMap.put("range", range);
        paramMap.put("number", String.valueOf(number));
        paramMap.put("lang", langEnum.getLang());
        String response = getResponse(getGeoPath(ApiEnum.GEO_CITY_LOOKUP), getRequestParam(paramMap));
        try {
            return this.objectMapper.readValue(response, HeWeatherLookupResponse.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public HeWeatherLookupResponse getLocation(String location, LangEnum langEnum) {
        return getLocation(location, null, "world", 10, langEnum);
    }

    @Override
    public HeWeatherLookupResponse getLocation(String location) {
        return getLocation(location, null, "world", 10, LangEnum.ZH);
    }

    @Override
    public HeWeatherTopCityResponse getTopCity(String range, int number, LangEnum langEnum) {
        if (Strings.isNullOrEmpty(range) || number < 1 || number > 20 || langEnum == null) {
            return new HeWeatherTopCityResponse(StatusEnum.PARAMETER_INVALID);
        }
        if (keyInvalid()) {
            return new HeWeatherTopCityResponse(StatusEnum.KEY_INVALID);
        }
        Map<String, String> paramMap = new HashMap<>(6);
        paramMap.put("range", range);
        paramMap.put("number", String.valueOf(number));
        paramMap.put("lang", langEnum.getLang());
        String response = getResponse(getGeoPath(ApiEnum.GEO_CITY_TOP), getRequestParam(paramMap));
        try {
            return this.objectMapper.readValue(response, HeWeatherTopCityResponse.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public HeWeatherTopCityResponse getTopCity(int number, LangEnum langEnum) {
        return getTopCity("world", number, langEnum);
    }

    @Override
    public HeWeatherTopCityResponse getTopCity(int number) {
        return getTopCity("world", number, LangEnum.ZH);
    }

    @Override
    public HeWeatherTopCityResponse getTopCity() {
        return getTopCity("world", 10, LangEnum.ZH);
    }


    @Override
    public HeWeatherPoiResponse getPoi(String location, PoiTypeEnum poiTypeEnum, String city, int number, LangEnum langEnum) {
        if (Strings.isNullOrEmpty(location) || poiTypeEnum == null || number < 1 || number > 20 || langEnum == null) {
            return new HeWeatherPoiResponse(StatusEnum.PARAMETER_INVALID);
        }
        if (keyInvalid()) {
            return new HeWeatherPoiResponse(StatusEnum.KEY_INVALID);
        }
        Map<String, String> paramMap = new HashMap<>(7);
        paramMap.put("location", location);
        paramMap.put("type", poiTypeEnum.getType());
        if (!Strings.isNullOrEmpty(city)) {
            paramMap.put("city", city);
        }
        paramMap.put("number", String.valueOf(number));
        paramMap.put("lang", langEnum.getLang());
        String response = getResponse(getGeoPath(ApiEnum.GEO_POI_LOOKUP), getRequestParam(paramMap));
        try {
            return this.objectMapper.readValue(response, HeWeatherPoiResponse.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public HeWeatherPoiResponse getPoi(String location, PoiTypeEnum poiTypeEnum, int number, LangEnum langEnum) {
        return getPoi(location, poiTypeEnum, "", number, langEnum);
    }

    @Override
    public HeWeatherPoiResponse getPoi(String location, PoiTypeEnum poiTypeEnum, int number) {
        return getPoi(location, poiTypeEnum, "", number, LangEnum.ZH);
    }

    @Override
    public HeWeatherPoiResponse getPoi(String location, PoiTypeEnum poiTypeEnum) {
        return getPoi(location, poiTypeEnum, "", 10, LangEnum.ZH);
    }

    @Override
    public HeWeatherPoiResponse getPoiRange(double longitude, double latitude, PoiTypeEnum poiTypeEnum, int radius, int number, LangEnum langEnum) {
        if (poiTypeEnum == null || radius < 1 || radius > 50 || number < 1 || number > 20 || langEnum == null) {
            return new HeWeatherPoiResponse(StatusEnum.PARAMETER_INVALID);
        }
        if (keyInvalid()) {
            return new HeWeatherPoiResponse(StatusEnum.KEY_INVALID);
        }
        Map<String, String> paramMap = new HashMap<>(7);
        paramMap.put("location", BigDecimal.valueOf(longitude).setScale(6, BigDecimal.ROUND_HALF_UP).toString() + "," + BigDecimal.valueOf(latitude).setScale(6, BigDecimal.ROUND_HALF_UP).toString());
        paramMap.put("type", poiTypeEnum.getType());
        paramMap.put("radius", String.valueOf(radius));
        paramMap.put("number", String.valueOf(number));
        paramMap.put("lang", langEnum.getLang());
        String response = getResponse(getGeoPath(ApiEnum.GEO_POI_RANGE), getRequestParam(paramMap));
        try {
            return this.objectMapper.readValue(response, HeWeatherPoiResponse.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public HeWeatherPoiResponse getPoiRange(double longitude, double latitude, PoiTypeEnum poiTypeEnum, int radius, int number) {
        return getPoiRange(longitude, latitude, poiTypeEnum, radius, number, LangEnum.ZH);
    }

    @Override
    public HeWeatherPoiResponse getPoiRange(double longitude, double latitude, PoiTypeEnum poiTypeEnum, int radius) {
        return getPoiRange(longitude, latitude, poiTypeEnum, radius, 10, LangEnum.ZH);
    }

    @Override
    public HeWeatherPoiResponse getPoiRange(double longitude, double latitude, PoiTypeEnum poiTypeEnum) {
        return getPoiRange(longitude, latitude, poiTypeEnum, 5, 10, LangEnum.ZH);
    }
}

package com.heweather.api.service;

import com.heweather.api.common.LangEnum;
import com.heweather.api.common.PoiTypeEnum;
import com.heweather.api.response.geo.HeWeatherLookupResponse;
import com.heweather.api.response.geo.HeWeatherPoiResponse;
import com.heweather.api.response.geo.HeWeatherTopCityResponse;

/**
 * 城市信息搜索
 * add by djc
 */
public interface HeWeatherLocationService {

    /**
     * 城市信息搜索
     */
    HeWeatherLookupResponse getLocation(String location, String adm, String range, int number, LangEnum langEnum);

    HeWeatherLookupResponse getLocation(String location, LangEnum langEnum);

    HeWeatherLookupResponse getLocation(String location);


    /**
     * 热门城市信息搜索
     */
    HeWeatherTopCityResponse getTopCity(String range, int number, LangEnum langEnum);

    HeWeatherTopCityResponse getTopCity(int number, LangEnum langEnum);

    HeWeatherTopCityResponse getTopCity(int number);

    HeWeatherTopCityResponse getTopCity();


    /**
     * poi 搜索
     */
    HeWeatherPoiResponse getPoi(String location, PoiTypeEnum poiTypeEnum, String city, int number, LangEnum langEnum);

    HeWeatherPoiResponse getPoi(String location, PoiTypeEnum poiTypeEnum, int number, LangEnum langEnum);

    HeWeatherPoiResponse getPoi(String location, PoiTypeEnum poiTypeEnum, int number);

    HeWeatherPoiResponse getPoi(String location, PoiTypeEnum poiTypeEnum);

    /**
     * poi 范围搜索
     */
    HeWeatherPoiResponse getPoiRange(double longitude, double latitude, PoiTypeEnum poiTypeEnum, int radius, int number, LangEnum langEnum);

    HeWeatherPoiResponse getPoiRange(double longitude, double latitude, PoiTypeEnum poiTypeEnum, int radius, int number);

    HeWeatherPoiResponse getPoiRange(double longitude, double latitude, PoiTypeEnum poiTypeEnum, int radius);

    HeWeatherPoiResponse getPoiRange(double longitude, double latitude, PoiTypeEnum poiTypeEnum);

}

package com.heweather.api.service;

import com.heweather.api.common.LangEnum;
import com.heweather.api.common.UnitEnum;
import com.heweather.api.response.poi.HeWeatherPoiDailyResponse;
import com.heweather.api.response.poi.HeWeatherPoiNowResponse;

/**
 * 中国景点天气预报
 */
public interface HeWeatherPoiService {

    HeWeatherPoiNowResponse getPoiNow(String location, LangEnum langEnum, UnitEnum unitEnum);

    HeWeatherPoiNowResponse getPoiNow(String location);

    HeWeatherPoiDailyResponse getPoi7d(String location, LangEnum langEnum, UnitEnum unitEnum);

    HeWeatherPoiDailyResponse getPoi7d(String location);
}

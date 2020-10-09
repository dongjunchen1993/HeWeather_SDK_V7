package com.heweather.api.service;

import com.heweather.api.common.LangEnum;
import com.heweather.api.response.indices.HeWeatherLifestyleResponse;

/**
 * 天气生活指数
 * add by djc
 */
public interface HeWeatherLifestyleService {

    /**
     * 天气生活指数
     */
    HeWeatherLifestyleResponse getLifestyle(String location, String type, LangEnum langEnum);

    HeWeatherLifestyleResponse getLifestyle(String location, String type);

    /**
     * 天气生活指数
     */
    HeWeatherLifestyleResponse getLifestyle3d(String location, String type, LangEnum langEnum);

    HeWeatherLifestyleResponse getLifestyle3d(String location, String type);
}

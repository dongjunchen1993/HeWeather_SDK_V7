package com.heweather.api.service;

import com.google.common.base.Strings;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.heweather.api.HeWeatherInitialize;
import com.heweather.api.common.ApiEnum;
import com.heweather.util.HttpUtil;
import com.heweather.util.SignUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @author djc
 * @date 2020-09-06 12:26:14
 */
public class HeWeatherBaseService {

    protected boolean keyInvalid() {
        return Strings.isNullOrEmpty(HeWeatherInitialize.getPublicId()) || Strings.isNullOrEmpty(HeWeatherInitialize.getPrivateKey());
    }

    protected String getPath(ApiEnum apiEnum) {
        return HeWeatherInitialize.getDomain() + apiEnum.getPath();
    }

    protected String getGeoPath(ApiEnum apiEnum) {
        return HeWeatherInitialize.getGeoDomain() + apiEnum.getPath();
    }

    protected Multimap<String, String> getRequestParam(Map<String, String> baseParam) {
        baseParam.put("t", String.valueOf(System.currentTimeMillis() / 1000));
        baseParam.put("username", HeWeatherInitialize.getPublicId());
        String signature = SignUtil.getSignature(baseParam, HeWeatherInitialize.getPrivateKey());
        baseParam.put("sign", signature);
        return Multimaps.forMap(baseParam);
    }

    protected String getResponse(String url, Multimap<String, String> requestParam) {
        Map<String, String> headerMap = new HashMap<>(2);
        headerMap.put("author", "笑乐");
        headerMap.put("v", "1.0");
        HttpUtil http = HttpUtil.getHttp(url, requestParam, headerMap);
        http.setConnectTimeout(5000);
        http.setSocketTimeout(7000);
        return http.execute().getString();
    }
}

package com.heweather.api.common;

/**
 * @author Djc
 * 接口标识
 */
public enum ApiEnum {

    /**
     * 实况天气
     */
    WEATHER_NOW("/v7/weather/now"),
    /**
     * 3天预报
     */
    WEATHER_3D("/v7/weather/3d"),
    /**
     * 7天预报
     */
    WEATHER_7D("/v7/weather/7d"),
    /**
     * 10天预报
     */
    WEATHER_10D("/v7/weather/10d"),
    /**
     * 15天预报
     */
    WEATHER_15D("/v7/weather/15d"),
    /**
     * 逐小时预报（未来24小时）
     */
    WEATHER_24H("/v7/weather/24h"),
    /**
     * 逐小时预报（未来72小时）
     */
    WEATHER_72H("/v7/weather/72h"),
    /**
     * 逐小时预报（未来168小时）
     */
    WEATHER_168H("/v7/weather/168h"),
    /**
     * 空气质量实况
     */
    AIR_NOW("/v7/air/now"),
    /**
     * 空气质量5天
     */
    AIR_DAILY_5D("/v7/air/5d"),
    /**
     * 灾害预警
     */
    WANING("/v7/warning/now"),
    /**
     * 灾害预警列表
     */
    WANING_LIST("/v7/warning/list"),
    /**
     * 分钟降水
     */
    MINUTELY("/v7/minutely/5m"),
    /**
     * 今日生活指数
     */
    LIFESTYLE_1D("/v7/indices/1d"),
    /**
     * 3天生活指数
     */
    LIFESTYLE_3D("/v7/indices/3d"),
    /**
     * 中国景点天气实况
     */
    WEATHER_POI_NOW("/v7/weather-poi/now"),
    /**
     * 中国景点7天天气
     */
    WEATHER_POI_7D("/v7/weather-poi/7d"),
    /**
     * 天气历史数据
     */
    HISTORICAL_WEATHER("/v7/historical/weather"),
    /**
     * 空气质量历史数据
     */
    HISTORICAL_AIR("/v7/historical/air"),
    /**
     * 中国景点7天天气
     */
    SUN_MOON("/v7/astronomy/sunmoon"),
    /**
     * 城市搜索
     */
    GEO_CITY_LOOKUP("/v2/city/lookup"),
    /**
     * 热门城市列表
     */
    GEO_CITY_TOP("/v2/city/top"),
    /**
     * POI搜索
     */
    GEO_POI_LOOKUP("/v2/poi/lookup"),
    /**
     * POI范围搜索
     */
    GEO_POI_RANGE("/v2/poi/range");


    /**
     * 编号
     */
    private final String path;

    ApiEnum(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}

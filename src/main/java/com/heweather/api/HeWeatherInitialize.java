package com.heweather.api;

/**
 * 用户秘钥
 *
 * @author djc
 */
public class HeWeatherInitialize {

    private static String privateKey;
    private static String publicId;
    private static String domain;
    private static String geoDomain;

    public static void init(String publicId, String privateKey) {
        HeWeatherInitialize.publicId = publicId;
        HeWeatherInitialize.privateKey = privateKey;
        HeWeatherInitialize.domain = "https://api.heweather.net";
        HeWeatherInitialize.geoDomain = "https://geoapi.heweather.net";
    }

    public static void init(String publicId, String privateKey, String domain) {
        HeWeatherInitialize.publicId = publicId;
        HeWeatherInitialize.privateKey = privateKey;
        HeWeatherInitialize.domain = domain;
        HeWeatherInitialize.geoDomain = "https://geoapi.heweather.net";
    }

    public static String getPrivateKey() {
        return privateKey;
    }

    public static String getPublicId() {
        return publicId;
    }

    public static String getDomain() {
        return domain;
    }

    public static String getGeoDomain() {
        return geoDomain;
    }
}

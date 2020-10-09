package com.heweather.api.response.sunmoon;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.heweather.api.common.StatusEnum;
import com.heweather.api.common.jackson.ZonedDatetimeDeserializer;
import com.heweather.api.response.HeWeatherResponse;

import java.time.ZonedDateTime;
import java.util.List;

/**
 * 返回实体类
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HeWeatherSunMoonResponse extends HeWeatherResponse {

    @JsonDeserialize(using = ZonedDatetimeDeserializer.class)
    private ZonedDateTime sunrise;//	日出时间	2013-12-30T05:44+08:00
    @JsonDeserialize(using = ZonedDatetimeDeserializer.class)
    private ZonedDateTime sunset;//	日落时间	2013-12-30T17:02+08:00
    @JsonDeserialize(using = ZonedDatetimeDeserializer.class)
    private ZonedDateTime moonrise;//	月升时间	2013-12-30T13:19+08:00
    @JsonDeserialize(using = ZonedDatetimeDeserializer.class)
    private ZonedDateTime moonset;//	月落时间	2013-12-31T23:31+08:00
    private List<MoonPhase> moonPhase;//月相

    public HeWeatherSunMoonResponse() {
    }

    public HeWeatherSunMoonResponse(StatusEnum statusEnum) {
        super(statusEnum);
    }

    public ZonedDateTime getSunrise() {
        return sunrise;
    }

    public void setSunrise(ZonedDateTime sunrise) {
        this.sunrise = sunrise;
    }

    public ZonedDateTime getSunset() {
        return sunset;
    }

    public void setSunset(ZonedDateTime sunset) {
        this.sunset = sunset;
    }

    public ZonedDateTime getMoonrise() {
        return moonrise;
    }

    public void setMoonrise(ZonedDateTime moonrise) {
        this.moonrise = moonrise;
    }

    public ZonedDateTime getMoonset() {
        return moonset;
    }

    public void setMoonset(ZonedDateTime moonset) {
        this.moonset = moonset;
    }

    public List<MoonPhase> getMoonPhase() {
        return moonPhase;
    }

    public void setMoonPhase(List<MoonPhase> moonPhase) {
        this.moonPhase = moonPhase;
    }
}

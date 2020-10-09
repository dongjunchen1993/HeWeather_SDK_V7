package com.heweather.api.common;

public enum WarningCountryEnum {
    CHINA("cn");

    private final String country;

    WarningCountryEnum(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}

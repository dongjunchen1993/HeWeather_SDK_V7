package com.heweather.api.common;

public enum PoiTypeEnum {

    SCENIC("scenic");

    private final String type;

    PoiTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

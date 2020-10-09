package com.heweather.api.common;

/**
 * 单位标识
 */
public enum UnitEnum {

    /**
     * 公制单位
     */
    METRIC("m"),
    /**
     * 英制单位
     */
    IMPERIAL("i");

    private final String unit;

    UnitEnum(String unit) {
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }
}

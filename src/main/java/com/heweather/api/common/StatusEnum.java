package com.heweather.api.common;

/**
 * @author djc
 * @date 2020/03/17 19:13
 */
public enum StatusEnum implements ApiStatus {

    OK("200"),
    NO_DATA("204"),
    PARAMETER_INVALID("400"),
    KEY_INVALID("401"),
    NO_CONTINUE("402"),
    PERMISSION_DENIED("403"),
    UNKNOWN_LOCATION("404"),
    TOO_FAST("429"),
    INTERNAL_ERROR("500"),
    UNKNOWN("999");

    private String code;

    StatusEnum(String code) {
        this.code = code;
    }


    @Override
    public boolean isOk() {
        return StatusEnum.OK.getCode().equals(this.getCode());
    }

    @Override
    public String getCode() {
        return code;
    }

    public static StatusEnum codeOf(String code) {
        for (StatusEnum v7StatusEnum : StatusEnum.values()) {
            if (v7StatusEnum.code.equals(code)) {
                return v7StatusEnum;
            }
        }
        return UNKNOWN;
    }

}

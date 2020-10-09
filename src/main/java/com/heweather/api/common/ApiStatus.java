package com.heweather.api.common;

/**
 * @author djc
 * @date 2020/03/18 10:41
 */
public interface ApiStatus {

    /**
     * the status is ok
     */
    boolean isOk();

    /**
     * code returned for user
     *
     * @return String
     */
    String getCode();

}

package com.heweather.api.common;

/**
 * @author Djc
 * 天气标识
 */
public enum LangEnum {
    ZH("zh"),
    ZH_HANT("zh-hant"),
    EN("en"),
    DE("de"),
    ES("es"),
    FR("fr"),
    IT("it"),
    JA("ja"),
    KO("ko"),
    RU("ru"),
    HI("hi"),
    TH("th"),
    AR("ar"),
    PT("pt"),
    BN("bn"),
    MS("ms"),
    NL("nl"),
    LA("la"),
    SV("sv"),
    ID("id"),
    PL("pl"),
    TR("tr"),
    ET("et"),
    VI("vi"),
    FIL("fil"),
    FI("fi"),
    HE("he"),
    IS("is"),
    NB("nb");

    private final String lang;

    LangEnum(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }
}

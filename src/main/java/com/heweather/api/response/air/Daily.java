package com.heweather.api.response.air;

public class Daily {
    private String fxDate;//	空气质量逐天预报日期	2018-05-31
    private String aqi;//	空气质量逐天预报指数	74
    private String level;//	逐天预报的空气质量指数等级	2
    private String category;//	逐天预空气质量指数级别	良
    private String primary;//	空气质量逐天预报的主要污染物，空气质量为优时，返回值为NA	pm2.5

    public String getFxDate() {
        return fxDate;
    }

    public void setFxDate(String fxDate) {
        this.fxDate = fxDate;
    }

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }
}

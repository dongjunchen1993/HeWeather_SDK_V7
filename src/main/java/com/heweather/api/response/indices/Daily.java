package com.heweather.api.response.indices;

public class Daily {

    private String date;//	预报日期	2018-05-30
    private String type;//	生活指数预报类型	2
    private String name;//	生活指数预报类型的名称	舒适度指数
    private String level;//	生活指数预报等级	1
    private String category;//	生活指数预报级别名称	舒适
    private String text;//	生活指数预报的详细描述，可能为空	白天温度适宜，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

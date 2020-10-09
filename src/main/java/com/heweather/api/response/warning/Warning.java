package com.heweather.api.response.warning;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.heweather.api.common.jackson.ZonedDatetimeDeserializer;

import java.time.ZonedDateTime;

public class Warning {
    private String id;//	本条预警的唯一标识，可判断本条预警是否已经存在，id有效期不超过72小时	202010110345679813
    private String sender;//	预警发布单位，可能为空	深圳市气象台
    @JsonDeserialize(using = ZonedDatetimeDeserializer.class)
    private ZonedDateTime pubTime;//	预警发布时间	2017-10-25T12:03+08:00
    private String title;//	预警信息标题	广东省深圳市气象台发布雷电黄色预警
    @JsonDeserialize(using = ZonedDatetimeDeserializer.class)
    private ZonedDateTime startTime;//	预警开始时间，可能为空。	2017-10-25T13:12
    @JsonDeserialize(using = ZonedDatetimeDeserializer.class)
    private ZonedDateTime endTime;//	预警结束时间，可能为空。	2017-10-26T13:12
    private String status;//	预警状态，可能为空
    private String level;//	预警等级	黄色
    private String type;//	预警类型	11B17
    private String typeName;//	预警等级名称	大雾
    private String text;//	预警详细文字描述	深圳市气象局于10月04日12时59分发布雷电黄色预警信号，请注意防御。
    private String related;//	与本条预警相关联的预警ID，当预警状态为cancel或update时返回。可能为空	202010110345679813

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public ZonedDateTime getPubTime() {
        return pubTime;
    }

    public void setPubTime(ZonedDateTime pubTime) {
        this.pubTime = pubTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ZonedDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(ZonedDateTime startTime) {
        this.startTime = startTime;
    }

    public ZonedDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(ZonedDateTime endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getRelated() {
        return related;
    }

    public void setRelated(String related) {
        this.related = related;
    }
}

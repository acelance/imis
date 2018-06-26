package com.iotch.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 设备类型
 */
public class DevType implements Serializable {
    private String devTypeCode;//设备类型编码
    private String devTypeName;//设备类型名称
    private String typeNote;//设备类型备注信息
    private Timestamp createTime;//创建时间
    private Timestamp lastEditTime;//修改时间

    public DevType() {
    }

    public DevType(String devTypeCode, String devTypeName, String typeNote, Timestamp createTime, Timestamp lastEditTime) {
        this.devTypeCode = devTypeCode;
        this.devTypeName = devTypeName;
        this.typeNote = typeNote;
        this.createTime = createTime;
        this.lastEditTime = lastEditTime;
    }

    @Override
    public String toString() {
        return "DevType{" +
                "devTypeCode='" + devTypeCode + '\'' +
                ", devTypeName='" + devTypeName + '\'' +
                ", typeNote='" + typeNote + '\'' +
                ", createTime=" + createTime +
                ", lastEditTime=" + lastEditTime +
                '}';
    }

    public String getDevTypeCode() {
        return devTypeCode;
    }

    public void setDevTypeCode(String devTypeCode) {
        this.devTypeCode = devTypeCode;
    }

    public String getDevTypeName() {
        return devTypeName;
    }

    public void setDevTypeName(String devTypeName) {
        this.devTypeName = devTypeName;
    }

    public String getTypeNote() {
        return typeNote;
    }

    public void setTypeNote(String typeNote) {
        this.typeNote = typeNote;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Timestamp lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}

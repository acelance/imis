package com.iotch.entity;

import java.io.Serializable;

/**
 * 监控定义信息类
 */
public class MonitorInfo implements Serializable {
    private String monitorCode;//监控编码
    private String monitorName;//监控名称(如:离线,xx故障,正常)
    private String note;//备注信息

    public MonitorInfo() {
    }

    public MonitorInfo(String monitorCode, String monitorName, String note) {
        this.monitorCode = monitorCode;
        this.monitorName = monitorName;
        this.note = note;
    }

    @Override
    public String toString() {
        return "MonitorInfo{" +
                "monitorCode='" + monitorCode + '\'' +
                ", monitorName='" + monitorName + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

    public String getMonitorCode() {
        return monitorCode;
    }

    public void setMonitorCode(String monitorCode) {
        this.monitorCode = monitorCode;
    }

    public String getMonitorName() {
        return monitorName;
    }

    public void setMonitorName(String monitorName) {
        this.monitorName = monitorName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

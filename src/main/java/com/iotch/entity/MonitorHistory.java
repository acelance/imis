package com.iotch.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 监控历史信息
 */
public class MonitorHistory implements Serializable {
    private String historyCode;//监控历史流水码,yyyyMMddHH24mmss+Random(9999)
    private DevInfo devInfo;//设备信息
    private MonitorInfo monitorInfo;//监控信息
    private Timestamp createTime;//创建时间

    public MonitorHistory() {
    }

    public MonitorHistory(String historyCode, DevInfo devInfo, MonitorInfo monitorInfo, Timestamp createTime) {
        this.historyCode = historyCode;
        this.devInfo = devInfo;
        this.monitorInfo = monitorInfo;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "MonitorHistory{" +
                "historyCode='" + historyCode + '\'' +
                ", devInfo=" + devInfo +
                ", monitorInfo=" + monitorInfo +
                ", createTime=" + createTime +
                '}';
    }

    public String getHistoryCode() {
        return historyCode;
    }

    public void setHistoryCode(String historyCode) {
        this.historyCode = historyCode;
    }

    public DevInfo getDevInfo() {
        return devInfo;
    }

    public void setDevInfo(DevInfo devInfo) {
        this.devInfo = devInfo;
    }

    public MonitorInfo getMonitorInfo() {
        return monitorInfo;
    }

    public void setMonitorInfo(MonitorInfo monitorInfo) {
        this.monitorInfo = monitorInfo;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}

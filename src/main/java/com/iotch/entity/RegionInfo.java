package com.iotch.entity;

import java.io.Serializable;

public class RegionInfo implements Serializable {
    private String regionCode;
    private String regionName;
    private String parentCode;
    private String note;

    public RegionInfo() {
    }

    public RegionInfo(String regionCode, String regionName, String parentCode, String note) {
        this.regionCode = regionCode;
        this.regionName = regionName;
        this.parentCode = parentCode;
        this.note = note;
    }

    @Override
    public String toString() {
        return "RegionInfo{" +
                "regionCode='" + regionCode + '\'' +
                ", regionName='" + regionName + '\'' +
                ", parentCode='" + parentCode + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

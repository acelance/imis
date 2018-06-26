package com.iotch.entity;

import java.io.Serializable;

/**
 /**
 * 货道信息类
 * 将该类分离独立是因为考虑如下:
 *      1.不同型号设备,货道类型不同
 *      2.相同型号设备,可能具有多种货道
 * 基于以上原因,将其分离独立,方便与设备任意组合
 */
public class AisleInfo implements Serializable {
    private String aisleCode;//货道编码
    private String aisleName;//该种货道的名称
    private String aisleCapacity;//货单容量

    public AisleInfo() {
    }

    public AisleInfo(String aisleCode, String aisleName, String aisleCapacity) {
        this.aisleCode = aisleCode;
        this.aisleName = aisleName;
        this.aisleCapacity = aisleCapacity;
    }

    @Override
    public String toString() {
        return "AisleInfo{" +
                "aisleCode='" + aisleCode + '\'' +
                ", aisleName='" + aisleName + '\'' +
                ", aisleCapacity='" + aisleCapacity + '\'' +
                '}';
    }

    public String getAisleCode() {
        return aisleCode;
    }

    public void setAisleCode(String aisleCode) {
        this.aisleCode = aisleCode;
    }

    public String getAisleName() {
        return aisleName;
    }

    public void setAisleName(String aisleName) {
        this.aisleName = aisleName;
    }

    public String getAisleCapacity() {
        return aisleCapacity;
    }

    public void setAisleCapacity(String aisleCapacity) {
        this.aisleCapacity = aisleCapacity;
    }
}

package com.iotch.entity;

import java.io.Serializable;

public class DevAisle implements Serializable {
    private DevInfo devInfo;
    private AisleInfo aisleInfo;
    private String devAisleCode;
    private String residualCapacity;

    public DevAisle() {
    }

    public DevAisle(DevInfo devInfo, AisleInfo aisleInfo, String devAisleCode, String residualCapacity) {
        this.devInfo = devInfo;
        this.aisleInfo = aisleInfo;
        this.devAisleCode = devAisleCode;
        this.residualCapacity = residualCapacity;
    }

    @Override
    public String toString() {
        return "DevAisleDao{" +
                "devInfo=" + devInfo +
                ", aisleInfo=" + aisleInfo +
                ", devAisleCode='" + devAisleCode + '\'' +
                ", residualCapacity='" + residualCapacity + '\'' +
                '}';
    }

    public DevInfo getDevInfo() {
        return devInfo;
    }

    public void setDevInfo(DevInfo devInfo) {
        this.devInfo = devInfo;
    }

    public AisleInfo getAisleInfo() {
        return aisleInfo;
    }

    public void setAisleInfo(AisleInfo aisleInfo) {
        this.aisleInfo = aisleInfo;
    }

    public String getDevAisleCode() {
        return devAisleCode;
    }

    public void setDevAisleCode(String devAisleCode) {
        this.devAisleCode = devAisleCode;
    }

    public String getResidualCapacity() {
        return residualCapacity;
    }

    public void setResidualCapacity(String residualCapacity) {
        this.residualCapacity = residualCapacity;
    }
}

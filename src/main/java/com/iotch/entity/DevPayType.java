package com.iotch.entity;

import java.io.Serializable;

/**
 * 设备支付类型配置类
 *      配置该设备有哪种支付类型
 */
public class DevPayType implements Serializable {
    private DevInfo devInfo;//设备信息
    private PayType payType;//支付类型信息

    public DevPayType() {
    }

    public DevPayType(DevInfo devInfo, PayType payType) {
        this.devInfo = devInfo;
        this.payType = payType;
    }

    @Override
    public String toString() {
        return "DevPayType{" +
                "devInfo=" + devInfo +
                ", payType=" + payType +
                '}';
    }

    public DevInfo getDevInfo() {
        return devInfo;
    }

    public void setDevInfo(DevInfo devInfo) {
        this.devInfo = devInfo;
    }

    public PayType getPayType() {
        return payType;
    }

    public void setPayType(PayType payType) {
        this.payType = payType;
    }
}

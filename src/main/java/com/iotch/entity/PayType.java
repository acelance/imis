package com.iotch.entity;

import java.sql.Timestamp;

/**
 * 支付类型
 */
public class PayType {
    private String payTypeCode;//支付类型编码
    private String payTypeName;//支付类型名称
    private Timestamp createTime;//创建时间
    private Timestamp lastEditTime;//修改时间
    private String typeNote;//备注信息

    public PayType() {
    }

    public PayType(String payTypeCode, String payTypeName, Timestamp createTime, Timestamp lastEditTime, String typeNote) {
        this.payTypeCode = payTypeCode;
        this.payTypeName = payTypeName;
        this.createTime = createTime;
        this.lastEditTime = lastEditTime;
        this.typeNote = typeNote;
    }

    @Override
    public String toString() {
        return "PayType{" +
                "payTypeCode='" + payTypeCode + '\'' +
                ", payTypeName='" + payTypeName + '\'' +
                ", createTime=" + createTime +
                ", lastEditTime=" + lastEditTime +
                ", typeNote='" + typeNote + '\'' +
                '}';
    }

    public String getPayTypeCode() {
        return payTypeCode;
    }

    public void setPayTypeCode(String payTypeCode) {
        this.payTypeCode = payTypeCode;
    }

    public String getPayTypeName() {
        return payTypeName;
    }

    public void setPayTypeName(String payTypeName) {
        this.payTypeName = payTypeName;
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

    public String getTypeNote() {
        return typeNote;
    }

    public void setTypeNote(String typeNote) {
        this.typeNote = typeNote;
    }
}

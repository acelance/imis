package com.iotch.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 推广活动类
 */
public class PromotionInfo implements Serializable {
    private String promotionCode;//推广活动编码
    private String promotionName;//推广活动名称
    private Timestamp createTime;//创建时间
    private Timestamp usefulTime;//有效时间至
    private Timestamp lastEditTime;//修改时间

    public PromotionInfo() {
    }

    public PromotionInfo(String promotionCode, String promotionName, Timestamp createTime, Timestamp usefulTime, Timestamp lastEditTime) {
        this.promotionCode = promotionCode;
        this.promotionName = promotionName;
        this.createTime = createTime;
        this.usefulTime = usefulTime;
        this.lastEditTime = lastEditTime;
    }

    @Override
    public String toString() {
        return "PromotionInfo{" +
                "promotionCode='" + promotionCode + '\'' +
                ", promotionName='" + promotionName + '\'' +
                ", createTime=" + createTime +
                ", usefulTime=" + usefulTime +
                ", lastEditTime=" + lastEditTime +
                '}';
    }

    public String getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUsefulTime() {
        return usefulTime;
    }

    public void setUsefulTime(Timestamp usefulTime) {
        this.usefulTime = usefulTime;
    }

    public Timestamp getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Timestamp lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}

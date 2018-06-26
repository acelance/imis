package com.iotch.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 设备推广活动配置
 *      该设备有哪些推广活动
 */
public class DevPromotion implements Serializable {
    private DevInfo devInfo;//设备信息
    private PromotionInfo promotionInfo;//推广活动信息
    private Timestamp createTime;//创建时间
    private Timestamp usefulTime;//有效时间至
    private Timestamp lastEditTime;//修改时间

    public DevPromotion() {
    }

    public DevPromotion(DevInfo devInfo, PromotionInfo promotionInfo, Timestamp createTime, Timestamp usefulTime, Timestamp lastEditTime) {
        this.devInfo = devInfo;
        this.promotionInfo = promotionInfo;
        this.createTime = createTime;
        this.usefulTime = usefulTime;
        this.lastEditTime = lastEditTime;
    }

    @Override
    public String toString() {
        return "DevPromotion{" +
                "devInfo=" + devInfo +
                ", promotionInfo=" + promotionInfo +
                ", createTime=" + createTime +
                ", usefulTime=" + usefulTime +
                ", lastEditTime=" + lastEditTime +
                '}';
    }

    public DevInfo getDevInfo() {
        return devInfo;
    }

    public void setDevInfo(DevInfo devInfo) {
        this.devInfo = devInfo;
    }

    public PromotionInfo getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(PromotionInfo promotionInfo) {
        this.promotionInfo = promotionInfo;
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

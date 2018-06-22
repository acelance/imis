package com.iotch.entity;

import java.sql.Timestamp;

/**
 * 业态信息类
 *      在零售业中业态指代很多东西,有可能指代商家经营方式,也有可能商品形态,等等.
 *      在本项目中该类指代自助设备的经营方式.
 *
 */
public class BusinessFormat {
    private String formatCode;//业态信息编码
    private String formatName;//业态名称
    private Timestamp createTime;//创建时间
    private Timestamp lastEditTime;//修改时间

    public BusinessFormat() {
    }

    public BusinessFormat(String formatCode, String formatName, Timestamp createTime, Timestamp lastEditTime) {
        this.formatCode = formatCode;
        this.formatName = formatName;
        this.createTime = createTime;
        this.lastEditTime = lastEditTime;
    }

    @Override
    public String toString() {
        return "BusinessFormat{" +
                "formatCode='" + formatCode + '\'' +
                ", formatName='" + formatName + '\'' +
                ", createTime=" + createTime +
                ", lastEditTime=" + lastEditTime +
                '}';
    }

    public String getFormatCode() {
        return formatCode;
    }

    public void setFormatCode(String formatCode) {
        this.formatCode = formatCode;
    }

    public String getFormatName() {
        return formatName;
    }

    public void setFormatName(String formatName) {
        this.formatName = formatName;
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

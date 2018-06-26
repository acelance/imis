package com.iotch.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 商品图片详情表
 */
public class ProductImg implements Serializable {
    private String productImgId;//商品图片编码
    private String imgAddr;//图片路径地址
    private String imgDesc;//图片描述
    private Integer priority;//优先级
    private Timestamp createTime;//创建时间
    private String productCode;//商品编码

    public ProductImg() {
    }

    public ProductImg(String productImgId, String imgAddr, String imgDesc, Integer priority, Timestamp createTime, String productCode) {
        this.productImgId = productImgId;
        this.imgAddr = imgAddr;
        this.imgDesc = imgDesc;
        this.priority = priority;
        this.createTime = createTime;
        this.productCode = productCode;
    }

    @Override
    public String toString() {
        return "ProductImg{" +
                "productImgId='" + productImgId + '\'' +
                ", imgAddr='" + imgAddr + '\'' +
                ", imgDesc='" + imgDesc + '\'' +
                ", priority=" + priority +
                ", createTime=" + createTime +
                ", productCode='" + productCode + '\'' +
                '}';
    }

    public String getProductImgId() {
        return productImgId;
    }

    public void setProductImgId(String productImgId) {
        this.productImgId = productImgId;
    }

    public String getImgAddr() {
        return imgAddr;
    }

    public void setImgAddr(String imgAddr) {
        this.imgAddr = imgAddr;
    }

    public String getImgDesc() {
        return imgDesc;
    }

    public void setImgDesc(String imgDesc) {
        this.imgDesc = imgDesc;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}

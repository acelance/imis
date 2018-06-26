package com.iotch.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 商品分类
 */
public class ProductCategory implements Serializable {
    private String productCategoryId;//商品分类编码
    private String productCategoryName;//商品分类名称
    private Integer priority;//优先级
    private Timestamp createTime;//创建时间
    private Timestamp lastEditTime;//修改时间
    private String enableStatus;//可用状态

    public ProductCategory() {
    }

    public ProductCategory(String productCategoryId, String productCategoryName, Integer priority, Timestamp createTime, Timestamp lastEditTime, String enableStatus) {
        this.productCategoryId = productCategoryId;
        this.productCategoryName = productCategoryName;
        this.priority = priority;
        this.createTime = createTime;
        this.lastEditTime = lastEditTime;
        this.enableStatus = enableStatus;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "productCategoryId='" + productCategoryId + '\'' +
                ", productCategoryName='" + productCategoryName + '\'' +
                ", priority=" + priority +
                ", createTime=" + createTime +
                ", lastEditTime=" + lastEditTime +
                ", enableStatus='" + enableStatus + '\'' +
                '}';
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
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

    public Timestamp getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Timestamp lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public String getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus;
    }
}

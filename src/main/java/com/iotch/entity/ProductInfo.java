package com.iotch.entity;

import java.sql.Timestamp;
import java.util.List;

public class ProductInfo {
    private String productCode;//商品编码
    private String productName;//商品名称
    private String productDesc;//商品描述
    private String imgAddr;//商品主图路径
    private String purchasePrice;//进货价
    private String distributionPrice;//配送价
    private String normalPrice;//正常销售价格
    private String promotionPrice;//推广价格
    private String barCodeNo;//条形码号码
    private Integer priority;//优先级
    private Timestamp createTime;//创建时间
    private Timestamp lastEditTime;//修改时间
    private String enableStatus;//可用状态
    private ProductCategory productCategory;//商品分类信息
    private List<ProductImg> productImgList;//商品图片集合

    public ProductInfo() {
    }

    public ProductInfo(String productCode, String productName, String productDesc, String imgAddr, String purchasePrice, String distributionPrice, String normalPrice, String promotionPrice, String barCodeNo, Integer priority, Timestamp createTime, Timestamp lastEditTime, String enableStatus, ProductCategory productCategory, List<ProductImg> productImgList) {
        this.productCode = productCode;
        this.productName = productName;
        this.productDesc = productDesc;
        this.imgAddr = imgAddr;
        this.purchasePrice = purchasePrice;
        this.distributionPrice = distributionPrice;
        this.normalPrice = normalPrice;
        this.promotionPrice = promotionPrice;
        this.barCodeNo = barCodeNo;
        this.priority = priority;
        this.createTime = createTime;
        this.lastEditTime = lastEditTime;
        this.enableStatus = enableStatus;
        this.productCategory = productCategory;
        this.productImgList = productImgList;
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
                "productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", productDesc='" + productDesc + '\'' +
                ", imgAddr='" + imgAddr + '\'' +
                ", purchasePrice='" + purchasePrice + '\'' +
                ", distributionPrice='" + distributionPrice + '\'' +
                ", normalPrice='" + normalPrice + '\'' +
                ", promotionPrice='" + promotionPrice + '\'' +
                ", barCodeNo='" + barCodeNo + '\'' +
                ", priority=" + priority +
                ", createTime=" + createTime +
                ", lastEditTime=" + lastEditTime +
                ", enableStatus='" + enableStatus + '\'' +
                ", productCategory=" + productCategory +
                ", productImgList=" + productImgList +
                '}';
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getImgAddr() {
        return imgAddr;
    }

    public void setImgAddr(String imgAddr) {
        this.imgAddr = imgAddr;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getDistributionPrice() {
        return distributionPrice;
    }

    public void setDistributionPrice(String distributionPrice) {
        this.distributionPrice = distributionPrice;
    }

    public String getNormalPrice() {
        return normalPrice;
    }

    public void setNormalPrice(String normalPrice) {
        this.normalPrice = normalPrice;
    }

    public String getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(String promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public String getBarCodeNo() {
        return barCodeNo;
    }

    public void setBarCodeNo(String barCodeNo) {
        this.barCodeNo = barCodeNo;
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

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public List<ProductImg> getProductImgList() {
        return productImgList;
    }

    public void setProductImgList(List<ProductImg> productImgList) {
        this.productImgList = productImgList;
    }
}

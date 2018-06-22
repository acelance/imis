package com.iotch.entity;

/**
 * 运营商商品分类配置
 */
public class OprProductCategory {
    private ProductCategory productCategory;//商品分类信息
    private OperatorsInfo operatorsInfo;//运营商信息
    private OperatorsInfo superiorOpr;//上级运营商信息

    public OprProductCategory() {
    }

    public OprProductCategory(ProductCategory productCategory, OperatorsInfo operatorsInfo, OperatorsInfo superiorOpr) {
        this.productCategory = productCategory;
        this.operatorsInfo = operatorsInfo;
        this.superiorOpr = superiorOpr;
    }

    @Override
    public String toString() {
        return "OprProductCategory{" +
                "productCategory=" + productCategory +
                ", operatorsInfo=" + operatorsInfo +
                ", superiorOpr=" + superiorOpr +
                '}';
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public OperatorsInfo getOperatorsInfo() {
        return operatorsInfo;
    }

    public void setOperatorsInfo(OperatorsInfo operatorsInfo) {
        this.operatorsInfo = operatorsInfo;
    }

    public OperatorsInfo getSuperiorOpr() {
        return superiorOpr;
    }

    public void setSuperiorOpr(OperatorsInfo superiorOpr) {
        this.superiorOpr = superiorOpr;
    }
}

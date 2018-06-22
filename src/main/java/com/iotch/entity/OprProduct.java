package com.iotch.entity;

/**
 * 运营商的商品配置
 */
public class OprProduct {
    private ProductInfo productInfo;//商品信息
    private OperatorsInfo operatorsInfo;//运营商信息
    private OperatorsInfo superiorOpr;//上级运营商
    private OperatorsInfo distributionOpr;//配送运营商

    public OprProduct() {
    }

    public OprProduct(ProductInfo productInfo, OperatorsInfo operatorsInfo, OperatorsInfo superiorOpr, OperatorsInfo distributionOpr) {
        this.productInfo = productInfo;
        this.operatorsInfo = operatorsInfo;
        this.superiorOpr = superiorOpr;
        this.distributionOpr = distributionOpr;
    }

    @Override
    public String toString() {
        return "OprProduct{" +
                "productInfo=" + productInfo +
                ", operatorsInfo=" + operatorsInfo +
                ", superiorOpr=" + superiorOpr +
                ", distributionOpr=" + distributionOpr +
                '}';
    }

    public ProductInfo getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
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

    public OperatorsInfo getDistributionOpr() {
        return distributionOpr;
    }

    public void setDistributionOpr(OperatorsInfo distributionOpr) {
        this.distributionOpr = distributionOpr;
    }
}

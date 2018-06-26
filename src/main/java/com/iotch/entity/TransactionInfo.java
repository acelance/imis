package com.iotch.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class TransactionInfo implements Serializable {
    private String mchTradeNo;//商户订单号
    private PayType payType;//支付类型信息
    private DevInfo devInfo;//设备信息
    private String devAisleCode;//货道信息
    private Timestamp payTime;//支付完成时间
    private ProductInfo productInfo;//产品信息
    private String orderStatus;//订单状态
    private String deliverStatus;//交付状态(出货状态)
    private String mchId;//商户编号
    private String bankType;//银行类型(银行)
    private String totalFee;//总金额
    private String productPrice;//商品价格
    private String promotionFee;//已优惠金额
    private String payFee;//实际支付金额
    private String transactionId;//微信或支付宝产生的订单号

    public TransactionInfo() {
    }

    public TransactionInfo(String mchTradeNo, PayType payType, DevInfo devInfo, String devAisleCode, Timestamp payTime, ProductInfo productInfo, String orderStatus, String deliverStatus, String mchId, String bankType, String totalFee, String productPrice, String promotionFee, String payFee, String transactionId) {
        this.mchTradeNo = mchTradeNo;
        this.payType = payType;
        this.devInfo = devInfo;
        this.devAisleCode = devAisleCode;
        this.payTime = payTime;
        this.productInfo = productInfo;
        this.orderStatus = orderStatus;
        this.deliverStatus = deliverStatus;
        this.mchId = mchId;
        this.bankType = bankType;
        this.totalFee = totalFee;
        this.productPrice = productPrice;
        this.promotionFee = promotionFee;
        this.payFee = payFee;
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "TransactionInfo{" +
                "mchTradeNo='" + mchTradeNo + '\'' +
                ", payType=" + payType +
                ", devInfo=" + devInfo +
                ", devAisleCode='" + devAisleCode + '\'' +
                ", payTime=" + payTime +
                ", productInfo=" + productInfo +
                ", orderStatus='" + orderStatus + '\'' +
                ", deliverStatus='" + deliverStatus + '\'' +
                ", mchId='" + mchId + '\'' +
                ", bankType='" + bankType + '\'' +
                ", totalFee='" + totalFee + '\'' +
                ", productPrice='" + productPrice + '\'' +
                ", promotionFee='" + promotionFee + '\'' +
                ", payFee='" + payFee + '\'' +
                ", transactionId='" + transactionId + '\'' +
                '}';
    }

    public String getMchTradeNo() {
        return mchTradeNo;
    }

    public void setMchTradeNo(String mchTradeNo) {
        this.mchTradeNo = mchTradeNo;
    }

    public PayType getPayType() {
        return payType;
    }

    public void setPayType(PayType payType) {
        this.payType = payType;
    }

    public DevInfo getDevInfo() {
        return devInfo;
    }

    public void setDevInfo(DevInfo devInfo) {
        this.devInfo = devInfo;
    }

    public String getDevAisleCode() {
        return devAisleCode;
    }

    public void setDevAisleCode(String devAisleCode) {
        this.devAisleCode = devAisleCode;
    }

    public Timestamp getPayTime() {
        return payTime;
    }

    public void setPayTime(Timestamp payTime) {
        this.payTime = payTime;
    }

    public ProductInfo getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getDeliverStatus() {
        return deliverStatus;
    }

    public void setDeliverStatus(String deliverStatus) {
        this.deliverStatus = deliverStatus;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getPromotionFee() {
        return promotionFee;
    }

    public void setPromotionFee(String promotionFee) {
        this.promotionFee = promotionFee;
    }

    public String getPayFee() {
        return payFee;
    }

    public void setPayFee(String payFee) {
        this.payFee = payFee;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}

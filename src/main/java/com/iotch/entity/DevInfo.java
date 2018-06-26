package com.iotch.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Arrays;

public class DevInfo implements Serializable {
    private String devCode;//设备编号
    private String devName;//设备名称
    private String devType;//设备类型信息
    private String activationCode;//激活码
    private FactoryInfo factoryInfo;//厂商信息
    private BusinessFormat businessFormat;//业态信息
    private OperatorsInfo oprInfo;//使用设备的组织(运营商)
    private String statusCode;//设备状态
    private MonitorInfo monitorInfo;//监控状态信息
    private String promotionPush;//是否参与推广的标志
    private OperatorsInfo authOpr;//授权组织(运营商)
    private byte[] qrcodeImg;//二维码图片
    private String qrcodePath;//二维码图片路径
    private Timestamp regTime;//注册时间
    private Timestamp startUpTime;//开机时间
    private Timestamp shutDownTime;//关键时间
    private Timestamp restartTime;//重启时间
    private Timestamp lastEditTime;//修改时间
    private String devNote;//设备备注
    private String ip;//设备IP
    private String mac;//设备MAC
    private String devAddr;//设备所在地址
    private String coordinateX;//地理坐标X
    private String coordinateY;//地理坐标Y
    private RegionInfo regionInfo;//地区信息

    public DevInfo() {
    }

    public DevInfo(String devCode, String devName, String devType, String activationCode, FactoryInfo factoryInfo, BusinessFormat businessFormat, OperatorsInfo oprInfo, String statusCode, MonitorInfo monitorInfo, String promotionPush, OperatorsInfo authOpr, byte[] qrcodeImg, String qrcodePath, Timestamp regTime, Timestamp startUpTime, Timestamp shutDownTime, Timestamp restartTime, Timestamp lastEditTime, String devNote, String ip, String mac, String devAddr, String coordinateX, String coordinateY, RegionInfo regionInfo) {
        this.devCode = devCode;
        this.devName = devName;
        this.devType = devType;
        this.activationCode = activationCode;
        this.factoryInfo = factoryInfo;
        this.businessFormat = businessFormat;
        this.oprInfo = oprInfo;
        this.statusCode = statusCode;
        this.monitorInfo = monitorInfo;
        this.promotionPush = promotionPush;
        this.authOpr = authOpr;
        this.qrcodeImg = qrcodeImg;
        this.qrcodePath = qrcodePath;
        this.regTime = regTime;
        this.startUpTime = startUpTime;
        this.shutDownTime = shutDownTime;
        this.restartTime = restartTime;
        this.lastEditTime = lastEditTime;
        this.devNote = devNote;
        this.ip = ip;
        this.mac = mac;
        this.devAddr = devAddr;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.regionInfo = regionInfo;
    }

    @Override
    public String toString() {
        return "DevInfo{" +
                "devCode='" + devCode + '\'' +
                ", devName='" + devName + '\'' +
                ", devType='" + devType + '\'' +
                ", activationCode='" + activationCode + '\'' +
                ", factoryInfo=" + factoryInfo +
                ", businessFormat=" + businessFormat +
                ", oprInfo=" + oprInfo +
                ", statusCode='" + statusCode + '\'' +
                ", monitorInfo=" + monitorInfo +
                ", promotionPush='" + promotionPush + '\'' +
                ", authOpr=" + authOpr +
                ", qrcodeImg=" + Arrays.toString(qrcodeImg) +
                ", qrcodePath='" + qrcodePath + '\'' +
                ", regTime=" + regTime +
                ", startUpTime=" + startUpTime +
                ", shutDownTime=" + shutDownTime +
                ", restartTime=" + restartTime +
                ", lastEditTime=" + lastEditTime +
                ", devNote='" + devNote + '\'' +
                ", ip='" + ip + '\'' +
                ", mac='" + mac + '\'' +
                ", devAddr='" + devAddr + '\'' +
                ", coordinateX='" + coordinateX + '\'' +
                ", coordinateY='" + coordinateY + '\'' +
                ", regionInfo=" + regionInfo +
                '}';
    }

    public String getDevCode() {
        return devCode;
    }

    public void setDevCode(String devCode) {
        this.devCode = devCode;
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    public String getDevType() {
        return devType;
    }

    public void setDevType(String devType) {
        this.devType = devType;
    }

    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    public FactoryInfo getFactoryInfo() {
        return factoryInfo;
    }

    public void setFactoryInfo(FactoryInfo factoryInfo) {
        this.factoryInfo = factoryInfo;
    }

    public BusinessFormat getBusinessFormat() {
        return businessFormat;
    }

    public void setBusinessFormat(BusinessFormat businessFormat) {
        this.businessFormat = businessFormat;
    }

    public OperatorsInfo getOprInfo() {
        return oprInfo;
    }

    public void setOprInfo(OperatorsInfo oprInfo) {
        this.oprInfo = oprInfo;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public MonitorInfo getMonitorInfo() {
        return monitorInfo;
    }

    public void setMonitorInfo(MonitorInfo monitorInfo) {
        this.monitorInfo = monitorInfo;
    }

    public String getPromotionPush() {
        return promotionPush;
    }

    public void setPromotionPush(String promotionPush) {
        this.promotionPush = promotionPush;
    }

    public OperatorsInfo getAuthOpr() {
        return authOpr;
    }

    public void setAuthOpr(OperatorsInfo authOpr) {
        this.authOpr = authOpr;
    }

    public byte[] getQrcodeImg() {
        return qrcodeImg;
    }

    public void setQrcodeImg(byte[] qrcodeImg) {
        this.qrcodeImg = qrcodeImg;
    }

    public String getQrcodePath() {
        return qrcodePath;
    }

    public void setQrcodePath(String qrcodePath) {
        this.qrcodePath = qrcodePath;
    }

    public Timestamp getRegTime() {
        return regTime;
    }

    public void setRegTime(Timestamp regTime) {
        this.regTime = regTime;
    }

    public Timestamp getStartUpTime() {
        return startUpTime;
    }

    public void setStartUpTime(Timestamp startUpTime) {
        this.startUpTime = startUpTime;
    }

    public Timestamp getShutDownTime() {
        return shutDownTime;
    }

    public void setShutDownTime(Timestamp shutDownTime) {
        this.shutDownTime = shutDownTime;
    }

    public Timestamp getRestartTime() {
        return restartTime;
    }

    public void setRestartTime(Timestamp restartTime) {
        this.restartTime = restartTime;
    }

    public Timestamp getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Timestamp lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public String getDevNote() {
        return devNote;
    }

    public void setDevNote(String devNote) {
        this.devNote = devNote;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getDevAddr() {
        return devAddr;
    }

    public void setDevAddr(String devAddr) {
        this.devAddr = devAddr;
    }

    public String getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(String coordinateX) {
        this.coordinateX = coordinateX;
    }

    public String getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(String coordinateY) {
        this.coordinateY = coordinateY;
    }

    public RegionInfo getRegionInfo() {
        return regionInfo;
    }

    public void setRegionInfo(RegionInfo regionInfo) {
        this.regionInfo = regionInfo;
    }
}

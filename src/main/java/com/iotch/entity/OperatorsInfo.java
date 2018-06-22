package com.iotch.entity;

import java.sql.Timestamp;
import java.util.List;

public class OperatorsInfo {
    private String oprCode;//运营商编码
    private String oprName;//运营商名称
    private String oprPhone;//运营商手机号
    private String OprLogo;//运营商LOGO
    private RoleInfo roleInfo;//运营商角色信息
    private String oprLevel;//运营等级
    private String parentCode;//上级运营商编码(父级运营商编码)
    private String oprAccount;//运营商账号(默认手机号)
    private String oprPassword;//运营商密码
    private String oprStatus;//运营商状态
    private Timestamp oprRegDate;//运营商注册日期
    private Timestamp lastEditTime;//最后一次编辑时间
    private String oprNote;//运营商备注信息
    private List<OperatorsInfo> subOprList;//下属运营商集合

    public OperatorsInfo() {
    }

    public OperatorsInfo(String oprCode, String oprName, String oprPhone, String oprLogo, RoleInfo roleInfo, String oprLevel, String parentCode, String oprAccount, String oprPassword, String oprStatus, Timestamp oprRegDate, Timestamp lastEditTime, String oprNote, List<OperatorsInfo> subOprList) {
        this.oprCode = oprCode;
        this.oprName = oprName;
        this.oprPhone = oprPhone;
        OprLogo = oprLogo;
        this.roleInfo = roleInfo;
        this.oprLevel = oprLevel;
        this.parentCode = parentCode;
        this.oprAccount = oprAccount;
        this.oprPassword = oprPassword;
        this.oprStatus = oprStatus;
        this.oprRegDate = oprRegDate;
        this.lastEditTime = lastEditTime;
        this.oprNote = oprNote;
        this.subOprList = subOprList;
    }

    @Override
    public String toString() {
        return "OperatorsInfo{" +
                "oprCode='" + oprCode + '\'' +
                ", oprName='" + oprName + '\'' +
                ", oprPhone='" + oprPhone + '\'' +
                ", OprLogo='" + OprLogo + '\'' +
                ", roleInfo=" + roleInfo +
                ", oprLevel='" + oprLevel + '\'' +
                ", parentCode='" + parentCode + '\'' +
                ", oprAccount='" + oprAccount + '\'' +
                ", oprPassword='" + oprPassword + '\'' +
                ", oprStatus='" + oprStatus + '\'' +
                ", oprRegDate=" + oprRegDate +
                ", lastEditTime=" + lastEditTime +
                ", oprNote='" + oprNote + '\'' +
                ", subOprList=" + subOprList +
                '}';
    }

    public String getOprCode() {
        return oprCode;
    }

    public void setOprCode(String oprCode) {
        this.oprCode = oprCode;
    }

    public String getOprName() {
        return oprName;
    }

    public void setOprName(String oprName) {
        this.oprName = oprName;
    }

    public String getOprPhone() {
        return oprPhone;
    }

    public void setOprPhone(String oprPhone) {
        this.oprPhone = oprPhone;
    }

    public String getOprLogo() {
        return OprLogo;
    }

    public void setOprLogo(String oprLogo) {
        OprLogo = oprLogo;
    }

    public RoleInfo getRoleInfo() {
        return roleInfo;
    }

    public void setRoleInfo(RoleInfo roleInfo) {
        this.roleInfo = roleInfo;
    }

    public String getOprLevel() {
        return oprLevel;
    }

    public void setOprLevel(String oprLevel) {
        this.oprLevel = oprLevel;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getOprAccount() {
        return oprAccount;
    }

    public void setOprAccount(String oprAccount) {
        this.oprAccount = oprAccount;
    }

    public String getOprPassword() {
        return oprPassword;
    }

    public void setOprPassword(String oprPassword) {
        this.oprPassword = oprPassword;
    }

    public String getOprStatus() {
        return oprStatus;
    }

    public void setOprStatus(String oprStatus) {
        this.oprStatus = oprStatus;
    }

    public Timestamp getOprRegDate() {
        return oprRegDate;
    }

    public void setOprRegDate(Timestamp oprRegDate) {
        this.oprRegDate = oprRegDate;
    }

    public Timestamp getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Timestamp lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public String getOprNote() {
        return oprNote;
    }

    public void setOprNote(String oprNote) {
        this.oprNote = oprNote;
    }

    public List<OperatorsInfo> getSubOprList() {
        return subOprList;
    }

    public void setSubOprList(List<OperatorsInfo> subOprList) {
        this.subOprList = subOprList;
    }
}

package com.iotch.entity;

import java.sql.Timestamp;

public class UserInfo {
    private String userCode;
    private String userName;
    private String userPassword;
    private String userPhone;
    private RoleInfo roleInfo;
    private Timestamp userCreateTime;
    private Timestamp lastEditTime;
    private OperatorsInfo operatorsInfo;
    private String userStatus;
    private String userAddr;
    private String userPostCode;
    private String userCompany;
    private String userTel;
    private String userNote;

    public UserInfo() {
    }

    public UserInfo(String userCode, String userName, String userPassword, String userPhone, RoleInfo roleInfo, Timestamp userCreateTime, Timestamp lastEditTime, OperatorsInfo operatorsInfo, String userStatus, String userAddr, String userPostCode, String userCompany, String userTel, String userNote) {
        this.userCode = userCode;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userPhone = userPhone;
        this.roleInfo = roleInfo;
        this.userCreateTime = userCreateTime;
        this.lastEditTime = lastEditTime;
        this.operatorsInfo = operatorsInfo;
        this.userStatus = userStatus;
        this.userAddr = userAddr;
        this.userPostCode = userPostCode;
        this.userCompany = userCompany;
        this.userTel = userTel;
        this.userNote = userNote;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userCode='" + userCode + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", roleInfo=" + roleInfo +
                ", userCreateTime=" + userCreateTime +
                ", lastEditTime=" + lastEditTime +
                ", operatorsInfo=" + operatorsInfo +
                ", userStatus='" + userStatus + '\'' +
                ", userAddr='" + userAddr + '\'' +
                ", userPostCode='" + userPostCode + '\'' +
                ", userCompany='" + userCompany + '\'' +
                ", userTel='" + userTel + '\'' +
                ", userNote='" + userNote + '\'' +
                '}';
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public RoleInfo getRoleInfo() {
        return roleInfo;
    }

    public void setRoleInfo(RoleInfo roleInfo) {
        this.roleInfo = roleInfo;
    }

    public Timestamp getUserCreateTime() {
        return userCreateTime;
    }

    public void setUserCreateTime(Timestamp userCreateTime) {
        this.userCreateTime = userCreateTime;
    }

    public Timestamp getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Timestamp lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public OperatorsInfo getOperatorsInfo() {
        return operatorsInfo;
    }

    public void setOperatorsInfo(OperatorsInfo operatorsInfo) {
        this.operatorsInfo = operatorsInfo;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    public String getUserPostCode() {
        return userPostCode;
    }

    public void setUserPostCode(String userPostCode) {
        this.userPostCode = userPostCode;
    }

    public String getUserCompany() {
        return userCompany;
    }

    public void setUserCompany(String userCompany) {
        this.userCompany = userCompany;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserNote() {
        return userNote;
    }

    public void setUserNote(String userNote) {
        this.userNote = userNote;
    }
}

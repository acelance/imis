package com.iotch.entity;

public class FactoryInfo {
    private String factoryCode;//厂商编码
    private String factoryName;//厂商名称
    private String factoryAddr;//厂商地址
    private String factoryTel;//厂商电话
    private String contact;//联系人
    private String note;//备注信息

    public FactoryInfo() {
    }

    public FactoryInfo(String factoryCode, String factoryName, String factoryAddr, String factoryTel, String contact, String note) {
        this.factoryCode = factoryCode;
        this.factoryName = factoryName;
        this.factoryAddr = factoryAddr;
        this.factoryTel = factoryTel;
        this.contact = contact;
        this.note = note;
    }

    @Override
    public String toString() {
        return "FactoryInfo{" +
                "factoryCode='" + factoryCode + '\'' +
                ", factoryName='" + factoryName + '\'' +
                ", factoryAddr='" + factoryAddr + '\'' +
                ", factoryTel='" + factoryTel + '\'' +
                ", contact='" + contact + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

    public String getFactoryCode() {
        return factoryCode;
    }

    public void setFactoryCode(String factoryCode) {
        this.factoryCode = factoryCode;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getFactoryAddr() {
        return factoryAddr;
    }

    public void setFactoryAddr(String factoryAddr) {
        this.factoryAddr = factoryAddr;
    }

    public String getFactoryTel() {
        return factoryTel;
    }

    public void setFactoryTel(String factoryTel) {
        this.factoryTel = factoryTel;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

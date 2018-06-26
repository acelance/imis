package com.iotch.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;
public class MenuInfo implements Serializable {
    private String menuCode;//菜单编码
    private String menuName;//菜单名称
    private String subsetName;//子集名称
    private String bitmapName;//图标名称
    private String objectName;//对象名称
    private String objectURL;//对象URL
    private String objectType;//对象类型(0:菜单,1:按钮)
    private String parentCode;//父级菜单编码
    private List<MenuInfo> subMenuList;

    public MenuInfo() {
    }

    public MenuInfo(String menuCode, String menuName, String subsetName, String bitmapName, String objectName, String objectURL, String objectType, String parentCode, List<MenuInfo> subMenuList) {
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.subsetName = subsetName;
        this.bitmapName = bitmapName;
        this.objectName = objectName;
        this.objectURL = objectURL;
        this.objectType = objectType;
        this.parentCode = parentCode;
        this.subMenuList = subMenuList;
    }

    @Override
    public String toString() {
        return "MenuInfo{" +
                "menuCode='" + menuCode + '\'' +
                ", menuName='" + menuName + '\'' +
                ", subsetName='" + subsetName + '\'' +
                ", bitmapName='" + bitmapName + '\'' +
                ", objectName='" + objectName + '\'' +
                ", objectURL='" + objectURL + '\'' +
                ", objectType='" + objectType + '\'' +
                ", parentCode='" + parentCode + '\'' +
                ", subMenuList=" + subMenuList +
                '}';
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getSubsetName() {
        return subsetName;
    }

    public void setSubsetName(String subsetName) {
        this.subsetName = subsetName;
    }

    public String getBitmapName() {
        return bitmapName;
    }

    public void setBitmapName(String bitmapName) {
        this.bitmapName = bitmapName;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getObjectURL() {
        return objectURL;
    }

    public void setObjectURL(String objectURL) {
        this.objectURL = objectURL;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public List<MenuInfo> getSubMenuList() {
        return subMenuList;
    }

    public void setSubMenuList(List<MenuInfo> subMenuList) {
        this.subMenuList = subMenuList;
    }
}

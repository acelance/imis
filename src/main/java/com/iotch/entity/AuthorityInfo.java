package com.iotch.entity;

import java.io.Serializable;

public class AuthorityInfo implements Serializable {
    private String authCode;//页面中的权限编码
    private String authName;//页面中的权限名
    private MenuInfo menuInfo;//所属菜单信息
    private String authNote;//权限备注信息
    private String authBitmap;//权限图标
    private String authURL;//该权限包含需要请求的URL

    public AuthorityInfo() {
    }

    public AuthorityInfo(String authCode, String authName, MenuInfo menuInfo, String authNote, String authBitmap, String authURL) {
        this.authCode = authCode;
        this.authName = authName;
        this.menuInfo = menuInfo;
        this.authNote = authNote;
        this.authBitmap = authBitmap;
        this.authURL = authURL;
    }

    @Override
    public String toString() {
        return "AuthorityInfo{" +
                "authCode='" + authCode + '\'' +
                ", authName='" + authName + '\'' +
                ", menuInfo=" + menuInfo +
                ", authNote='" + authNote + '\'' +
                ", authBitmap='" + authBitmap + '\'' +
                ", authURL='" + authURL + '\'' +
                '}';
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public MenuInfo getMenuInfo() {
        return menuInfo;
    }

    public void setMenuInfo(MenuInfo menuInfo) {
        this.menuInfo = menuInfo;
    }

    public String getAuthNote() {
        return authNote;
    }

    public void setAuthNote(String authNote) {
        this.authNote = authNote;
    }

    public String getAuthBitmap() {
        return authBitmap;
    }

    public void setAuthBitmap(String authBitmap) {
        this.authBitmap = authBitmap;
    }

    public String getAuthURL() {
        return authURL;
    }

    public void setAuthURL(String authURL) {
        this.authURL = authURL;
    }
}

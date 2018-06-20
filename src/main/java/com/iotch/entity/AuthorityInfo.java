package com.iotch.entity;

public class AuthorityInfo {
    private String authCode;
    private String authName;
    private MenuInfo menuInfo;
    private String authNote;
    private String authBitmap;
    private String authURL;

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

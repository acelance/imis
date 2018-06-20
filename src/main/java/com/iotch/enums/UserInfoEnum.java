package com.iotch.enums;

public enum UserInfoEnum {
    FAIL(-1,"操作失败"),
    CHECK(0,"审核中"),
    SUCCESS(1,"操作成功"),
    PASS(2,"通过审核"),
    INNER_ERROR(-1001,"系统内部错误"),
    NULL_ID(-1002,"空ID异常"),
    NULL_USER(-1003,"userInfo信息为空"),
    NULL_ROLE(-1004,"userRole角色信息为空");

    private int state;
    private String stateInfo;

    private UserInfoEnum(int state, String stateInfo){
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public static UserInfoEnum stateOf(int state){
        for (UserInfoEnum userEnum:values()) {
            return userEnum;
        }
        return null;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }
}

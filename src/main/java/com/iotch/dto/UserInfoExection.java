package com.iotch.dto;

import com.iotch.entity.UserInfo;
import com.iotch.enums.UserInfoEnum;

import java.util.List;

public class UserInfoExection {
    //结果状态
    private int state;
    //状态标识
    private String stateInfo;
    //用户数量
    private int count;
    //被操作的用户
    private UserInfo userInfo;
    //用户列表
    private List<UserInfo> userInfoList;

    public UserInfoExection() {
    }
    //当操作用户失败时候使用的构造器
    public UserInfoExection(UserInfoEnum userInfoEnum) {
        this.state = userInfoEnum.getState();
        this.stateInfo = userInfoEnum.getStateInfo();
    }
    //当操作用户成功时候使用的构造器
    public UserInfoExection(UserInfoEnum userInfoEnum, UserInfo userInfo) {
        this.state = userInfoEnum.getState();
        this.stateInfo = userInfoEnum.getStateInfo();
        this.userInfo = userInfo;
    }

    //当操作用户成功时候使用的构造器
    public UserInfoExection(UserInfoEnum userInfoEnum, List<UserInfo> userInfoList) {
        this.state = userInfoEnum.getState();
        this.stateInfo = userInfoEnum.getStateInfo();
        this.userInfoList = userInfoList;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<UserInfo> getUserInfoList() {
        return userInfoList;
    }

    public void setUserInfoList(List<UserInfo> userInfoList) {
        this.userInfoList = userInfoList;
    }
}

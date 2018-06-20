package com.iotch.service;

import com.iotch.entity.UserInfo;

import javax.servlet.http.HttpSession;

public interface UserInfoService {
    public UserInfo getUserById(String userCode);

    public UserInfo login(String userCode, String userPassword, HttpSession session);
}

package com.iotch.service.impl;

import com.iotch.dao.UserInfoDao;
import com.iotch.entity.UserInfo;
import com.iotch.service.UserInfoService;
import com.iotch.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo getUserById(String userCode) {
        return null;
    }

    @Override
    public UserInfo login(String userCode, String userPassword, HttpSession session) {
        UserInfo loginUser = new UserInfo();
        String pass = MD5Util.string2MD5(userPassword);
        loginUser.setUserCode(userCode);
        loginUser.setUserPassword(pass);
        List<UserInfo> userInfoList = userInfoDao.selectMatchEntity(loginUser);
        if(userInfoList!=null && userInfoList.size()>0){
            UserInfo userInfo = userInfoList.get(0);
            if(userInfo!=null && userInfo.getUserCode()!=null){
                return userInfo;
            }
        }
        return null;
    }
}

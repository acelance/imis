package com.iotch.dao;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.iotch.BaseTest;

import com.iotch.entity.OperatorsInfo;
import com.iotch.entity.RoleInfo;
import com.iotch.entity.UserInfo;
import com.iotch.util.MD5Util;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class UserInfoDaoTest extends BaseTest {
    @Autowired
    private UserInfoDao userInfoDao;

    @Test
    public void insertTest(){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserCode("00001");
        userInfo.setUserName("测试用户");
        userInfo.setUserPassword(MD5Util.string2MD5("123456"));
        userInfo.setUserPhone("13200001111");
        RoleInfo roleInfo = new RoleInfo();
        roleInfo.setRoleCode("0");
        userInfo.setRoleInfo(roleInfo);
        userInfo.setUserCreateTime(new Timestamp(new Date().getTime()));
        OperatorsInfo operatorsInfo = new OperatorsInfo();
        operatorsInfo.setOprCode("0");
        userInfo.setOperatorsInfo(operatorsInfo);
        int effectRow = userInfoDao.insert(userInfo);
        System.out.println(effectRow);
    }

    @Test
    public void updateByPKTest(){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserCode("00001");
        userInfo.setLastEditTime(new Timestamp(new Date().getTime()));
        userInfo.setUserStatus("1");
        int effectRow = userInfoDao.updateByPK(userInfo);
        System.out.println(effectRow);
    }

    @Test
    public void deleteByPKTest(){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserCode("00001");
        int effectRow = userInfoDao.deleteByPK(userInfo);
        System.out.println(effectRow);
    }

    @Test
    public void selectAllTest(){
        List<UserInfo> userInfoList = userInfoDao.selectAll();
        System.out.println(userInfoList);
    }

    @Test
    public void selectByIdTest(){
        UserInfo userInfo = userInfoDao.selectById("00000");
        System.out.println(userInfo.toString());
    }


    @Test
    public  void selectByUserNameTest(){
        List<UserInfo> list = userInfoDao.selectByUserName("超级管理员");
        String jsonString = JSON.toJSONString(list);
        System.out.println(jsonString);
    }

    @Test
    public void selectMatchEntityTest(){
        UserInfo loginUser = new UserInfo();
        String pass = MD5Util.string2MD5("123456");
        loginUser.setUserCode("00001");
        loginUser.setUserPassword(pass);
        List<UserInfo> userInfoList = userInfoDao.selectMatchEntity(loginUser);
        String jsonString = JSON.toJSONString(userInfoList);
        System.out.println(jsonString);
    }

    @Test
    public void selectByUserCodeTest(){
        List<UserInfo> list = userInfoDao.selectByUserCode("00001");
        String jsonString = JSON.toJSONString(list);
        System.out.println(jsonString);
    }
}

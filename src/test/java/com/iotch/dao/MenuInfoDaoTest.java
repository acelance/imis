package com.iotch.dao;

import com.iotch.BaseTest;
import com.iotch.entity.MenuInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MenuInfoDaoTest extends BaseTest {
    @Autowired
    private MenuInfoDao menuInfoDao;

    @Test
    public void insertTest(){
        MenuInfo menuInfo = new MenuInfo();
        menuInfo.setMenuCode("99");
        menuInfo.setMenuName("测试插入菜单");
        int effectRow = menuInfoDao.insert(menuInfo);
        System.out.println("effectRow:"+effectRow);
        assertEquals(1,effectRow);
    }

    @Test
    public void updateByPKTest(){
        MenuInfo menuInfo = new MenuInfo();
        menuInfo.setMenuCode("99");
        menuInfo.setObjectName("TEST-INSERT-MENU");
        int effectRow = menuInfoDao.updateByPK(menuInfo);
        System.out.println("effectRow:"+effectRow);
        assertEquals(1,effectRow);
    }

    @Test
    public void deleteByPK(){
        MenuInfo menuInfo = new MenuInfo();
        menuInfo.setMenuCode("99");
        int effectRow = menuInfoDao.deleteByPK(menuInfo);
        System.out.println("effectRow:"+effectRow);
        assertEquals(1,effectRow);
    }

    @Test
    public void selectAllTest(){
        List<MenuInfo> menuInfoList = menuInfoDao.selectAll();
        System.out.println(menuInfoList.toString());
        System.out.println("size:"+menuInfoList.size());
    }

    @Test
    public void selectByIdTest(){
        MenuInfo menuInfo = menuInfoDao.selectById("0201");
        System.out.println(menuInfo.toString());
    }

    @Test
    public void selectMatchEntityTest(){
        MenuInfo menuInfo = new MenuInfo();
        menuInfo.setMenuName("收入统计");
        menuInfo.setParentCode("03");
        List<MenuInfo> menuInfoList = menuInfoDao.selectMatchEntity(menuInfo);
        System.out.println(menuInfoList.toString());
        System.out.println("size:"+menuInfoList.size());
    }

    @Test
    public void selectL1MenuByUserCodeTest(){
        List<MenuInfo> menuInfoList = menuInfoDao.selectL1MenuByUserCode("00000");
        System.out.println(menuInfoList.toString());
        System.out.println("size:"+menuInfoList.size());
    }

    @Test
    public void selectSubListByParentCodeTest(){
        List<MenuInfo> menuInfoList = menuInfoDao.selectSubListByParentCode("00000", "02", "0");
        System.out.println(menuInfoList.toString());
        System.out.println("size:"+menuInfoList.size());
    }
}

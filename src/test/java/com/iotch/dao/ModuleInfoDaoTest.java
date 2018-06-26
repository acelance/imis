package com.iotch.dao;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.iotch.BaseTest;
import com.iotch.entity.ModuleInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ModuleInfoDaoTest extends BaseTest {
    @Autowired
    private ModuleInfoDao moduleInfoDao;

    @Test
    public void insertTest(){
        ModuleInfo moduleInfo = new ModuleInfo();
        moduleInfo.setModuleCode("测试001");
        moduleInfo.setModuleName("测试模块");
        int effectRow = moduleInfoDao.insert(moduleInfo);
        System.out.println("effectRow:"+effectRow);
        assertEquals(1,effectRow);
    }

    @Test
    public void updateByPKTest(){
        ModuleInfo moduleInfo = new ModuleInfo();
        moduleInfo.setModuleCode("测试001");
        moduleInfo.setModuleName("测试模块1");
        int effectRow = moduleInfoDao.updateByPK(moduleInfo);
        System.out.println("effectRow:"+effectRow);
        assertEquals(1,effectRow);
    }

    @Test
    public void deleteByPK(){
        ModuleInfo moduleInfo = new ModuleInfo();
        moduleInfo.setModuleCode("测试001");
        int effectRow = moduleInfoDao.deleteByPK(moduleInfo);
        System.out.println("effectRow:"+effectRow);
        assertEquals(1,effectRow);
    }

    @Test
    public void selectAllTest(){
        PageHelper.startPage(1,2);
        List<ModuleInfo> moduleInfoList = moduleInfoDao.selectAll();
        PageInfo<ModuleInfo> pageInfo = new PageInfo<ModuleInfo>(moduleInfoList);
        String jsonString = JSON.toJSONString(pageInfo);
        System.out.println(jsonString);
    }

    @Test
    public void selectByIdTest(){
        ModuleInfo moduleInfo = moduleInfoDao.selectById("测试001");
        System.out.println("moduleInfo:"+moduleInfo);
        assertEquals("测试001",moduleInfo.getModuleCode());
    }

    @Test
    public void selectMatchEntity(){
        ModuleInfo moduleInfo = new ModuleInfo();
        moduleInfo.setModuleCode("测试001");
        moduleInfo.setModuleName("测试模块");
        List<ModuleInfo> moduleInfoList = moduleInfoDao.selectMatchEntity(moduleInfo);
        System.out.println("moduleInfoList:"+moduleInfoList.toString());
        assertEquals(1,moduleInfoList.size());
    }
}

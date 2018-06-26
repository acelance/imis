package com.iotch.dao;

import com.iotch.BaseTest;
import com.iotch.entity.ModuleFault;
import com.iotch.entity.ModuleInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ModuleFaultDaoTest extends BaseTest{
    @Autowired
    private ModuleFaultDao moduleFaultDao;
    @Autowired
    private ModuleInfoDao moduleInfoDao;

    @Test
    public void insertTest(){
        ModuleFault moduleFault = new ModuleFault();
        moduleFault.setModFaultCode("测试模块错误01");
        moduleFault.setModFualtName("测试模块错误名称");
        ModuleInfo moduleInfo = moduleInfoDao.selectById("测试001");
        if(moduleInfo!=null && moduleInfo.getModuleCode()!=null){
            moduleFault.setModuleInfo(moduleInfo);
            int effectRow = moduleFaultDao.insert(moduleFault);
            System.out.println("effectRow:"+effectRow);
            assertEquals(1,effectRow);
        }
    }

    @Test
    public void updateByPKTest(){
        ModuleFault moduleFault = new ModuleFault();
        moduleFault.setModFaultCode("测试模块错误01");
        moduleFault.setModFualtName("测试模块错误Name");
        int effectRow = moduleFaultDao.updateByPK(moduleFault);
        System.out.println("effectRow:"+effectRow);
        assertEquals(1,effectRow);
    }

    @Test
    public void deleteByPKTest(){
        ModuleFault moduleFault = new ModuleFault();
        moduleFault.setModFaultCode("测试模块错误01");
        int effectRow = moduleFaultDao.deleteByPK(moduleFault);
        System.out.println("effectRow:"+effectRow);
        assertEquals(1,effectRow);
    }

    @Test
    public void selectAllTest(){
        List<ModuleFault> moduleFaultList = moduleFaultDao.selectAll();
        System.out.println(moduleFaultList.toString());
        assertEquals(1,moduleFaultList.size());
    }

    @Test
    public void selectByIdTest(){
        ModuleFault moduleFault = moduleFaultDao.selectById("测试模块错误01");
        System.out.println(moduleFault.toString());
        assertEquals("测试模块错误01",moduleFault.getModFaultCode());
    }

    @Test
    public void selectMatchEntityTest(){
        ModuleFault moduleFault = new ModuleFault();
        moduleFault.setModFaultCode("测试模块错误01");
        moduleFault.setModFualtName("测试模块错误名称");
        List<ModuleFault> moduleFaultList = moduleFaultDao.selectMatchEntity(moduleFault);
        System.out.println(moduleFaultList.toString());
        assertEquals(1,moduleFaultList.size());
    }

}

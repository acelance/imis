package com.iotch.dao;

import com.iotch.BaseTest;
import com.iotch.entity.MonitorInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MonitorInfoDaoTest extends BaseTest {
    @Autowired
    private  MonitorInfoDao monitorInfoDao;

    @Test
    public void insertTest(){
        MonitorInfo monitorInfo = new MonitorInfo();
        monitorInfo.setMonitorCode("测试监控编号");
        monitorInfo.setMonitorName("测试监控名称");
        monitorInfo.setNote("备注信息");
        int effectRow = monitorInfoDao.insert(monitorInfo);
        System.out.println("effectRow:"+effectRow);
        assertEquals(1,effectRow);
    }

    @Test
    public void updateByPKTest(){
        MonitorInfo monitorInfo = new MonitorInfo();
        monitorInfo.setMonitorCode("测试监控编号");
        monitorInfo.setMonitorName("测试监控Name");
        monitorInfo.setNote("Note信息");
        int effectRow = monitorInfoDao.updateByPK(monitorInfo);
        System.out.println("effectRow:"+effectRow);
        assertEquals(1,effectRow);
    }

    @Test
    public void deleteByPK(){
        MonitorInfo monitorInfo = new MonitorInfo();
        monitorInfo.setMonitorCode("测试监控编号");
        int effectRow = monitorInfoDao.deleteByPK(monitorInfo);
        System.out.println("effectRow:"+effectRow);
        assertEquals(1,effectRow);
    }

    @Test
    public void selectAllTest(){
        List<MonitorInfo> monitorInfoList = monitorInfoDao.selectAll();
        System.out.println(monitorInfoList.toString());
        assertEquals(1,monitorInfoList.size());
    }

    @Test
    public void selectByIdTest(){
        MonitorInfo monitorInfo = monitorInfoDao.selectById("测试监控编号");
        System.out.println(monitorInfo.toString());
        assertEquals("测试监控名称",monitorInfo.getMonitorName());
    }

    @Test
    public void selectMatchEntityTest(){
        MonitorInfo monitorInfo = new MonitorInfo();
        monitorInfo.setMonitorCode("测试监控编号");
        monitorInfo.setMonitorName("测试监控名称");
        monitorInfo.setNote("备注信息");
        List<MonitorInfo> monitorInfoList = monitorInfoDao.selectMatchEntity(monitorInfo);
        System.out.println(monitorInfoList.toString());
        assertEquals(1,monitorInfoList.size());
    }
}

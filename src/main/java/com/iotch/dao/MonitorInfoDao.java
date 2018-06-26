package com.iotch.dao;

import com.iotch.entity.MonitorInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface MonitorInfoDao /*extends Mapper<MonitorInfo>*/{
    int insert(MonitorInfo monitorInfo);
    int deleteByPK(MonitorInfo monitorInfo);
    int updateByPK(MonitorInfo monitorInfo);
    List<MonitorInfo> selectAll();
    MonitorInfo selectById(@Param("monitorCode") String monitorCode);//@Param("monitorCode")与mapper中sql与的命名参数一致#{monitorCode}
    List<MonitorInfo> selectMatchEntity(MonitorInfo monitorInfo);
}

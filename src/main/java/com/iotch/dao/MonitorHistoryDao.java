package com.iotch.dao;

import com.iotch.entity.MonitorHistory;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface MonitorHistoryDao /*extends Mapper<MonitorHistory>*/ {
    int insert(MonitorHistory monitorHistory);
    int deleteByPK(MonitorHistory monitorHistory);
    int updateByPK(MonitorHistory monitorHistory);
    List<MonitorHistory> selectAll();
    MonitorHistory selectById(@Param("historyCode") String historyCode);//@Param("historyCode")与mapper中sql与的命名参数一致#{historyCode}
    List<MonitorHistory> selectMatchEntity(MonitorHistory monitorHistory);
}

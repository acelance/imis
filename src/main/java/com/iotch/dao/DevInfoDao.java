package com.iotch.dao;

import com.iotch.entity.DevInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface DevInfoDao /*extends Mapper<DevInfo>*/ {
    int insert(DevInfo devInfo);
    int deleteByPK(DevInfo devInfo);
    int updateByPK(DevInfo devInfo);
    List<DevInfo> selectAll();
    DevInfo selectById(@Param("devCode") String devCode);//@Param("devCode")与mapper中sql与的命名参数一致#{devCode}
    List<DevInfo> selectMatchEntity(DevInfo devInfo);
}

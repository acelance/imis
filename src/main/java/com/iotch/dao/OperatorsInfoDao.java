package com.iotch.dao;

import com.iotch.entity.OperatorsInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface OperatorsInfoDao /*extends Mapper<OperatorsInfo>*/ {
    OperatorsInfo selectById(@Param("oprCode") String oprCode);//@Param("oprCode")与mapper中sql与的命名参数一致#{oprCode}
    List<OperatorsInfo> selectMatchEntity(OperatorsInfo monitorInfo);
}

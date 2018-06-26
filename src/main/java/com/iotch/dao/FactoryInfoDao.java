package com.iotch.dao;

import com.iotch.entity.FactoryInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface FactoryInfoDao /*extends Mapper<FactoryInfo>*/ {
    FactoryInfo selectById(@Param("factoryCode") String factoryCode);//@Param("factoryCode")与mapper中sql与的命名参数一致#{factoryCode}
}

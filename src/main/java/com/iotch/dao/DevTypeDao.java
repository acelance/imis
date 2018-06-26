package com.iotch.dao;

import com.iotch.entity.DevType;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface DevTypeDao /*extends Mapper<DevType>*/ {
    DevType selectById(@Param("devTypeCode") String devTypeCode);//@Param("devTypeCode")与mapper中sql与的命名参数一致#{devTypeCode}
}

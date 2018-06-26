package com.iotch.dao;

import com.iotch.entity.DevModuleStatus;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface DevModuleStatusDao /*extends Mapper<DevModuleStatus>*/ {
    DevModuleStatus selectById(@Param("modFaultCode") String modFaultCode);//@Param("modFaultCode")与mapper中sql与的命名参数一致#{modFaultCode}
}

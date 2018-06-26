package com.iotch.dao;

import com.iotch.entity.DevAisle;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface DevAisleDao /*extends Mapper<DevAisle>*/ {
    DevAisle selectByDevCode(@Param("devCode") String devCode);//@Param("devCode")与mapper中sql与的命名参数一致#{devCode}
    DevAisle selectByAisleCode(@Param("aisleCode") String aisleCode);//@Param("aisleCode")与mapper中sql与的命名参数一致#{aisleCode}
}

package com.iotch.dao;

import com.iotch.entity.DevActiveCode;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface DevActiveCodeDao /*extends Mapper<DevActiveCode>*/ {
    DevActiveCode selectByDevCode(@Param("devCode") String devCode);//@Param("devCode")与mapper中sql与的命名参数一致#{devCode}
    DevActiveCode selectByActiveCode(@Param("devCode") String activeCode);//@Param("activeCode")与mapper中sql与的命名参数一致#{activeCode}
}

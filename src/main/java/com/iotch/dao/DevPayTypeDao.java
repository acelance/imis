package com.iotch.dao;

import com.iotch.entity.DevPayType;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface DevPayTypeDao /*extends Mapper<DevPayType>*/ {
    List<DevPayType> selectByDevCode(@Param("devCode") String devCode);//@Param("devCode")与mapper中sql与的命名参数一致#{devCode}
    List<DevPayType> selectByPayType(@Param("payType") String payType);//@Param("payType")与mapper中sql与的命名参数一致#{payType}
}

package com.iotch.dao;

import com.iotch.entity.BusinessFormat;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BusinessFormatDao /*extends Mapper<BusinessFormat> */{
    BusinessFormat selectById(@Param("userCode") String formatCode);//@Param("formatCode")与mapper中sql与的命名参数一致#{formatCode}
}

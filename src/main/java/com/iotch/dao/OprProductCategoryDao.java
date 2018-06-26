package com.iotch.dao;

import com.iotch.entity.OprProductCategory;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface OprProductCategoryDao /*extends Mapper<OprProductCategory>*/{
    List<OprProductCategory> selectByProductCategoryId(@Param("productCategoryId") String productCategoryId);//@Param("productCategoryId")与mapper中sql与的命名参数一致#{productCategoryId}
    List<OprProductCategory> selectByOprCode(@Param("oprCode") String oprCode);//@Param("oprCode")与mapper中sql与的命名参数一致#{oprCode}
    List<OprProductCategory> selectMatchEntity(OprProductCategory oprProductCategory);
}

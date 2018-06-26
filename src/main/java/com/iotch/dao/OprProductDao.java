package com.iotch.dao;

import com.iotch.entity.OprProduct;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface OprProductDao /*extends Mapper<OprProduct>*/ {
    List<OprProduct> selectByProductCode(@Param("productCode") String productCode);//@Param("productCode")与mapper中sql与的命名参数一致#{productCode}
    List<OprProduct> selectByOprCode(@Param("oprCode") String oprCode);//@Param("oprCode")与mapper中sql与的命名参数一致#{oprCode}
    List<OprProduct> selectMatchEntity(OprProduct oprProduct);
}

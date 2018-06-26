package com.iotch.dao;

import com.iotch.entity.ProductInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ProductInfoDao /*extends Mapper<ProductInfo>*/{
    ProductInfo selectById(@Param("productCode") String productCode);//@Param("productCode")与mapper中sql与的命名参数一致#{productCode}
    List<ProductInfo> selectMatchEntity(ProductInfo productInfo);
}

package com.iotch.dao;

import com.iotch.entity.ProductCategory;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ProductCategoryDao /*extends Mapper<ProductCategory>*/ {
    ProductCategory selectById(@Param("productCategoryId") String productCategoryId);//@Param("productCategoryId")与mapper中sql与的命名参数一致#{productCategoryId}
    List<ProductCategory> selectMatchEntity(ProductCategory productCategory);
}

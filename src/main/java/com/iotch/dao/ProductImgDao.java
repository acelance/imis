package com.iotch.dao;

import com.iotch.entity.ProductImg;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ProductImgDao /*extends Mapper<ProductImg>*/ {
    ProductImg selectById(@Param("productImgId") String productImgId);//@Param("productImgId")与mapper中sql与的命名参数一致#{productImgId}
    List<ProductImg> selectMatchEntity(ProductImg productImg);
}

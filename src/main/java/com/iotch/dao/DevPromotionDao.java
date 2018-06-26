package com.iotch.dao;

import com.iotch.entity.DevPromotion;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface DevPromotionDao /*extends Mapper<DevPromotion>*/{
    List<DevPromotion> selectByDevCode(@Param("devCode") String devCode);//@Param("devCode")与mapper中sql与的命名参数一致#{devCode}
    List<DevPromotion> selectByPromotionCode(@Param("promotionCode") String promotionCode);//@Param("promotionCode")与mapper中sql与的命名参数一致#{promotionCode}
}

package com.iotch.dao;

import com.iotch.entity.PromotionInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PromotionInfoDao /*extends Mapper<PromotionInfo> */{
    PromotionInfo selectById(@Param("promotionCode") String promotionCode);//@Param("promotionCode")与mapper中sql与的命名参数一致#{promotionCode}
    List<PromotionInfo> selectMatchEntity(PromotionInfo promotionInfo);
}

package com.iotch.dao;

import com.iotch.entity.AisleInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface AisleInfoDao /*extends Mapper<AisleInfo>*/{
    int insert(AisleInfo aisleInfo);
    int deleteByPK(AisleInfo aisleInfo);
    int updateByPK(AisleInfo aisleInfo);
    List<AisleInfo> selectAll();
    AisleInfo selectById(@Param("userCode") String aisleCode);//@Param("aisleCode")与mapper中sql与的命名参数一致#{aisleCode}
    List<AisleInfo> selectMatchEntity(AisleInfo aisleInfo);
}

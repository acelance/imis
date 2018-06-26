package com.iotch.dao;

import com.iotch.entity.RegionInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface RegionInfoDao /*extends Mapper<RegionInfo>*/ {
    RegionInfo selectById(@Param("regionCode") String regionCode);//@Param("regionCode")与mapper中sql与的命名参数一致#{regionCode}
    List<RegionInfo> selectMatchEntity(RegionInfo regionInfo);
}

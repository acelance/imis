package com.iotch.dao;

import com.iotch.entity.RoleInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface RoleInfoDao /*extends Mapper<RoleInfo>*/ {
    RoleInfo selectById(@Param("roleCode") String roleCode);//@Param("roleCode")与mapper中sql与的命名参数一致#{roleCode}
}

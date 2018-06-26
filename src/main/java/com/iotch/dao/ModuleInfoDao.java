package com.iotch.dao;

import com.iotch.entity.ModuleInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ModuleInfoDao /*extends Mapper<ModuleInfo>*/ {
    int insert(ModuleInfo moduleInfo);
    int deleteByPK(ModuleInfo moduleInfo);
    int updateByPK(ModuleInfo moduleInfo);
    List<ModuleInfo> selectAll();
    ModuleInfo selectById(@Param("moduleCode") String moduleCode);//@Param("moduleCode")与mapper中sql与的命名参数一致#{moduleCode}
    List<ModuleInfo> selectMatchEntity(ModuleInfo moduleFault);
}

package com.iotch.dao;

import com.iotch.entity.ModuleFault;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ModuleFaultDao /*extends Mapper<ModuleFault>*/ {
    int insert(ModuleFault moduleFault);
    int deleteByPK(ModuleFault moduleFault);
    int updateByPK(ModuleFault moduleFault);
    List<ModuleFault> selectAll();
    ModuleFault selectById(@Param("modFaultCode") String modFaultCode);//@Param("modFaultCode")与mapper中sql与的命名参数一致#{modFaultCode}
    List<ModuleFault> selectMatchEntity(ModuleFault moduleFault);
}

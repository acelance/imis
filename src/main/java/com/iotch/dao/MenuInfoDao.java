package com.iotch.dao;

import com.iotch.entity.MenuInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface MenuInfoDao /*extends Mapper<MenuInfo>*/{
    int insert(MenuInfo menuInfo);
    int deleteByPK(MenuInfo menuInfo);
    int updateByPK(MenuInfo menuInfo);
    List<MenuInfo> selectAll();
    MenuInfo selectById(String menuCode);
    List<MenuInfo> selectMatchEntity(MenuInfo menuInfo);
    List<MenuInfo> selectL1MenuByUserCode(@Param("user_code")String userCode);
    List<MenuInfo> selectSubListByParentCode(@Param("user_code")String userCode,@Param("parent_code")String parentCode,@Param("object_type") String objectType);
}

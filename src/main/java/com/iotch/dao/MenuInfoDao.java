package com.iotch.dao;

import com.iotch.entity.MenuInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuInfoDao {
    int insert(MenuInfo menuInfo);

    int update(MenuInfo menuInfo);

    int delete(MenuInfo menuInfo);

    MenuInfo selectById(String menuCode);

    List<MenuInfo> selectAll();

    List<MenuInfo> selectMatchEntity(MenuInfo menuInfo);

    List<MenuInfo> selectL1MenuByUserCode(@Param("user_code")String userCode);

    List<MenuInfo> selectSubListByParentCode(@Param("user_code")String userCode,@Param("parent_code")String parentCode,@Param("object_type") String objectType);
}

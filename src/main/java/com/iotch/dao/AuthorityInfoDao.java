package com.iotch.dao;

import com.iotch.entity.AuthorityInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface AuthorityInfoDao /*extends Mapper<AuthorityInfo>*/ {

    AuthorityInfo selectById(@Param("authCode") String authCode);//@Param("authCode")与mapper中sql与的命名参数一致#{authCode}
}

package com.iotch.dao;

import com.iotch.entity.PayType;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
@Component
public interface PayTypeDao /*extends Mapper<PayType>*/ {
    int insert(PayType payType);
    int deleteByPK(PayType payType);
    int updateByPK(PayType payType);
    List<PayType> selectAll();
    PayType selectById(@Param("payTypeCode") String payTypeCode);//@Param("payTypeCode")与mapper中sql与的命名参数一致#{payTypeCode}
    List<PayType> selectMatchEntity(PayType payType);
}

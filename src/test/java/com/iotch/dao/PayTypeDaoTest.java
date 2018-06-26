package com.iotch.dao;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.iotch.BaseTest;
import com.iotch.entity.PayType;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class PayTypeDaoTest extends BaseTest {
    @Autowired
    private PayTypeDao payTypeDao;

    @Test
    public void selectAllTest(){
        PageHelper.startPage(1,4);
        List<PayType> payTypeList = payTypeDao.selectAll();
        PageInfo<PayType> pageInfo = new PageInfo<PayType>(payTypeList);
        String jsonString = JSON.toJSONString(pageInfo);
        System.out.println(jsonString);
    }



    @Test
    public void testSelectById(){
        PayType payType = payTypeDao.selectById("04");
        System.out.println(payType.toString());
    }




}

package com.allams.springcloud.dao;

import com.allams.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Payment8003Dao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}

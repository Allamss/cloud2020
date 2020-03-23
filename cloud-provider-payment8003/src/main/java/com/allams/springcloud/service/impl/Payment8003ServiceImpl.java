package com.allams.springcloud.service.impl;

import com.allams.springcloud.dao.Payment8003Dao;
import com.allams.springcloud.entities.Payment;
import com.allams.springcloud.service.Payment8003Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class Payment8003ServiceImpl implements Payment8003Service {
    @Resource
    private Payment8003Dao payment8003Dao;

    @Override
    public int create(Payment payment) {
        return payment8003Dao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return payment8003Dao.getPaymentById(id);
    }
}

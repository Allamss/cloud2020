package com.allams.springcloud.service;

import com.allams.springcloud.entities.Payment;

public interface Payment8003Service {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}

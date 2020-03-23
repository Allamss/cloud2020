package com.allams.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author Allams
 */
@Component
public class OrderFallbackService implements OrderService {
    @Override
    public String paymentInfoOk(Integer id) {
        return "解耦后的服务降级类的fallback方法";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "解耦后的服务降级类的fallback方法";
    }
}

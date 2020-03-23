package com.allams.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPost;

    @RequestMapping("/payment/zk")
    public String paymentzk() {
        return "springcloud with zookeeper: "+serverPost;
    }
}

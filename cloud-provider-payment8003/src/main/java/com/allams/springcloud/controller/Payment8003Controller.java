package com.allams.springcloud.controller;

import com.allams.springcloud.entities.CommonResult;
import com.allams.springcloud.entities.Payment;
import com.allams.springcloud.service.Payment8003Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class Payment8003Controller {
    @Resource
    private Payment8003Service payment8003Service;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = payment8003Service.create(payment);
        log.info("*****插入结果："+result);

        if (result > 0) {
            return new CommonResult(200, "插入数据库成功,serverPort:"+serverPort, result);
        }else {
            return new CommonResult(444, "插入数据库失败,serverPort:"+serverPort, null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        log.info("hahahah");
        Payment payment = payment8003Service.getPaymentById(id);
        log.info("*****查询结果："+payment);

        if (payment != null) {
            return new CommonResult(200, "查询成功,serverPort:"+serverPort, payment);
        }else {
            return new CommonResult(444, "没有对应记录，查询ID："+id+"serverPort:"+serverPort, null);
        }
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }

}


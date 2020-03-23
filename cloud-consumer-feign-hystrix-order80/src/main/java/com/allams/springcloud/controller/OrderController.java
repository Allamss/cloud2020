package com.allams.springcloud.controller;

import com.allams.springcloud.service.OrderService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Allams
 */
@RestController
@Slf4j
//@DefaultProperties(defaultFallback = "paymentGlobalFallbackMethod")
public class OrderController {
    @Resource
    OrderService orderService;

    @GetMapping(value = "consumer/payment/hystrix/ok/{id}")
    public String paymentInfoOk(@PathVariable("id") Integer id){
        return orderService.paymentInfoOk(id);
    }

    /*@GetMapping(value = "consumer/payment/hystrix/timeout/{id}")
    @HystrixCommand(fallbackMethod = "paymentInfoTimeOutFallbackMethod", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
    })*/
    //@HystrixCommand
    public String paymentInfoTimeOut(@PathVariable("id") Integer id){
        return orderService.paymentInfoTimeOut(id);
    }

    public String paymentInfoTimeOutFallbackMethod(@PathVariable("id") Integer id) {
        return "我是消费端，对方支付系统繁忙等10s后重试或者自己运行出错";
    }

    public String paymentGlobalFallbackMethod() {
        return "全局服务降级兜底方法，俺是默认的";
    }
}

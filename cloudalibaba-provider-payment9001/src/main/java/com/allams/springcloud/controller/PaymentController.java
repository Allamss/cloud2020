package com.allams.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Allams
 */
@RestController
@Slf4j
public class PaymentController {
    @GetMapping("/get/{str}")
    public String echo(@PathVariable String str) {
        return "Hello Nacos"+"  "+str;
    }
}

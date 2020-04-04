package com.allams.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Allams
 */
@RestController
public class FlowLimitController {

    @GetMapping(value = "/testA")
    public String testA() {
        return "---testA";
    }

    @GetMapping(value = "/testB")
    public String testB() {
        return "---testB";
    }

}

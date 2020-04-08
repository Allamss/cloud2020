package com.allams.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping(value = "/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "dealTestHotKey")
    public String testHotKey(@RequestParam(value = "p1", required = false)String p1,
                             @RequestParam(value = "p2", required = false)String p2) {
        return "testHotKey";
    }

    public String dealTestHotKey(String p1, String p2, BlockException exception) {
        return "俺来兜底了";
    }

}

package com.atguigu.springcloud.contoller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Slf4j
public class PaymentColler {
    @Value("${server.port}")
    private String serverport;

    @RequestMapping("/payment/zk")
    public String payemntzk() {
        return "springcloud with zookeeper:" + serverport + "\t" + UUID.randomUUID().toString();
    }
}


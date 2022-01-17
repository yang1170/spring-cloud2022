package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

public class PaymentController {
    @Value("${server.port}")
    private String serverport;

    @RequestMapping("/payment/consul")
    public String payemntConsul() {
        return "springcloud with consul:" + serverport + "\t " + UUID.randomUUID().toString();
    }
}

package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderCoControl {
//    public static final  String PAYMENT_URL ="http://localhost:8001";
//    http://localhost:8001/payment/get/1
    public static final String INVOKE_URL = "http://consul-provider-payment";
    @Resource
    private RestTemplate restTemplate;

   @GetMapping("/consumer/consul")
    public String payementInfo(){
       String result = restTemplate.getForObject(INVOKE_URL+"/payement/consul",String.class);
       return result;
   }

}

package com.wqj.springcloud.controller;

import com.wqj.springcloud.entitys.CommonResult;
import com.wqj.springcloud.entitys.Payment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderController {

    private final static String PAYMENT_URL = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping(value = "/consumer/payment/create")
    public ResponseEntity<CommonResult> create(Payment payment){
       return restTemplate.postForEntity(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
    }

    @GetMapping(value = "/consumer/payment/get/{id}")
    public ResponseEntity<CommonResult> getPaymentById(@PathVariable("id") Long id){
        return restTemplate.getForEntity(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }
}

package com.wqj.springcloud.service;

import com.wqj.springcloud.entitys.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}

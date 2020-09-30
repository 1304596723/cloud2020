package com.wqj.springcloud.dao;

import com.wqj.springcloud.entitys.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);

}

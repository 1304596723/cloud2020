package com.wqj.springcloud.service.ipml;

import com.wqj.springcloud.dao.PaymentDao;
import com.wqj.springcloud.entitys.Payment;
import com.wqj.springcloud.service.PaymentService;

import javax.annotation.Resource;

public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}

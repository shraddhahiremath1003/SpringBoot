package com.example.SpringBootIoCandDIdemo;

import org.springframework.stereotype.Service;

@Service
public class Razorpay implements PaymentService{
    @Override
    public String pay() {
        return "Razorpay";
    }
}

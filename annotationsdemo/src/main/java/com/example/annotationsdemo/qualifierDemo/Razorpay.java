package com.example.annotationsdemo.qualifierDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Razorpay implements PaymentType{
    @Override
    public String pay() {
        return "Razorpay";
    }
}

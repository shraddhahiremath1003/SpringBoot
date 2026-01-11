package com.example.annotationsdemo.qualifierDemo;

import org.springframework.stereotype.Component;

@Component
public class Stripe implements PaymentType{
    @Override
    public String pay() {
        return "Stripe";
    }
}

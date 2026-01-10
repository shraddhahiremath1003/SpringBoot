package com.example.SpringBootIoCandDIdemo;

import org.springframework.stereotype.Service;

@Service
public class Stripe implements PaymentService{
    @Override
    public String pay() {
        return "Stripe";
    }
}

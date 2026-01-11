package com.example.annotationsdemo.lazyinitializationDemo;

import com.example.annotationsdemo.qualifierDemo.Stripe;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class StripePaymentType implements PaymentServiceType{
    public StripePaymentType(){
        System.out.println("In Constructor "+getClass().getSimpleName());
    }
    @Override
    public String pay() {
        return "Stripe";
    }
}

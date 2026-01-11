package com.example.annotationsdemo.lazyinitializationDemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class RazorpayPaymentType implements PaymentServiceType{
    public RazorpayPaymentType(){
        System.out.println("In Constructor "+getClass().getSimpleName());
    }
    @Override
    public String pay() {
        return "Razorpay";
    }
}

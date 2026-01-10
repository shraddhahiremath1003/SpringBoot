package com.example.SpringBootIoCandDIdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootIoCandDIdemoApplication {

    //Constructor based dependency injection
    /*
    private final PaymentService paymentService;
    public SpringBootIoCandDIdemoApplication(PaymentService paymentService){
        this.paymentService=paymentService;
        System.out.println(paymentService.pay());
    }
    */

    //Setter Dependency Injection

    private Razorpay razorpayMethod;

    @Autowired
    public void setRazorpayMethod(Razorpay razorpay){
        this.razorpayMethod=razorpay;
        System.out.println(razorpayMethod.pay());
    }

    private Stripe stripe;

    @Autowired
    public void setStripeMethod(Stripe stripe){
        this.stripe=stripe;
        System.out.println(stripe.pay());
    }
	public static void main(String[] args) {

        SpringApplication.run(SpringBootIoCandDIdemoApplication.class, args);
	}

}

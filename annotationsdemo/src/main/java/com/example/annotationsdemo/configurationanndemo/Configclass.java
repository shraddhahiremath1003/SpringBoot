package com.example.annotationsdemo.configurationanndemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configclass {

    @Bean
    public PaymentService paymentService(){
        return new PaymentService();
    }
}

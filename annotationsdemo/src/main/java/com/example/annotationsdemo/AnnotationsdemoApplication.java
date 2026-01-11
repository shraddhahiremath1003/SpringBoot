package com.example.annotationsdemo;

import com.example.annotationsdemo.configurationanndemo.PaymentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnnotationsdemoApplication {

    //Configuration annotation
    private final PaymentService paymentService;
    public AnnotationsdemoApplication(PaymentService paymentService){
        this.paymentService=paymentService;
        System.out.println(paymentService.pay());
    }
	public static void main(String[] args) {

        SpringApplication.run(AnnotationsdemoApplication.class, args);
	}

}

package com.example.annotationsdemo;

import com.example.annotationsdemo.configurationanndemo.PaymentService;
import com.example.annotationsdemo.qualifierDemo.PaymentType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnnotationsdemoApplication {

    //Configuration annotation
    /*
    private final PaymentService paymentService;
    public AnnotationsdemoApplication(PaymentService paymentService){
        this.paymentService=paymentService;
        System.out.println(paymentService.pay());
    }
     */
    private final PaymentType paymentType;
    public AnnotationsdemoApplication(@Qualifier("stripe") PaymentType paymentType){
        this.paymentType=paymentType;
        System.out.println(paymentType.pay());
    }
	public static void main(String[] args) {

        SpringApplication.run(AnnotationsdemoApplication.class, args);
	}

}



package com.genie.SpringBootP03.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Flipkart  {
    @Autowired
//    jisak bean ka naam diya hu vhi chle ga incase of ambigituyt
    //compiler ka conusion dur krta haui
  @Qualifier("justPay")
    Paterns pat;
    @Value("${jdbc.url}")
    private String url;
    Flipkart(){
        System.out.println("FLipKart constructor");
    }

    public void paymentGateway(String  amount) {
        pat.payment(amount);
    }
}

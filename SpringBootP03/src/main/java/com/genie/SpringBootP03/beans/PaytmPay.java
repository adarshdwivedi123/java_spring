package com.genie.SpringBootP03.beans;

import org.springframework.stereotype.Component;

@Component
public class PaytmPay implements Paterns{
    PaytmPay(){
        System.out.println("PaytmPay construcotr");
    }
    @Override
    public void payment(String amount) {
        System.out.println("Paytm-pay Done"+amount);

    }
}

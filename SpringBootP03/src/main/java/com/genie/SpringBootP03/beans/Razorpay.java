package com.genie.SpringBootP03.beans;

import org.springframework.stereotype.Component;

@Component
public class Razorpay  implements  Paterns{
    @Override
    public void payment(String amount) {
        System.out.println("RazorPay-Done"+amount);

    }
}

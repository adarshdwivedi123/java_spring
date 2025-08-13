package com.genie.SpringBootP03.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//at class level lge ga
//@Primary
public class justPay  implements  Paterns{
    justPay(){
        System.out.println("justpay construcotr");
    }

    @Override
    public void payment(String  amount) {
        System.out.println(" Just-Paymeny Done"+amount);

    }
}

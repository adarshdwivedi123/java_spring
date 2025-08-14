package com.genie.SpringBootP01.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Mark java class as a spring bean
@Component

public class Car {
    @Autowired
    Petrol petrol;   //FIled Dependency INjection BYType
    public void m1(){
        petrol.start();
    }
}

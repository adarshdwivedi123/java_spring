package com.genie.SpringBootP01.beans;

import org.springframework.stereotype.Component;

@Component
public class Petrol  implements  IEngine{
    Petrol(){
        System.out.println("Petrol car started");
    }

    public void start(){
        System.out.println("Petrol car started");
    }
}

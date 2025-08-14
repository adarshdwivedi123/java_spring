package com.genie.SpringBootP01.beans;
import org.springframework.stereotype.Component;

@Component
public class Diesel  implements  IEngine{
    Diesel(){
        System.out.println("Diesel Car Started");
    }
    public void start(){
        System.out.println("Diesel car started");
    }
}


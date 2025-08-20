package com.genie.SpringSecuirty.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/start-quiz")
    public String m1(){
        return "Test";
    }

    @GetMapping("/contactUS")
    public String contactUS(){
        return "PhoneN):1234567";
    }


    @GetMapping("/updates")
    public String updates(){
        return "Car Interest drop upto 2%";
    }

    @GetMapping("/check")
    public String checkBalance(){
        return "100000";
    }

    @GetMapping("/transfer")
    public String transfer(){
        return "Transfer done .....";
    }
}

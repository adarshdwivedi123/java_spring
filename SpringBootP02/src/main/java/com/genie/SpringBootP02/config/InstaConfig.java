package com.genie.SpringBootP02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

//custom class ko hm aise bnte hai
//first we need declarer bean then
@Configuration
public class InstaConfig {
    @Bean
    public LocalDateTime getInstance()
    {

        return LocalDateTime.now();
    }

}

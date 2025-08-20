package com.genie.SpringSecurityWithDB.controller;

import com.genie.SpringSecurityWithDB.entity.UserEntity;
import com.genie.SpringSecurityWithDB.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
public class UserController {
    @Autowired
    UserRepo userRepo;
    @GetMapping("/admin")
    public  String adminKAmethod()
    {
        return  "main admin hu";
    }


    @GetMapping("/user")
    public  String userKAMethod()
    {
        return  "user  hu mai";
    }

    @GetMapping("/db")
    public Optional<UserEntity> dbKAMethod()
    {
        return  userRepo.findByEmail("manish@gmail.com");
    }



}

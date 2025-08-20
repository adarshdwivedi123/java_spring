package com.genie.SpringSecurityRoleBase_Auth.controller;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RoleController {

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public  String adminKAmethod()
    {
            return  "main admin hu";
    }

    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    @GetMapping("/user")
    public  String userKAMethod()
    {
        return  "user  hu mai";
    }
}

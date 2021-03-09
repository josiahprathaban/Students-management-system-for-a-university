package com.josiah.studentmanagementsystem.resource;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/admin")
public class AdminResource {
    
    @GetMapping("")
    public String welcomeAdmin(Authentication authentication){
        if (authentication != null)
            return authentication.getName();
        else
            return "";
    }
}

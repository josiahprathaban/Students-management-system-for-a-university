package com.josiah.studentmanagementsystem.resource;

import java.util.Collection;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/")
public class LoginResource {

    // @GetMapping("")
    // public String login(Authentication authentication) {
    //     return "kundikala";
    // }

    @GetMapping("")
    public Collection<? extends GrantedAuthority> login(Authentication authentication) {
        return authentication.getAuthorities();
    }
}

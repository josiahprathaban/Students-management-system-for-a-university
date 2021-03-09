package com.josiah.studentmanagementsystem.model;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class USMSUserDeteils implements UserDetails {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    private String usertype;

    public USMSUserDeteils(User user) {
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.usertype = user.getUsertype();
    }

    public USMSUserDeteils() {
    }

	@Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority(usertype)); 
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    
    
}

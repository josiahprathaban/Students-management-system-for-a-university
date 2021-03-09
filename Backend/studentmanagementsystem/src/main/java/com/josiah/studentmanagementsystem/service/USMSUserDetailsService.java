package com.josiah.studentmanagementsystem.service;

import java.util.Optional;

import com.josiah.studentmanagementsystem.model.USMSUserDeteils;
import com.josiah.studentmanagementsystem.model.User;
import com.josiah.studentmanagementsystem.repo.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class USMSUserDetailsService implements UserDetailsService {
@Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUsername(username);
        return user.map(USMSUserDeteils::new).get();
    }   
}

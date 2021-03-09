package com.josiah.studentmanagementsystem.repo;

import java.util.Optional;

import com.josiah.studentmanagementsystem.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}

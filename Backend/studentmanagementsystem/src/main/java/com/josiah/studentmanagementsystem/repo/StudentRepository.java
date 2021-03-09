package com.josiah.studentmanagementsystem.repo;

import java.util.Optional;

import com.josiah.studentmanagementsystem.model.Student;
import com.josiah.studentmanagementsystem.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer>{


	Optional<Student> findByUser(User user);

	Optional<Student> findByUser_username(String username);
    
}

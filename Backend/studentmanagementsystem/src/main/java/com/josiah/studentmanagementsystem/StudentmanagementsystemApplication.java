package com.josiah.studentmanagementsystem;

import com.josiah.studentmanagementsystem.repo.UserRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class StudentmanagementsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementsystemApplication.class, args);
	}

}

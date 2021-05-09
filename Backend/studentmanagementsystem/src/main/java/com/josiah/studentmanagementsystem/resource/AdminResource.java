package com.josiah.studentmanagementsystem.resource;

import com.josiah.studentmanagementsystem.model.Student;
import com.josiah.studentmanagementsystem.service.StudentService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/admin")
public class AdminResource {
    
    private final StudentService studentService;
    
    public AdminResource(StudentService studentService) {
        this.studentService = studentService;
    }
    
    @GetMapping("")
    public String welcomeAdmin(Authentication authentication){
            return authentication.getName();
    }

    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        Student newStudent = studentService.addStudent(student);
        return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
    }

    
}

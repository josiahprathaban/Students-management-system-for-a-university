package com.josiah.studentmanagementsystem.resource;

import java.util.Optional;

import com.josiah.studentmanagementsystem.model.Student;
import com.josiah.studentmanagementsystem.service.StudentService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentResource {

    private final StudentService studentService;

    public StudentResource(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("")
    public Optional<Student> getStudentByUsername(Authentication authentication) {
        return studentService.findByUser(authentication.getName());
    }

    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        Student newStudent = studentService.addStudent(student);
        return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public Optional<Student> getStudentById(@PathVariable("id") int id) {
        return studentService.findById(id);
    }

}

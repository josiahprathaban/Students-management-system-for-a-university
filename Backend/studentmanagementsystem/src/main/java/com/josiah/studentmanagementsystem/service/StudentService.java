package com.josiah.studentmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import com.josiah.studentmanagementsystem.model.Student;
import com.josiah.studentmanagementsystem.model.User;
import com.josiah.studentmanagementsystem.repo.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }

    public long count() {
        return studentRepository.count();
    }



    public void delete(Student student) {
        studentRepository.delete(student);
    }

    public void deleteById(Integer id) {
        studentRepository.deleteById(id);
    }



    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public List<Student> findAll(Sort sort) {
        return studentRepository.findAll(sort);
    }

    public Optional<Student> findById(Integer id) {
        return studentRepository.findById(id);
    }
    
    public Optional<Student> findByUser(String username) {
        return studentRepository.findByUser_username(username);
    }
    
    public Optional<Student> findByUser(User user) {
        return studentRepository.findByUser(user);
    }
}
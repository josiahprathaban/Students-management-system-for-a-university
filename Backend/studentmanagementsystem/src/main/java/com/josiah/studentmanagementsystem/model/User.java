package com.josiah.studentmanagementsystem.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

@Entity
public class User implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @Column(nullable = false, updatable = false)
    private String username;
    private String password;
    private String usertype;

    public User() {
    }

    public User(String username, String password, String usertype) {
        this.username = username;
        this.password = password;
        this.usertype = usertype;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    @Override
    public String toString() {
        return "User [password=" + password + ", username=" + username + ", usertype=" + usertype + "]";
    }


    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name = "user_student", 
      joinColumns = 
        { @JoinColumn(name = "user_username", referencedColumnName = "username") },
      inverseJoinColumns = 
        { @JoinColumn(name = "student_id", referencedColumnName = "id") })
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}

package com.josiah.studentmanagementsystem.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@Entity
public class Student implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @Column(nullable = false, updatable = false)
    private int id;
    private String name;
    private String nic;
    private String address;
    private int level;

    public Student(int id, String name, String nic, String address, int level, User user) {
        this.id = id;
        this.name = name;
        this.nic = nic;
        this.address = address;
        this.level = level;
        this.user = user;
    }
    
    public Student() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name = "user_student", 
      joinColumns = 
        { @JoinColumn(name = "student_id", referencedColumnName = "id") },
      inverseJoinColumns = 
        { @JoinColumn(name = "user_username", referencedColumnName = "username") })
    @JsonIgnoreProperties("student")
    private User user;
    

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Student [address=" + address + ", id=" + id + ", level=" + level + ", name=" + name + ", nic=" + nic
                + ", user=" + user + "]";
    }

}

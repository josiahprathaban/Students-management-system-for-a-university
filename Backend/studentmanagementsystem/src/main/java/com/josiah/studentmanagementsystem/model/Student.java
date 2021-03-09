package com.josiah.studentmanagementsystem.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

    @Override
    public String toString() {
        return "Student [Address=" + address + ", Id=" + id + ", Level=" + level + ", NIC=" + nic + ", Name=" + name
                + "]";
    }

    @JsonIgnore
    @OneToOne(mappedBy = "student",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}

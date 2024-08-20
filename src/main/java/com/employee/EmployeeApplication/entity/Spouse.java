package com.employee.EmployeeApplication.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "spouse")
public class Spouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String mobileNo;
    private int age;

    @OneToOne(mappedBy = "spouse")
    private Employee employee;

    public Spouse(int age, String name, String mobileNo) {
        this.age = age;
        this.name = name;
        this.mobileNo = mobileNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Spouse() {
    }
}

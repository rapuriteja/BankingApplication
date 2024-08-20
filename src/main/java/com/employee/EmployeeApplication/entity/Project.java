package com.employee.EmployeeApplication.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String clintName;

    @JsonIgnore
    @ManyToMany(mappedBy = "projects")
    private List<Employee> employees;

    public Project(String clintName, String name) {
        this.clintName = clintName;
        this.name = name;
    }

    public String getClintName() {
        return clintName;
    }

    public void setClintName(String clintName) {
        this.clintName = clintName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Project() {
    }

}

package com.example.dawd;

public class Employee {
    private String name;
    private String designation;
    private String salary;

    public String getName() {
        this.name = name;
        this.designation = designation;
        this.salary = salary;

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
